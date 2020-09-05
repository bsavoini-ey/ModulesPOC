package com.bsavoini.interactor.di

import com.bsavoini.interactor.*
import org.koin.dsl.module

val interactorModule = module {
    val baseImgUrl = BuildConfig.BASE_IMAGE_URL
    factory { FavoritesInteractor(get(), get(), get(), get(), baseImgUrl) }
    factory { MoviesInteractor(get(), get(), get(), get(), baseImgUrl) }
    factory { TvShowsInteractor(get(), get(), get(), get(), baseImgUrl) }
}