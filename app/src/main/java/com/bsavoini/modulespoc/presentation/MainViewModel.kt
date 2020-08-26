package com.bsavoini.modulespoc.presentation

import com.bsavoini.interactor.FavoritesInteractor
import com.bsavoini.interactor.MoviesInteractor
import com.bsavoini.interactor.model.MovieModel

class MainViewModel(
    private val favoritesInteractor: FavoritesInteractor
) {

    fun toggleFavorite(id: Int) {
        favoritesInteractor.toggleFavorite(id)
    }

    fun listFavorites() = favoritesInteractor.listFavorites()

}