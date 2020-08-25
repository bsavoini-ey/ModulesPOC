package com.bsavoini.interactor

import com.bsavoini.interactor.model.TvShowModel
import com.bsavoini.usecases.TvShowDO
import com.bsavoini.usecases.media.GetTvShowsUseCase

class TvShowsInteractor(private val getTvShowsUseCase: GetTvShowsUseCase) {

    fun listTvShow(): List<TvShowModel> =
        getTvShowsUseCase.execute(Unit).map {
            it.toTvShowModel()
        }

    private fun TvShowDO.toTvShowModel() =
        TvShowModel(id, name)
}