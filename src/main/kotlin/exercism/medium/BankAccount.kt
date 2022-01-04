package exercism.medium

import java.util.concurrent.atomic.AtomicLong

class BankAccount {

    private var isOpen = true

    private var _balance = AtomicLong(0)
    val balance: Long
        get() {
            return if (isOpen) _balance.get()
            else throw IllegalStateException()
        }

    fun adjustBalance(amount: Long) {
        check(isOpen)
        _balance.addAndGet(amount)
    }

    fun close() {
        isOpen = false
    }
}
