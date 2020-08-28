package com.bsavoini.interactor

import com.bsavoini.interactor.converters.toTvShowModel
import com.bsavoini.interactor.model.TvShowModel
import com.bsavoini.usecases.domainobjects.FavoriteDO
import com.bsavoini.usecases.domainobjects.MediaTypeDO
import com.bsavoini.usecases.domainobjects.TvShowDO
import com.bsavoini.usecases.favorite.AddFavoriteUseCase
import com.bsavoini.usecases.favorite.IsFavoriteUseCase
import com.bsavoini.usecases.favorite.RemoveFavoriteUseCase
import com.bsavoini.usecases.media.GetTvShowsUseCase

class TvShowsInteractor(
    private val getTvShowsUseCase: GetTvShowsUseCase,
    private val addFavoriteUseCase: AddFavoriteUseCase,
    private val removeFavoriteUseCase: RemoveFavoriteUseCase,
    private val isFavoriteUseCase: IsFavoriteUseCase,
    private val baseImgUrl: String
) {
    suspend fun listTvShow(): List<TvShowModel> =
        getTvShowsUseCase.execute(Unit).map {
            it.toTvShowModel(isFavorite(it.id), baseImgUrl)
        }

    suspend fun toggleFavorite(id: Int) {
        val favoriteDO = FavoriteDO(id, MediaTypeDO.TV_SHOW)

        if (isFavorite(id)) {
            removeFavoriteUseCase.execute(favoriteDO)
        } else {
            addFavoriteUseCase.execute(favoriteDO)
        }
    }

    private suspend fun isFavorite(id: Int) =
        isFavoriteUseCase.execute(
            IsFavoriteUseCase.Params(id = id, mediaType = MediaTypeDO.TV_SHOW)
        )
}