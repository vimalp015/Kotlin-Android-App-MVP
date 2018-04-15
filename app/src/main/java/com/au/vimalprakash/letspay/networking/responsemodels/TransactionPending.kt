package com.au.vimalprakash.letspay.networking.responsemodels

import android.os.Parcel
import android.os.Parcelable
import com.au.vimalprakash.letspay.utils.Helper
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

class TransactionPending : Parcelable, Transaction {

    @SerializedName("id")
    @Expose
    var id: String? = null
    @SerializedName("description")
    @Expose
    var description: String? = null
    @SerializedName("effectiveDate")
    @Expose
    override var effectiveDate: Date? = null
    @SerializedName("amount")
    @Expose
    var amount: Double? = null

    override val transactionType: Helper.TransactionType
        get() = Helper.TransactionType.PENDING_TRANSACTION

    constructor(){}

    protected constructor(`in`: Parcel) {
        this.id = `in`.readValue(String::class.java.classLoader) as String
        this.description = `in`.readValue(String::class.java.classLoader) as String
        this.effectiveDate = `in`.readValue(String::class.java.classLoader) as Date
        this.amount = `in`.readValue(Double::class.java.classLoader) as Double
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(id)
        dest.writeValue(description)
        dest.writeValue(effectiveDate)
        dest.writeValue(amount)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        val CREATOR: Parcelable.Creator<TransactionPending> = object : Parcelable.Creator<TransactionPending> {


            override fun createFromParcel(`in`: Parcel): TransactionPending {
                return TransactionPending(`in`)
            }

            override fun newArray(size: Int): Array<TransactionPending?> {
                return arrayOfNulls(size)
            }

        }
    }
}