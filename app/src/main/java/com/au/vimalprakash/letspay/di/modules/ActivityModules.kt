package com.au.vimalprakash.letspay.di.modules

import com.au.vimalprakash.letspay.di.components.PerActivity
import com.au.vimalprakash.letspay.modules.mainactivity.MainAcivityContract
import com.au.vimalprakash.letspay.modules.mainactivity.MainActivityPresenter
import com.au.vimalprakash.letspay.modules.transaction.TransactionContract
import com.au.vimalprakash.letspay.modules.transaction.TransactionPresenter
import com.au.vimalprakash.letspay.networking.LetsPayApi
import com.au.vimalprakash.letspay.utils.SchedulersProvider

import dagger.Module
import dagger.Provides

@Module
class ActivityModules {

    @Provides
    @PerActivity
    fun provideMainActivityPresenter(): MainAcivityContract.Presenter {
        return MainActivityPresenter()
    }

    @Provides
    @PerActivity
    fun getTransactionPresenter(letsPayApi: LetsPayApi, schedulersProvider: SchedulersProvider): TransactionContract.Presenter {
        return TransactionPresenter(letsPayApi, schedulersProvider)
    }
}
