package com.app.instascraper.features.home.model

data class TaggedUser(
    val full_name: String,
    val id: String,
    val is_verified: Boolean,
    val profile_pic_url: String,
    val username: String
)