package com.example.magiccardapp.retrofit

import com.example.magiccardapp.data.MagicCardAPI
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    const val baseURL = "https://api.scryfall.com/"

    val api: MagicCardAPI by lazy {
        Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MagicCardAPI::class.java)

    }
}