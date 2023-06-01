package org.blacksmith.kotlinsnippets

import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional

@Component
class TransactionalRunner {
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    fun <T> transaction(block: () -> T) = block()

    @Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)
    fun <T> readOnlyTransaction(block: () -> T) = block()
}