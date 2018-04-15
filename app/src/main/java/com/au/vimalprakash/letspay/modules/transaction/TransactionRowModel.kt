package com.au.vimalprakash.letspay.modules.transaction

import com.au.vimalprakash.letspay.networking.responsemodels.AccountSummary
import com.au.vimalprakash.letspay.networking.responsemodels.TransactionCompleted
import com.au.vimalprakash.letspay.networking.responsemodels.TransactionPending
import com.au.vimalprakash.letspay.utils.Helper
import com.au.vimalprakash.letspay.utils.Helper.TransactionType
import java.util.*

class TransactionRowModel {

    var viewType: TransactionType

    var accountSummary: AccountSummary? = null

    var transactionHeader: TransactionHeader? = null

    var transactionCompleted: TransactionCompleted? = null

    var transactionPending: TransactionPending? = null

    constructor(accountSummary: AccountSummary, viewType: Helper.TransactionType) {
        this.accountSummary = accountSummary
        this.viewType = viewType
    }

    constructor(transactionDate: Date, transactionDuration: String, viewType: TransactionType) {
        transactionHeader = TransactionHeader(transactionDate, transactionDuration)
        this.viewType = viewType
    }

    constructor(transactionCompleted: TransactionCompleted, viewType: TransactionType) {
        this.transactionCompleted = transactionCompleted
        this.viewType = viewType
    }

    constructor(transactionPending: TransactionPending, viewType: TransactionType) {
        this.transactionPending = transactionPending
        this.viewType = viewType
    }

    class TransactionHeader(val transactionDate: Date, val transactionDuration: String)
}
