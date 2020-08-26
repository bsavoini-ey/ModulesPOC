package com.bsavoini.network

import android.util.Log
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitFactory {
    fun build(httpClient: OkHttpClient, moshi: Moshi): TMDbApi = Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .client(httpClient)
        .build()
        .create(TMDbApi::class.java)
}

object ClientFactory {
    fun build(language: String): OkHttpClient = OkHttpClient.Builder()
        .addInterceptor { chain ->
            val originalRequest = chain.request()

            val newUrl = originalRequest.url().newBuilder()
                .addQueryParameter("api_key", BuildConfig.API_KEY)
                .addQueryParameter("language", language)
                .build()

            Log.d("TMDbApi", "request_url: $newUrl")

            val newRequest = originalRequest.newBuilder().url(newUrl).build()
            chain.proceed(newRequest)
        }.build()
}

object MoshiFactory {
    fun build(): Moshi = Moshi.Builder().build()
}