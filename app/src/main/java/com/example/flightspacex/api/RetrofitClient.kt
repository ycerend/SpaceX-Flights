package com.example.flightspacex.api


import okhttp3.OkHttpClient

import retrofit2.converter.gson.GsonConverterFactory

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory.*



object RetrofitClient {

    //SpaceX api base url to consume API models
    private const val BASE_URL = "https://api.spacexdata.com/v3/"



    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor {chain ->
            val original = chain.request()

            val requestBuilder = original.newBuilder()
                .addHeader("Content-Type","application/json")
                .method(original.method,original.body)

            val request = requestBuilder.build()
            chain.proceed(request)
        }.build()

    val instance: SpaceXApiClient by lazy{
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(create())
            .client(okHttpClient)
            .build()

        retrofit.create(SpaceXApiClient ::class.java)
    }
}