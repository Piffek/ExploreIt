package com.piwko.exploreit

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExploreitApplication

fun main(args: Array<String>) {
    runApplication<ExploreitApplication>(*args)
}
