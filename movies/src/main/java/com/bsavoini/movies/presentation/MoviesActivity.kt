package com.bsavoini.movies.presentation

import android.os.Bundle
import com.bsavoini.base_features.BaseViewModelActivity
import com.bsavoini.movies.R
import kotlinx.android.synthetic.main.activity_movies.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MoviesActivity : BaseViewModelActivity() {
    private val viewModel: MoviesViewModel by viewModel()
    lateinit var adapter: MoviesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)
        initViewModelObservers()
        viewModel.listMovies()
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