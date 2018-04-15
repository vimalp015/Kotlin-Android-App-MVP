package com.au.vimalprakash.letspay.di.components

import com.au.vimalprakash.letspay.di.modules.SupportModules
import com.au.vimalprakash.letspay.networking.LetsPayApi
import com.au.vimalprakash.letspay.utils.SchedulersProvider
import com.google.gson.Gson
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(SupportModules::class))
interface SupportComponents {

    val accountDetailsApi: LetsPayApi

    val gson: Gson

    val schedulersProvider: SchedulersProvider
}
