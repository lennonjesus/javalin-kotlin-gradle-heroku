package com.lennonjesus.heroku

import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.get

fun main() {

    // get heroku port or uses default (for local environment)
    val port: Int = System.getenv("PORT")?.toIntOrNull() ?: 7000

    // starts Javalin
    val app = Javalin.create().apply {
        exception(Exception::class.java) { e, ctx -> e.printStackTrace() }
        error(404) { ctx -> ctx.json("Not found") }
    }.start(port)

    // app endpoints
    app.routes {
        get("/") { ctx ->
            ctx.status(200).result("Hello Javalin with Kotlin on Heroku!")
        }
    }

}