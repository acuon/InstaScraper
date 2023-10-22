package com.app.instascraper.features.home.model

data class ScrapedData(
    val count: Int,
    val desc: Boolean,
    val items: List<Item>,
    val limit: Long,
    val offset: Int,
    val total: Int
)