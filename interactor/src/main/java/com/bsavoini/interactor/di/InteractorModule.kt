package com.bsavoini.interactor.di

import com.bsavoini.interactor.FavoritesInteractor
import com.bsavoini.interactor.MoviesInteractor
import com.bsavoini.interactor.TvShowsInteractor
import org.koin.dsl.module

val interactorModule = module {
    factory { FavoritesInteractor(get(), get(), get()) }
    factory { MoviesInteractor(get()) }
    factory { TvShowsInteractor(get()) }
}