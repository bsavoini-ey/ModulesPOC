package com.bsavoini.tvshows

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.ext.android.inject

class TvShowActivity : AppCompatActivity() {
     private val viewModel: TvShowViewModel by inject<TvShowViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tv_show)

        viewModel.listTvShows()

    }
}