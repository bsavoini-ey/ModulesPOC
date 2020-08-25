package com.bsavoini.usecases.favorite

import com.bsavoini.repository.FavoritesRepository
import com.bsavoini.usecases.BaseUseCase

class AddFavoriteUseCase(private val repository: FavoritesRepository) :
    BaseUseCase<Boolean, Int>() {

    override suspend fun getResult(id: Int): Boolean =
        repository.addFavorite(id)

}