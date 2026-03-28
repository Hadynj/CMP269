import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty, port = 8080) {
        routing {
            // Root route
            get("/") {
                call.respondText("Server is online at Lehman College.")
            }

            // Dynamic route with path parameter
            get("/greet/{name}") {
                val name = call.parameters["name"] ?: "Guest"
                call.respondText("Hello, $name! Welcome to CMP 269.")
            }
        }
    }.start(wait = true)
}