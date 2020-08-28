package com.bsavoini.movies.presentation

import android.os.Bundle
import com.bsavoini.base_features.BaseViewModelActivity
import com.bsavoini.movies.R
import kotlinx.android.synthetic.main.activity_movies.*
import org.koin.android.ext.android.inject

class MoviesActivity : BaseViewModelActivity() {
    private val viewModel: MoviesViewModel by inject<MoviesViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)
        initViewModelObservers()
        viewModel.listMovies()
    }

    private fun initViewModelObservers() {
        viewModel.movies.invokeOnChanged {
            list_movies.adapter = MoviesAdapter(it)
        }
    }

}