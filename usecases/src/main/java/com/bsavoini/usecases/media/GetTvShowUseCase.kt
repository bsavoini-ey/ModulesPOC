package com.bsavoini.usecases.media

import com.bsavoini.repository.MediaRepository
import com.bsavoini.usecases.BaseUseCase
import com.bsavoini.usecases.converter.toTvShowDO
import com.bsavoini.usecases.domainobjects.TvShowDO

class GetTvShowUseCase(private val repository: MediaRepository) :
    BaseUseCase<TvShowDO, Int>() {

    override suspend fun getResult(id: Int): TvShowDO =
        repository.getTvShow(id).toTvShowDO()
}