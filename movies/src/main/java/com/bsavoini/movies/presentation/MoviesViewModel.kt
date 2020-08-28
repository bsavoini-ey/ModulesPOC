package com.bsavoini.movies.presentation

import android.util.Log
import com.bsavoini.base_features.BaseViewModel
import com.bsavoini.interactor.FavoriteMoviesInteractor
import com.bsavoini.interactor.MoviesInteractor
import com.bsavoini.interactor.model.MovieModel

class MoviesViewModel(
    private val moviesInteractor: MoviesInteractor,
    private val favoritesMoviesInteractor: FavoriteMoviesInteractor
) : BaseViewModel() {

    fun listMovies() {
        launchBackgroundJob({
            val list: List<MovieModel> = moviesInteractor.listMovies()
            Log.d("svn", "list: $list")
        })
    }

    fun toggleFavorite(id: Int) {
        launchBackgroundJob({
            favoritesMoviesInteractor.toggleFavorite(id)
        })
    }
}