package com.bsavoini.usecases.di

import com.bsavoini.usecases.favorite.AddFavoriteUseCase
import com.bsavoini.usecases.favorite.GetFavoriteUseCase
import com.bsavoini.usecases.favorite.RemoveFavoriteUseCase
import com.bsavoini.usecases.media.GetMoviesUseCase
import com.bsavoini.usecases.media.GetTvShowsUseCase
import org.koin.dsl.module

val useCasesModule = module {
    factory { GetMoviesUseCase(get()) }
    factory { GetTvShowsUseCase(get()) }
    factory { AddFavoriteUseCase(get()) }
    factory { GetFavoriteUseCase(get()) }
    factory { RemoveFavoriteUseCase(get()) }
}