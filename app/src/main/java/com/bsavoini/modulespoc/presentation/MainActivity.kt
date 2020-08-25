package com.bsavoini.modulespoc.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bsavoini.modulespoc.R
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    val viewModel: MainViewModel by inject<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.isFavorite(0)
        viewModel.listMovies()
        viewModel.listTvShows()
        viewModel.toggleFavorite(0)


    }
}