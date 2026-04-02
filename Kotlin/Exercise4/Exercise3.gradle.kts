import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.http.*

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