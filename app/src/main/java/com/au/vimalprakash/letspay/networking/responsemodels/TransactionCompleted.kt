package com.au.vimalprakash.letspay.networking.responsemodels

import android.os.Parcel
import android.os.Parcelable
import com.au.vimalprakash.letspay.utils.Helper
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

class TransactionCompleted : Parcelable, Transaction {

    @SerializedName("id")
    @Expose
    var id: String? = null
    @SerializedName("effectiveDate")
    @Expose
    override var effectiveDate: Date? = null
    @SerializedName("description")
    @Expose
    var description: String? = null
    @SerializedName("amount")
    @Expose
    var amount: Double? = null
    @SerializedName("atmId")
    @Expose
    var atmId: String? = null

    override val transactionType: Helper.TransactionType
        get() = Helper.TransactionType.COMPLETED_TRANSACTION

    constructor(){}

    protected constructor(`in`: Parcel) {
        this.id = `in`.readValue(String::class.java.classLoader) as String
        this.effectiveDate = `in`.readValue(String::class.java.classLoader) as Date
        this.description = `in`.readValue(String::class.java.classLoader) as String
        this.amount = `in`.readValue(Double::class.java.classLoader) as Double
        this.atmId = `in`.readValue(String::class.java.classLoader) as String
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(id)
        dest.writeValue(effectiveDate)
        dest.writeValue(description)
        dest.writeValue(amount)
        dest.writeValue(atmId)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        val CREATOR: Parcelable.Creator<TransactionCompleted> = object : Parcelable.Creator<TransactionCompleted> {


            override fun createFromParcel(`in`: Parcel): TransactionCompleted {
                return TransactionCompleted(`in`)
            }

            override fun newArray(size: Int): Array<TransactionCompleted?> {
                return arrayOfNulls(size)
            }

        }
    }

}