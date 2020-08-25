package com.bsavoini.interactor

import com.bsavoini.usecases.favorite.AddFavoriteUseCase
import com.bsavoini.usecases.favorite.GetFavoriteUseCase
import com.bsavoini.usecases.favorite.RemoveFavoriteUseCase

class FavoritesInteractor(
    private val addFavoriteUseCase: AddFavoriteUseCase,
    private val removeFavoriteUseCase: RemoveFavoriteUseCase,
    private val getFavoriteUseCase: GetFavoriteUseCase
) {

    fun toggleFavorite(){

    }

    fun isFavorited(){
        getFavoriteUseCase.execute()
    }

}