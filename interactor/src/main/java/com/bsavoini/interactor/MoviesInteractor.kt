package com.bsavoini.interactor

import com.bsavoini.interactor.converters.toMovieModel
import com.bsavoini.interactor.model.MovieModel
import com.bsavoini.usecases.domainobjects.FavoriteDO
import com.bsavoini.usecases.domainobjects.MediaTypeDO
import com.bsavoini.usecases.favorite.AddFavoriteUseCase
import com.bsavoini.usecases.favorite.IsFavoriteUseCase
import com.bsavoini.usecases.favorite.RemoveFavoriteUseCase
import com.bsavoini.usecases.media.GetMoviesUseCase

class MoviesInteractor(
    private val moviesUseCase: GetMoviesUseCase,
    private val addFavoriteUseCase: AddFavoriteUseCase,
    private val removeFavoriteUseCase: RemoveFavoriteUseCase,
    private val isFavoriteUseCase: IsFavoriteUseCase,
    private val baseImgUrl: String
) {
    suspend fun listMovies(): List<MovieModel> =
        moviesUseCase.execute(Unit).map {
            it.toMovieModel(isFavorite(it.id), baseImgUrl)
        }

    suspend fun toggleFavorite(id: Int) {
        val favoriteDO = FavoriteDO(id, MediaTypeDO.MOVIE)

        if (isFavorite(id)) {
            removeFavoriteUseCase.execute(favoriteDO)
        } else {
            addFavoriteUseCase.execute(favoriteDO)
        }
    }

    private suspend fun isFavorite(id: Int) =
        isFavoriteUseCase.execute(
            IsFavoriteUseCase.Params(id = id, mediaType = MediaTypeDO.MOVIE)
        )
}