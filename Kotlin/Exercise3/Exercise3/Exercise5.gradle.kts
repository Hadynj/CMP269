import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.Serializable

@Serializable
data class Stock(val symbol: String, val price: Double)

fun main() {
    embeddedServer(Netty, port = 8080) {

        install(ContentNegotiation) {
            json()
        }

        routing {
            get("/api/stock/{symbol}") {
                val symbol = call.parameters["symbol"] ?: "UNKNOWN"
                val stock = Stock(symbol, 150.25)
                call.respond(stock)
            }
        }

    }.start(wait = true)
}