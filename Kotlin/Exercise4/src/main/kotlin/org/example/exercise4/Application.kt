package org.example.exercise4

import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.server.routing.routing

fun main() {
    embeddedServer(Netty, port = 8080) {
        routing {
            qrRoute()
        }
    }.start(wait = true)
}
