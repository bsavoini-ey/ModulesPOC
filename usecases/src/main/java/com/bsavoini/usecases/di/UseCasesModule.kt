package com.bsavoini.usecases.di

import com.bsavoini.usecases.favorite.AddFavoriteUseCase
import com.bsavoini.usecases.favorite.IsFavoriteUseCase
import com.bsavoini.usecases.favorite.ListFavoritesUseCase
import com.bsavoini.usecases.favorite.RemoveFavoriteUseCase
import com.bsavoini.usecases.media.GetMovieUseCase
import com.bsavoini.usecases.media.GetMoviesUseCase
import com.bsavoini.usecases.media.GetTvShowUseCase
import com.bsavoini.usecases.media.GetTvShowsUseCase
import org.koin.dsl.module

val useCasesModule = module {
    factory { GetMoviesUseCase(get()) }
    factory { GetMovieUseCase(get()) }
    factory { GetTvShowsUseCase(get()) }
    factory { GetTvShowUseCase(get()) }
    factory { AddFavoriteUseCase(get()) }
    factory { IsFavoriteUseCase(get()) }
    factory { RemoveFavoriteUseCase(get()) }
    factory { ListFavoritesUseCase(get()) }
}