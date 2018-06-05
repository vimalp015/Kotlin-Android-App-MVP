package com.au.vimalprakash.letspay.di.modules

import com.au.vimalprakash.letspay.LetsPayApplication
import com.au.vimalprakash.letspay.networking.LetsPayApi
import com.au.vimalprakash.letspay.utils.AndroidSchedulersProvider
import com.au.vimalprakash.letspay.utils.Helper.DATE_FORMAT_FROM_API
import com.au.vimalprakash.letspay.utils.SchedulersProvider
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class SupportModules(private var letsPayApplication: LetsPayApplication) {

    @Provides
    @Singleton
    fun providesApplication(): LetsPayApplication {
        return letsPayApplication
    }


    @Provides
    @Singleton
    fun provideOkHttpCache(application: LetsPayApplication): Cache {
        val cacheSize = 10 * 1024 * 1024 // 10 MiB
        return Cache(application.cacheDir, cacheSize.toLong())
    }

    @Provides
    @Singleton
    fun provideGson(): Gson {
        val gsonBuilder = GsonBuilder()
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        gsonBuilder.setDateFormat(DATE_FORMAT_FROM_API)
        return gsonBuilder.create()
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(cache: Cache): OkHttpClient {
        val httpClientBuilder = OkHttpClient.Builder()
        httpClientBuilder.cache(cache)
        return httpClientBuilder.build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(gson: Gson, okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(letsPayApplication.baseURL)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }

    @Provides
    @Singleton
    fun provideLetsPayAPI(retrofit: Retrofit): LetsPayApi {
        return retrofit.create(LetsPayApi::class.java)
    }

    @Provides
    @Singleton
    fun provideSchedulerProvider(): SchedulersProvider {
        return AndroidSchedulersProvider()
    }
}
