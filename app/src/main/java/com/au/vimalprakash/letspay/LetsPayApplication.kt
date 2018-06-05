package com.au.vimalprakash.letspay

import android.app.Application

import com.au.vimalprakash.letspay.di.components.ActivityComponents
import com.au.vimalprakash.letspay.di.components.DaggerActivityComponents
import com.au.vimalprakash.letspay.di.components.DaggerSupportComponents
import com.au.vimalprakash.letspay.di.modules.ActivityModules
import com.au.vimalprakash.letspay.di.modules.SupportModules


class LetsPayApplication : Application() {

    val baseURL = "https://raw.githubusercontent.com/vimalp015/"
    private var activityComponents: ActivityComponents? = null

    val components: ActivityComponents
        get() {
            if (activityComponents == null) {
                val supportComponents = DaggerSupportComponents.builder().supportModules(SupportModules(this)).build()

                activityComponents = DaggerActivityComponents.builder().supportComponents(supportComponents)
                        .activityModules(ActivityModules())
                        .build()
            }

            return activityComponents!!
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
