package com.bsavoini.movies.presentation

import android.content.Context
import android.os.Bundle
import com.bsavoini.base_features.BaseViewModelActivity
import com.bsavoini.movies.R
import com.google.android.play.core.splitcompat.SplitCompat
import kotlinx.android.synthetic.main.activity_movies.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MoviesActivity : BaseViewModelActivity() {
    private val viewModel: MoviesViewModel by viewModel()
    private lateinit var adapter: MoviesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)
        title = getString(R.string.movies_title)
        showBackButton()
        initViewModelObservers()
        viewModel.listMovies()
    }

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(newBase)
        SplitCompat.installActivity(this)
    }

    private fun initViewModelObservers() {
        viewModel.movies.invokeOnChanged {
            adapter = MoviesAdapter(it, ::onClickFavorite)
            list_movies.adapter = adapter
        }
    }

    private fun onClickFavorite(id: Int) {
        viewModel.toggleFavorite(id)
    }
}