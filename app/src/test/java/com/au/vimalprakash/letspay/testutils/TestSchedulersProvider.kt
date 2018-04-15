package com.au.vimalprakash.letspay.testutils

import com.au.vimalprakash.letspay.utils.SchedulersProvider

import io.reactivex.Scheduler
import io.reactivex.annotations.NonNull
import io.reactivex.schedulers.Schedulers

/**
 * Our scheduler container that will make all schedulers as trampoline and hence will
 * end up making all calls Synchronous, which is required for our Unit Tests
 */

class TestSchedulersProvider : SchedulersProvider {
    @NonNull
    override fun mainUiThread(): Scheduler {
        return Schedulers.trampoline()
    }

    @NonNull
    override fun io(): Scheduler {
        return Schedulers.trampoline()
    }

    @NonNull
    override fun computation(): Scheduler {
        return Schedulers.trampoline()
    }

    @NonNull
    override fun immediate(): Scheduler {
        return Schedulers.trampoline()
    }
}