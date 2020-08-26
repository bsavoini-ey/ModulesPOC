package com.bsavoini.interactor

import com.bsavoini.interactor.converters.toTvShowModel
import com.bsavoini.interactor.model.TvShowModel
import com.bsavoini.usecases.media.GetTvShowsUseCase

class TvShowsInteractor(private val getTvShowsUseCase: GetTvShowsUseCase) {

    fun listTvShow(): List<TvShowModel> =
        getTvShowsUseCase.execute(Unit).map {
            it.toTvShowModel()
        }
}