package com.bsavoini.movies.presentation

import com.bsavoini.interactor.FavoritesInteractor
import com.bsavoini.interactor.MoviesInteractor
import com.bsavoini.interactor.model.MovieModel

class MoviesViewModel(
    private val moviesInteractor: MoviesInteractor,
    private val favoritesInteractor: FavoritesInteractor
) {
    fun listMovies() {
        val list: List<MovieModel> = moviesInteractor.listMovies()
    }

    fun toggleFavorite(id: Int) {
        favoritesInteractor.toggleFavorite(id)
    }

    fun isFavorite(id: Int) = favoritesInteractor.isFavorite(id)
}