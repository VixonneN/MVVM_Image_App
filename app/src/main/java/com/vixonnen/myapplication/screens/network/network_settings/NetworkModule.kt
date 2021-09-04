package com.vixonnen.myapplication.screens.network.network_settings

import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkModule() {

    //TODO переделать
    private var api: Api? = null
    fun networkModule() {
        val interceptor: Interceptor = provideRequestInterceptor()
        val okHttpClient: OkHttpClient = provideOkHttp(interceptor)
        val retrofit: Retrofit = provideRetrofit(okHttpClient)
        api = provideApi(retrofit)
    }

    private fun provideApi(retrofit: Retrofit): Api {
        return retrofit.create(Api::class.java)
    }

    private fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit{
        return Retrofit.Builder()
            .baseUrl(API_HOST)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

    private fun provideOkHttp(interceptor: Interceptor): OkHttpClient {
        val loggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        return OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()
    }

    private fun provideRequestInterceptor(): Interceptor {
        return Interceptor { chain ->
            val originalRequest: Request = chain.request()
            val newUrl: HttpUrl = originalRequest.url().newBuilder()
                .addQueryParameter("client_id", CLIENT_ID)
                .build()
            val newRequest: Request = originalRequest.newBuilder()
                .url(newUrl)
                .build()
            chain.proceed(newRequest)
        }
    }

    companion object {
        private const val API_HOST = "https://api.unsplash.com/"
        private const val CLIENT_ID =
            "NsldGPHbyAlZcutqmkOuEXqL4BS0r6i4Hu-xTTOPQeM" // Put your own clientId here.
        private val INSTANCE: NetworkModule = NetworkModule()
        val apiInstance: Api
            get() = INSTANCE.api!!
    }
}