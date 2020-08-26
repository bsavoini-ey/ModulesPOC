package com.bsavoini.interactor

import com.bsavoini.interactor.converters.toTvShowModel
import com.bsavoini.interactor.model.TvShowModel
import com.bsavoini.usecases.domainobjects.MediaTypeDO
import com.bsavoini.usecases.domainobjects.TvShowDO
import com.bsavoini.usecases.favorite.IsFavoriteUseCase
import com.bsavoini.usecases.media.GetTvShowsUseCase

class TvShowsInteractor(
    private val getTvShowsUseCase: GetTvShowsUseCase,
    private val isFavoriteUseCase: IsFavoriteUseCase
) {

    fun listTvShow(): List<TvShowModel> =
        getTvShowsUseCase.execute(Unit).map {
            it.toTvShowModel(isFavorite(it))
        }

    private fun isFavorite(tvShowDO: TvShowDO) =
        isFavoriteUseCase.execute(
            IsFavoriteUseCase.Params(
                id = tvShowDO.id,
                mediaType = MediaTypeDO.TV_SHOW
            )
        )
}