package com.laviola.battleritemirror.service

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Headers

interface BattleriteApi {

    companion object {
        fun create(): BattleriteApi {

            val retrofit = Retrofit.Builder()
                    .addCallAdapterFactory(
                            RxJava2CallAdapterFactory.create())
                    .addConverterFactory(
                            GsonConverterFactory.create())
                    .baseUrl("Teste")
                    .build()

            return retrofit.create(BattleriteApi::class.java)
        }
    }
}