package com.example.magiccardapp.data

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

// I believe this is for the specific card "Wear/Tear"
// GET https://api.scryfall.com/cards/0f279560-7e9f-4a6d-9fd6-6c8c6bd94a1b

interface MagicCardAPI {

    @GET ("cards/0f279560-7e9f-4a6d-9fd6-6c8c6bd94a1b")
    fun getCardInfo(): Response<CardInfo>


}