package com.bsavoini.usecases.favorite

import com.bsavoini.repository.FavoritesRepository
import com.bsavoini.usecases.BaseUseCase
import com.bsavoini.usecases.converter.toFavoriteEntity
import com.bsavoini.usecases.domainobjects.FavoriteDO

class AddFavoriteUseCase(private val repository: FavoritesRepository) :
    BaseUseCase<Unit, FavoriteDO>() {

    override suspend fun getResult(favoriteDO: FavoriteDO) =
        repository.addFavorite(favoriteDO.toFavoriteEntity())

}