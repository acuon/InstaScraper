package com.app.instascraper.features.home.model

data class LatestComment(
    val id: String,
    val likesCount: Int,
    val ownerProfilePicUrl: String,
    val ownerUsername: String,
    val replies: List<Reply>,
    val repliesCount: Int,
    val text: String,
    val timestamp: String
)