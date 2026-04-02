package org.example.exercise4

import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.header
import io.ktor.server.response.respond
import io.ktor.server.response.respondBytes
import io.ktor.server.routing.Route
import io.ktor.server.routing.get

fun Route.qrRoute() {
    get("/qr") {
        val text = call.request.queryParameters["text"]

        if (text.isNullOrBlank()) {
            call.respond(HttpStatusCode.BadRequest, "Missing 'text' query parameter")
            return@get
        }

        val outputStream = generateQRCodeStream(text)

        call.response.header(HttpHeaders.ContentType, "image/png")
        call.respondBytes(outputStream.toByteArray())
    }
}
