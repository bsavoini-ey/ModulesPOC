package com.bsavoini.modulespoc.presentation

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bsavoini.base_features.BaseViewModelActivity
import com.bsavoini.modulespoc.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : BaseViewModelActivity() {
    private val viewModel: MainViewModel by inject<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewModelObservers()
        addClickListeners()
        viewModel.listFavorites()
    }

    private fun initViewModelObservers() {
        viewModel.favorites.invokeOnChanged {
            list_favorites.adapter = MainAdapter(it)
        }
    }

    private fun addClickListeners() {
        btn_tv_shows.setOnClickListener {
            openTvShows()
        }

        btn_movies.setOnClickListener {
            openMovies()
        }
    }

    private fun openTvShows() {
        val intent = Intent().apply {
            data = Uri.parse("app://tv-shows")
        }
        startActivity(intent)
    }

    private fun openMovies() {
        val intent = Intent().apply {
            data = Uri.parse("app://movies")
        }
        startActivity(intent)
    }
}