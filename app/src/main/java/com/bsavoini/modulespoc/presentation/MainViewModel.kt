package com.bsavoini.modulespoc.presentation

import com.bsavoini.interactor.FavoritesInteractor
import com.bsavoini.interactor.MoviesInteractor
import com.bsavoini.interactor.model.MovieModel

class MainViewModel(
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