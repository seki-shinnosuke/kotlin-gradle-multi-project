package com.example.batch

import com.example.common.extension.toFormatString
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import java.time.LocalDateTime
import kotlin.system.exitProcess

@SpringBootApplication(
    scanBasePackages = [
        "com.example.common",
        "com.example.batch"
    ]
)
@ConfigurationPropertiesScan(
    basePackages = [
        "com.example.common",
        "com.example.batch"
    ]
)
class BatchApplication : CommandLineRunner {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val context = runApplication<BatchApplication>(*args) {
                webApplicationType = WebApplicationType.NONE
            }
            exitProcess(SpringApplication.exit(context))
        }
    }

    override fun run(vararg args: String?) {
        val nowString = LocalDateTime.now().toFormatString("yyyy/MM/dd HH:mm:ss")
        println("Kotlin Multi Project: BATCHアプリケーション実行日時:$nowString")
    }
}