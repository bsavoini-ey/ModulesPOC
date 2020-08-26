package com.bsavoini.interactor.di

import com.bsavoini.interactor.*
import org.koin.dsl.module

val interactorModule = module {
    factory { FavoritesInteractor(get()) }
    factory { FavoriteMoviesInteractor(get(), get(), get()) }
    factory { FavoriteTvShowsInteractor(get(), get(), get()) }
    factory { MoviesInteractor(get(), get()) }
    factory { TvShowsInteractor(get(), get()) }
}