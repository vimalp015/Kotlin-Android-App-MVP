package com.au.vimalprakash.letspay.networking.responsemodels

import android.os.Parcel
import android.os.Parcelable

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Location : Parcelable {

    @SerializedName("lat")
    @Expose
    var lat: Double? = null
    @SerializedName("lng")
    @Expose
    var lng: Double? = null

    constructor(){}

    protected constructor(`in`: Parcel) {
        this.lat = `in`.readValue(Double::class.java.classLoader) as Double
        this.lng = `in`.readValue(Double::class.java.classLoader) as Double
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(lat)
        dest.writeValue(lng)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        val CREATOR: Parcelable.Creator<Location> = object : Parcelable.Creator<Location> {


            override fun createFromParcel(`in`: Parcel): Location {
                return Location(`in`)
            }

            override fun newArray(size: Int): Array<Location?> {
                return arrayOfNulls(size)
            }

        }
    }

}
