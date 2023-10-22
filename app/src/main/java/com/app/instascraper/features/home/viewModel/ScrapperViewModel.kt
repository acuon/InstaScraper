package com.app.instascraper.features.home.viewModel

import android.util.Log
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import com.app.instascraper.base.BaseViewModel
import com.app.instascraper.features.home.MainActivityNavigation
import com.app.instascraper.features.home.model.Item
import com.app.instascraper.features.home.repo.ScrapperRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class ScrapperViewModel @Inject constructor(private val scrapperRepository: ScrapperRepository) :
    BaseViewModel<MainActivityNavigation>() {

    val buttonText: ObservableField<String> = ObservableField("Fetch")

    val singlePost: ObservableField<Item?> = ObservableField()

    val apiCallFailed: ObservableField<Boolean> = ObservableField(false)
    val failureMessage: ObservableField<String> = ObservableField()

    val postImageUrl: ObservableField<String> = ObservableField("")
    val postLikesCount: ObservableField<String> = ObservableField("")
    val postCommentsCount: ObservableField<String> = ObservableField("")

    private var id = "3192233398968787123"

    fun onRefreshClick() {
        if (!getIsLoading().get()) {
            execute {
                apiCallFailed.set(false)
                setIsLoading(true)
                buttonText.set("Fetching")
                kotlin.runCatching {
                    scrapperRepository.getPosts()
                }.onSuccess {
                    val item = it?.items?.find { item ->
                        item.id == this.id
                    } ?: it?.items?.getOrNull(0)?.let { firstItem ->
                        this.id = firstItem.id
                        firstItem
                    }
                    singlePost.set(item)
                    postImageUrl.set(item?.displayUrl)
                    postLikesCount.set(item?.likesCount.toString())
                    postCommentsCount.set(item?.commentsCount.toString())
                }.onFailure {
                    apiCallFailed.set(true)
                    failureMessage.set(it.message)
                }
                setIsLoading(false)
                buttonText.set("Fetch")
            }
        }
    }

}