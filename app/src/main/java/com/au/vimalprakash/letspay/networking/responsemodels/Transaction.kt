package com.au.vimalprakash.letspay.networking.responsemodels

import com.au.vimalprakash.letspay.utils.Helper
import java.util.*

interface Transaction {

    val transactionType: Helper.TransactionType

    val effectiveDate: Date?
}
