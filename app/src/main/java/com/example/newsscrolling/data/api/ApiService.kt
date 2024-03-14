package com.example.newsscrolling.data.api

import com.example.newsscrolling.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines")
    suspend fun getNewsHeadLine(
        @Query("country") country : String,
        @Query("apiKey") apiKey : String = "YOUR_API_HERE"

    ) : Response<NewsResponse>
}


// GET https://newsapi.org/v2/top-headlines?country=us&apiKey=YOUR_API