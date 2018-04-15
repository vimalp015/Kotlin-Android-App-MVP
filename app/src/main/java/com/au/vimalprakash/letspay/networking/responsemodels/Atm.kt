package com.au.vimalprakash.letspay.networking.responsemodels

import android.os.Parcel
import android.os.Parcelable

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Atm : Parcelable {

    @SerializedName("id")
    @Expose
    var id: String? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("address")
    @Expose
    var address: String? = null
    @SerializedName("location")
    @Expose
    var location: Location? = null

    constructor(){}

    protected constructor(`in`: Parcel) {
        this.id = `in`.readValue(String::class.java.classLoader) as String
        this.name = `in`.readValue(String::class.java.classLoader) as String
        this.address = `in`.readValue(String::class.java.classLoader) as String
        this.location = `in`.readValue(Location::class.java.classLoader) as Location
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(id)
        dest.writeValue(name)
        dest.writeValue(address)
        dest.writeValue(location)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        val CREATOR: Parcelable.Creator<Atm> = object : Parcelable.Creator<Atm> {


            override fun createFromParcel(`in`: Parcel): Atm {
                return Atm(`in`)
            }

            override fun newArray(size: Int): Array<Atm?> {
                return arrayOfNulls(size)
            }

        }
    }

}
