package ru.desk.newsapp2.models

data class NewsResponce(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)