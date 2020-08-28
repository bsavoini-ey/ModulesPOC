package com.bsavoini.usecases.media

import com.bsavoini.repository.MediaRepository
import com.bsavoini.usecases.BaseUseCase
import com.bsavoini.usecases.converter.toTvShowDO
import com.bsavoini.usecases.domainobjects.TvShowDO

class GetTvShowsUseCase(private val repository: MediaRepository) :
    BaseUseCase<List<TvShowDO>, Unit>() {

    override suspend fun getResult(params: Unit): List<TvShowDO> =
        repository.getTvShows().map {
            it.toTvShowDO()
        }
}

