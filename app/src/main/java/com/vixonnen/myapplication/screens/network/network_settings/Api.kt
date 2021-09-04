package com.vixonnen.myapplication.screens.network.network_settings

import com.vixonnen.myapplication.screens.models.RequestPages
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("search/photos")
    suspend fun getPhotos(@Query("search") search:String) : Call<MutableList<RequestPages>>
}