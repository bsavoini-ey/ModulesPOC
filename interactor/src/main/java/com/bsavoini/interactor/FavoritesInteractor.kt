package com.bsavoini.interactor

import com.bsavoini.interactor.converters.toFavoriteModel
import com.bsavoini.interactor.model.FavoriteModel
import com.bsavoini.usecases.domainobjects.MediaTypeDO
import com.bsavoini.usecases.favorite.ListFavoritesUseCase
import com.bsavoini.usecases.media.GetMovieUseCase
import com.bsavoini.usecases.media.GetTvShowUseCase

class FavoritesInteractor(
    private val listFavoritesUseCase: ListFavoritesUseCase,
    private val getMovieUseCase: GetMovieUseCase,
    private val getTvShowUseCase: GetTvShowUseCase
) {

    suspend fun getFavorites(): List<FavoriteModel> =
        listFavoritesUseCase.execute(Unit).map { favorite ->
            val name: String
            val posterUrl: String

            when (favorite.mediaType) {
                MediaTypeDO.MOVIE -> getMovieUseCase.execute(favorite.id).let { movie ->
                    name = movie.name
                    posterUrl = movie.posterUrl
                }
                MediaTypeDO.TV_SHOW -> getTvShowUseCase.execute(favorite.id).let { tvShow ->
                    name = tvShow.name
                    posterUrl = tvShow.posterUrl
                }
            }

            favorite.toFavoriteModel(name, posterUrl)
        }
}