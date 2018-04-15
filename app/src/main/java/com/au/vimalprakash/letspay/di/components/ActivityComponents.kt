package com.au.vimalprakash.letspay.di.components

import com.au.vimalprakash.letspay.di.modules.ActivityModules
import com.au.vimalprakash.letspay.modules.mainactivity.MainActivity
import com.au.vimalprakash.letspay.modules.transaction.TransactionFragment

import dagger.Component

@PerActivity
@Component(dependencies = arrayOf(SupportComponents::class), modules = arrayOf(ActivityModules::class))
interface ActivityComponents {

    fun inject(activity: MainActivity)

    fun inject(fragment: TransactionFragment)
}