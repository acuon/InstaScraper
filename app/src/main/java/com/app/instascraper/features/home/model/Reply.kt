package com.app.instascraper.features.home.model

data class Reply(
    val id: String,
    val likesCount: Int,
    val ownerProfilePicUrl: String,
    val ownerUsername: String,
    val text: String,
    val timestamp: String
)