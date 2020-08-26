package com.bsavoini.movies.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bsavoini.movies.R
import org.koin.android.ext.android.inject

class MoviesActivity : AppCompatActivity() {
    private val viewModel: MoviesViewModel by inject<MoviesViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies_activity)

        viewModel.listMovies()
    }
}