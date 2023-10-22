package com.app.instascraper.data.remote

import com.app.instascraper.features.home.model.ScrapedData
import retrofit2.http.GET
import retrofit2.http.POST

interface ScrapperService {

    @GET("getData")
    suspend fun getPosts(): ScrapedData?
}