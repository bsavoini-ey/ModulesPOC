package com.bsavoini.usecases.media

import com.bsavoini.repository.MediaRepository
import com.bsavoini.repository.TvShowEntity
import com.bsavoini.usecases.BaseUseCase
import com.bsavoini.usecases.TvShowDO

class GetTvShowsUseCase(private val repository: MediaRepository) :
    BaseUseCase<List<TvShowDO>, Unit>() {

    override fun getResult(params: Unit): List<TvShowDO> =
        repository.getTvShows().map {
            it.toTvShowDO()
        }

    private fun TvShowEntity.toTvShowDO() =
        TvShowDO(this.id, this.name)

}

