package com.app.instascraper

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class ScrapperApp : Application() {
    var appContext: ScrapperApp? = null
        private set

    override fun onCreate() {
        super.onCreate()
        appContext = this
    }
}
