package com.vixonnen.myapplication.screens.network

import com.vixonnen.myapplication.screens.network.network_settings.NetworkModule

class NetworkRepository(private val networkModule: NetworkModule) {



    suspend fun getImageRequest(query: String) = networkModule.networkModule()
}