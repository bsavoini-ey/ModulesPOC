package com.bsavoini.interactor

import com.bsavoini.usecases.media.GetTvShowsUseCase

class TvShowsInteractor(private val getTvShowsUseCase: GetTvShowsUseCase) {

     fun listTvShow() =
        getTvShowsUseCase.execute(Unit)

}