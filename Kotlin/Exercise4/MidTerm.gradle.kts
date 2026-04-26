package com.example

import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.http.content.*
import kotlinx.serialization.Serializable
import com.google.zxing.BarcodeFormat
import com.google.zxing.client.j2se.MatrixToImageWriter
import com.google.zxing.qrcode.QRCodeWriter
import java.io.ByteArrayOutputStream
import java.util.concurrent.ConcurrentHashMap

// 1. DATA MODELING (Kotlin Fundamentals)
@Serializable
data class Student(
    val id: String,
    val name: String,
    val major: String?,      // Nullable as per requirements
    val accessLevel: Int
)


fun main() {
    // 2. THREAD-SAFE DATABASE
    val studentDb = ConcurrentHashMap<String, Student>().apply {
        put("12345", Student("12345", "Alice Smith", "Computer Science", 5))
        put("67890", Student("67890", "Bob Jones", null, 3))    // Will test Elvis operator
    }

    embeddedServer(Netty, port = 8080) {
        module(studentDb)
    }.start(wait = true)
}

fun Application.module(studentDb: ConcurrentHashMap<String, Student>) {

    // 3. CONTENT NEGOTIATION (JSON API)
    install(ContentNegotiation) {
        json()
    }

    routing {

        // A. STATIC PORTAL
        staticResources("/", "static")

        // B. STUDENT API
        get("/api/student/{id}") {
            val id = call.parameters["id"]

            if (id == null) {
                call.respond(HttpStatusCode.BadRequest, "Missing student ID")
                return@get
            }

            val student = studentDb[id]

            if (student == null) {
                call.respond(HttpStatusCode.NotFound, "Student not found")
                return@get
            }

            // Elvis operator for null major
            val safeStudent = student.copy(
                major = student.major ?: "Undecided"
            )

            call.respond(safeStudent)
        }

        // C. QR GENERATOR (Query Parameters & Image Response)
        get("/generate-id") {
            val sid = call.request.queryParameters["sid"]

            if (sid == null) {
                call.respond(HttpStatusCode.BadRequest, "Missing sid parameter")
                return@get
            }

            val student = studentDb[sid]

            if (student == null) {
                call.respond(HttpStatusCode.NotFound, "Student not found")
                return@get
            }

            // Data inside QR
            val content = "${student.id}|${student.accessLevel}"

            val writer = QRCodeWriter()
            val bitMatrix = writer.encode(content, BarcodeFormat.QR_CODE, 300, 300)

            val outputStream = ByteArrayOutputStream()
            MatrixToImageWriter.writeToStream(bitMatrix, "PNG", outputStream)

            call.respondBytes(
                bytes = outputStream.toByteArray(),
                contentType = ContentType.Image.PNG
            )
        }
    }
}