package com.app.instascraper.features.home.activity

import android.os.Bundle
import android.util.Log
import android.view.View
import com.app.instascraper.BR
import com.app.instascraper.R
import com.app.instascraper.base.BaseActivity
import com.app.instascraper.databinding.ActivityMainBinding
import com.app.instascraper.features.home.MainActivityNavigation
import com.app.instascraper.features.home.viewModel.ScrapperViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity(
    override val layoutId: Int = R.layout.activity_main,
    override val bindingVariable: Int = BR.vm
) : BaseActivity<ActivityMainBinding, ScrapperViewModel>(), MainActivityNavigation {

    private val TAG = "MainActivity"

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = getViewDataBinding()
        viewModel.setNavigator(this)
    }

    override fun onViewClicked(view: View?) {

    }

    override fun handleError(throwable: Throwable?) {
        Log.e(TAG, "Api call FAiled", throwable)
    }
}
