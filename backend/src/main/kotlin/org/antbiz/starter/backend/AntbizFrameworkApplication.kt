package org.antbiz.starter.backend

import io.github.cdimascio.dotenv.dotenv
import org.antbiz.antbiz_framework.framework.EnableAntBizFramework
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories


val dotenv = dotenv {
    ignoreIfMissing = true
    filename = "../.env"
}

@SpringBootApplication
@EnableAntBizFramework
// @EnableJpaRepositories(basePackages = ["org.antbiz.starter.backend.repository"])
@EntityScan(basePackages = ["org.antbiz.starter.backend.entity"])
class AntbizFrameworkApplication

fun main(args: Array<String>) {
    val envVars = mapOf<String, String>()

    runApplication<AntbizFrameworkApplication>(*args) {
        setDefaultProperties(envVars)
    }
}
