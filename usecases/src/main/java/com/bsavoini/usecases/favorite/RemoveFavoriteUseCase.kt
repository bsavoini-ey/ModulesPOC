package com.bsavoini.usecases.favorite

import com.bsavoini.repository.FavoritesRepository
import com.bsavoini.usecases.BaseUseCase
import com.bsavoini.usecases.converter.toFavoriteEntity
import com.bsavoini.usecases.domainobjects.FavoriteDO

class RemoveFavoriteUseCase(private val repository: FavoritesRepository) :
    BaseUseCase<Boolean, FavoriteDO>() {

    override fun getResult(favorite: FavoriteDO): Boolean =
        repository.removeFavorite(favorite.toFavoriteEntity())

}