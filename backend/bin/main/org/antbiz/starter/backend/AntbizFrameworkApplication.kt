package org.antbiz.starter.backend

import io.github.cdimascio.dotenv.dotenv
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


val dotenv = dotenv {
    ignoreIfMissing = true
    filename = "../.env"
}

@SpringBootApplication
class AntbizFrameworkApplication

fun main(args: Array<String>) {
    val envVars = mapOf<String, String>()

    runApplication<AntbizFrameworkApplication>(*args) {
        setDefaultProperties(envVars)
    }
}
