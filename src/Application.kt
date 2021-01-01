package com.artemas.example

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.serialization.*
import com.artemas.example.com.artemas.example.routes.registerCustomerRoutes

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    install(ContentNegotiation) {
        json()
    }

    registerCustomerRoutes()
}
