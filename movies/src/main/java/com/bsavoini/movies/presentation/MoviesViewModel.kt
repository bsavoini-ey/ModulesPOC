package com.bsavoini.movies.presentation

import com.bsavoini.interactor.FavoriteMoviesInteractor
import com.bsavoini.interactor.MoviesInteractor
import com.bsavoini.interactor.model.MovieModel

class MoviesViewModel(
    private val moviesInteractor: MoviesInteractor,
    private val favoritesMoviesInteractor: FavoriteMoviesInteractor
) {
    fun listMovies() {
        val list: List<MovieModel> = moviesInteractor.listMovies()
    }

    fun toggleFavorite(id: Int) {
        favoritesMoviesInteractor.toggleFavorite(id)
    }

    fun isFavorite(id: Int) = favoritesMoviesInteractor.isFavorite(id)
}