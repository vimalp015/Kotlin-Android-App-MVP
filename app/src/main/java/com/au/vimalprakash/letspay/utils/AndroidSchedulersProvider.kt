package com.au.vimalprakash.letspay.utils

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * This class acts as a container for all Schedulers.
 * This will allow us to easily replace the below with Trampoline when writing Unit Tests.
 */

class AndroidSchedulersProvider : SchedulersProvider {
    override fun mainUiThread(): Scheduler {
        return AndroidSchedulers.mainThread()
    }

    override fun io(): Scheduler {
        return Schedulers.io()
    }

    override fun computation(): Scheduler {
        return Schedulers.computation()
    }

    override fun immediate(): Scheduler {
        return Schedulers.trampoline()
    }
}
