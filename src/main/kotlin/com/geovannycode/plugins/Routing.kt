package com.geovannycode.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.routing
import io.ktor.server.routing.get


fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hola Mundo!")
        }
    }
}
