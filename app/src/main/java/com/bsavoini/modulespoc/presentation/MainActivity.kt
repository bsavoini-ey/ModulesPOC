package com.bsavoini.modulespoc.presentation

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bsavoini.modulespoc.R
import com.bsavoini.tvshows.TvShowActivity
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by inject<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.isFavorite(0)
        viewModel.listMovies()
        viewModel.toggleFavorite(0)

        val intent = Intent().apply {
            data = Uri.parse("app://tv-show")
        }

        startActivity(intent)

    }
}