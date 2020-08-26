package com.bsavoini.usecases.favorite

import com.bsavoini.repository.FavoritesRepository
import com.bsavoini.usecases.BaseUseCase
import com.bsavoini.usecases.converter.toFavoriteDO
import com.bsavoini.usecases.domainobjects.FavoriteDO

class ListFavoritesUseCase(private val repository: FavoritesRepository) :
    BaseUseCase<List<FavoriteDO>, Unit>() {

    override suspend fun getResult(params: Unit) =
        repository.listFavorites().map {
            it.toFavoriteDO()
        }

}