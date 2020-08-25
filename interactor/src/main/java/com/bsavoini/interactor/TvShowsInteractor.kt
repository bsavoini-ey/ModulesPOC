package com.bsavoini.interactor

import com.bsavoini.usecases.media.GetTvShowsUseCase

class TvShowsInteractor(private val getTvShowsUseCase: GetTvShowsUseCase) {

    suspend fun listTvShow() =
        getTvShowsUseCase.execute(Unit)

}