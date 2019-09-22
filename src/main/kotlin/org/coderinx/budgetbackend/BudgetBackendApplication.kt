package org.coderinx.budgetbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.*

@SpringBootApplication
class BudgetBackendApplication

fun main(args: Array<String>) {
    runApplication<BudgetBackendApplication>(*args)
}

@RestController
class Controller {

    @GetMapping
    fun hello(): String {
        return "Hello!"
    }
}