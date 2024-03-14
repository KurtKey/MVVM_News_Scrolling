package com.example.newsscrolling.data.datasource

import com.example.newsscrolling.data.api.ApiService
import com.example.newsscrolling.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class NewsDataSourceImpl @Inject constructor(
    private val apiService: ApiService
) : NewsDataSource {
    override suspend fun getNewsHeadLine(country: String): Response<NewsResponse> {
        return apiService.getNewsHeadLine(country)
    }

}