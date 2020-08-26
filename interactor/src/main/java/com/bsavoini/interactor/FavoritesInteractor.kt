package com.bsavoini.interactor

import com.bsavoini.interactor.converters.toFavoriteModel
import com.bsavoini.interactor.model.FavoriteModel
import com.bsavoini.usecases.favorite.ListFavoritesUseCase

class FavoritesInteractor(private val listFavoritesUseCase: ListFavoritesUseCase) {

    fun listFavorites(): List<FavoriteModel> =
        listFavoritesUseCase.execute(Unit).map {
            it.toFavoriteModel()
        }

}