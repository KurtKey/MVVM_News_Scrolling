package com.example.newsscrolling.data.datasource

import com.example.newsscrolling.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET

interface NewsDataSource {

    @GET("v2/top-headlines")
    suspend fun getNewsHeadLine(country : String) : Response<NewsResponse>
}