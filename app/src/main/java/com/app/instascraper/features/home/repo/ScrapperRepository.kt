package com.app.instascraper.features.home.repo

import com.app.instascraper.data.remote.ScrapperService
import com.app.instascraper.features.home.model.ScrapedData
import javax.inject.Inject

class ScrapperRepository @Inject constructor(private val scrapperService: ScrapperService) {

    suspend fun getPosts(): ScrapedData? {
        return scrapperService.getPosts()
    }

}