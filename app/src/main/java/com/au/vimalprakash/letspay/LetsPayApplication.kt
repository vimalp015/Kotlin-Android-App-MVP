package com.au.vimalprakash.letspay

import android.app.Application

import com.au.vimalprakash.letspay.di.components.ActivityComponents
import com.au.vimalprakash.letspay.di.components.DaggerActivityComponents
import com.au.vimalprakash.letspay.di.components.DaggerSupportComponents
import com.au.vimalprakash.letspay.di.modules.ActivityModules
import com.au.vimalprakash.letspay.di.modules.SupportModules


class LetsPayApplication : Application() {

    val baseURL = "https://raw.githubusercontent.com/vimalp015/"
    private var mActivityComponents: ActivityComponents? = null

    val activityComponents: ActivityComponents
        get() {
            if (mActivityComponents == null) {
                val supportComponents = DaggerSupportComponents.builder().supportModules(SupportModules(this)).build()

                mActivityComponents = DaggerActivityComponents.builder().supportComponents(supportComponents)
                        .activityModules(ActivityModules())
                        .build()
            }

            return mActivityComponents!!
        }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        var instance: LetsPayApplication? = null
            private set
    }

}
