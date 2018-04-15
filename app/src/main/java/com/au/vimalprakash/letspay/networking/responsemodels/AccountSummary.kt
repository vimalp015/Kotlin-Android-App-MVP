package com.au.vimalprakash.letspay.networking.responsemodels

import android.os.Parcel
import android.os.Parcelable

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class AccountSummary : Parcelable {

    @SerializedName("accountName")
    @Expose
    var accountName: String? = null
    @SerializedName("accountNumber")
    @Expose
    var accountNumber: String? = null
    @SerializedName("available")
    @Expose
    var available: Double? = null
    @SerializedName("balance")
    @Expose
    var balance: Double? = null

    constructor(){}

    protected constructor(`in`: Parcel) {
        this.accountName = `in`.readValue(String::class.java.classLoader) as String
        this.accountNumber = `in`.readValue(String::class.java.classLoader) as String
        this.available = `in`.readValue(Double::class.java.classLoader) as Double
        this.balance = `in`.readValue(Double::class.java.classLoader) as Double
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(accountName)
        dest.writeValue(accountNumber)
        dest.writeValue(available)
        dest.writeValue(balance)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        val CREATOR: Parcelable.Creator<AccountSummary> = object : Parcelable.Creator<AccountSummary> {


            override fun createFromParcel(`in`: Parcel): AccountSummary {
                return AccountSummary(`in`)
            }

            override fun newArray(size: Int): Array<AccountSummary?> {
                return arrayOfNulls(size)
            }

        }
    }
}