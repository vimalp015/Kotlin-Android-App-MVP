package com.au.vimalprakash.letspay.networking


import com.au.vimalprakash.letspay.networking.responsemodels.ServerResponse

import io.reactivex.Single
import retrofit2.http.GET

/**
 * The interface for the Retrofit. Since we have integrated RxJava with Retro, we can return Observables
 */

interface LetsPayApi {

    @get:GET("letspay/master/data.json")
    val accountDetails: Single<ServerResponse>
}
