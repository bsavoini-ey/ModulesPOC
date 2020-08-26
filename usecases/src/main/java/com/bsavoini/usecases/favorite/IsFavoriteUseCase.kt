package com.bsavoini.usecases.favorite

import com.bsavoini.repository.FavoritesRepository
import com.bsavoini.repository.models.MediaTypeEntity
import com.bsavoini.usecases.BaseUseCase
import com.bsavoini.usecases.domainobjects.MediaTypeDO

class IsFavoriteUseCase(private val repository: FavoritesRepository) :
    BaseUseCase<Boolean, IsFavoriteUseCase.Params>() {

    override suspend fun getResult(params: Params): Boolean =
        repository.isFavorite(params.id, MediaTypeEntity.valueOf(params.mediaType.name))

    data class Params(
        val id: Int,
        val mediaType: MediaTypeDO
    )
}