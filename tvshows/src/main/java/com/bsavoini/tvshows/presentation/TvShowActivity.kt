package com.bsavoini.tvshows.presentation

import android.os.Bundle
import com.bsavoini.base_features.BaseViewModelActivity
import com.bsavoini.tvshows.R
import kotlinx.android.synthetic.main.activity_tv_show.*
import org.koin.android.ext.android.inject

class TvShowActivity : BaseViewModelActivity() {
     private val viewModel: TvShowViewModel by inject<TvShowViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tv_show)
        initViewModelObservers()
        viewModel.listTvShows()
    }

    private fun initViewModelObservers() {
        viewModel.tvShows.invokeOnChanged {
            list_tv_shows.adapter = TvShowsAdapter(it)
        }
    }
}