package org.coderinx.budgetbackend.accounts

import org.springframework.http.*
import org.springframework.web.bind.annotation.*

@RestController
class AccountController(
    private val accountService: AccountService
) {

    @GetMapping("accounts", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getAllAccounts(): List<Account> {
        return accountService.getAll()
    }

    @PostMapping(
        "accounts",
        consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun create(@RequestBody account: Account): Account {
        return accountService.add(account)
    }
}