package com.bsavoini.interactor

import com.bsavoini.usecases.domainobjects.FavoriteDO
import com.bsavoini.usecases.domainobjects.MediaTypeDO
import com.bsavoini.usecases.favorite.AddFavoriteUseCase
import com.bsavoini.usecases.favorite.IsFavoriteUseCase
import com.bsavoini.usecases.favorite.RemoveFavoriteUseCase

class FavoriteMoviesInteractor(
    private val addFavoriteUseCase: AddFavoriteUseCase,
    private val removeFavoriteUseCase: RemoveFavoriteUseCase,
    private val isFavoriteUseCase: IsFavoriteUseCase
) {

    fun toggleFavorite(id: Int): Boolean {
        val favoriteDO = FavoriteDO(id, MediaTypeDO.MOVIE)

        return if (isFavorite(id)) {
            removeFavoriteUseCase.execute(favoriteDO)
        } else {
            addFavoriteUseCase.execute(favoriteDO)
        }
    }

    fun isFavorite(id: Int): Boolean =
        isFavoriteUseCase.execute(IsFavoriteUseCase.Params(id, MediaTypeDO.MOVIE))

}