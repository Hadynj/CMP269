import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.http.content.*

fun main() {
    embeddedServer(Netty, port = 8080) {
        routing {
            // Existing routes
            get("/") {
                call.respondText("Server is online at Lehman College.")
            }

            get("/greet/{name}") {
                val name = call.parameters["name"] ?: "Guest"
                call.respondText("Hello, $name! Welcome to CMP 269.")
            }

            get("/grade/{studentId}") {
                val grades = mapOf("123" to 95, "456" to 82)
                val studentId = call.parameters["studentId"]
                val grade = studentId?.let { grades[it] }

                if (grade != null) {
                    call.respondText("Student ID: $studentId, Grade: $grade")
                } else {
                    call.respond(io.ktor.http.HttpStatusCode.NotFound, "Student not found")
                }
            }

            // Static content route
            staticResources("/static", "static")
        }
    }.start(wait = true)
}