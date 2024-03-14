package com.example.newsscrolling.data.entity

import java.util.UUID

data class NewsResponse(
    val status: String,
    val totalResults: Int,
    val articles: List<Article>
)

data class Article(
    val author: String?,
    val title: String?,
    val description: String?,
    val url: String?,
    val urlToImage: String?,
    val publishedAt: String?,
    val content: String?,
    val source: Source?
) {
    val generatedAuthor: String = author ?: "Unknown Author"
    val generatedTitle: String = title ?: "Undefined Title"
    val generatedDescription: String = description ?: "No description available"
    val generatedUrl: String = url ?: "Undefined"
    val generatedUrlToImage: String = urlToImage ?: "Undefined"
    val generatedPublishedAt: String = publishedAt ?: "Undefined"
    val generatedContent: String = content ?: "Undefined"
    val generatedSource: Source = source ?: Source("default_id", "Unknown Source")
}


data class Source(
    val id: String?,
    val name: String
) {
    val generatedId: String = id ?: generateRandomId()

    private fun generateRandomId(): String {
        // Generate a random ID using UUID
        return UUID.randomUUID().toString()
    }
}
