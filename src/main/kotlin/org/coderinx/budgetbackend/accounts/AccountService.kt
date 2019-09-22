package org.coderinx.budgetbackend.accounts

import org.springframework.stereotype.*
import java.math.*

@Service
class AccountService {
    private val accounts = mutableListOf(Account("Discover", BigDecimal.valueOf(2000), "USD"))

    fun getAll(): List<Account> {
        return accounts
    }

    fun add(account: Account): Account {
        accounts.add(account)
        return account
    }
}

data class Account(
    val name: String,
    val amount: BigDecimal,
    val currency: String
)