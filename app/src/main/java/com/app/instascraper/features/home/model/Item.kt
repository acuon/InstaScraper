package com.app.instascraper.features.home.model

data class Item(
    val alt: Any,
    val caption: String,
    val childPosts: List<Any>,
    val commentsCount: Int,
    val dimensionsHeight: Int,
    val dimensionsWidth: Int,
    val displayUrl: String,
    val firstComment: String,
    val hashtags: List<String>,
    val id: String,
    val images: List<Any>,
    val isSponsored: Boolean,
    val latestComments: List<LatestComment>,
    val likesCount: Int,
    val locationId: String,
    val locationName: String,
    val mentions: List<String>,
    val ownerFullName: String,
    val ownerId: String,
    val ownerUsername: String,
    val shortCode: String,
    val taggedUsers: List<TaggedUser>,
    val timestamp: String,
    val type: String,
    val url: String
)