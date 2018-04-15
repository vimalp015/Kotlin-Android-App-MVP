package com.au.vimalprakash.letspay.utils

import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.*

/**
 * Any methods and variables used throughout the app needs to be defined here.
 * In large projects, we further split the Helper into various objects based on the functionalities
 */

object Helper {

    val DATE_FORMAT_FROM_API = "dd/MM/yyyy"

    private val DATE_FORMAT_TO_DISPLAY = "dd MMM yyyy"

    fun formatDateToDisplay(date: Date): String {
        return SimpleDateFormat(DATE_FORMAT_TO_DISPLAY, Locale.UK).format(date).toUpperCase()
    }

    fun replaceHtml(htmlString: String): String {
        return htmlString.replace("<br/>", "\n")
    }

    fun getCurrencyString(amount: Double?): String {
        return NumberFormat.getCurrencyInstance(Locale.US).format(amount)
    }

    enum class TransactionType(val value: Int) {
        ACCOUNT_SUMMARY(0),
        TRANSACTION_HEADER(1),
        PENDING_TRANSACTION(2),
        COMPLETED_TRANSACTION(3)
    }
}