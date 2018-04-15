package com.au.vimalprakash.letspay.networking.responsemodels

import android.os.Parcel
import android.os.Parcelable

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ServerResponse : Parcelable {

    @SerializedName("account")
    @Expose
    var account: AccountSummary? = null
    @SerializedName("transactions")
    @Expose
    var transactionCompleteds: List<TransactionCompleted>? = null
    @SerializedName("pending")
    @Expose
    var transactionPending: List<TransactionPending>? = null
    @SerializedName("atms")
    @Expose
    var atms: List<Atm>? = null

    constructor(){}

    protected constructor(`in`: Parcel) {
        this.account = `in`.readValue(AccountSummary::class.java.classLoader) as AccountSummary
        `in`.readList(this.transactionCompleteds, TransactionCompleted::class.java.classLoader)
        `in`.readList(this.transactionPending, TransactionPending::class.java.classLoader)
        `in`.readList(this.atms, Atm::class.java.classLoader)
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(account)
        dest.writeList(transactionCompleteds)
        dest.writeList(transactionPending)
        dest.writeList(atms)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        val CREATOR: Parcelable.Creator<ServerResponse> = object : Parcelable.Creator<ServerResponse> {


            override fun createFromParcel(`in`: Parcel): ServerResponse {
                return ServerResponse(`in`)
            }

            override fun newArray(size: Int): Array<ServerResponse?> {
                return arrayOfNulls(size)
            }

        }
    }

}
