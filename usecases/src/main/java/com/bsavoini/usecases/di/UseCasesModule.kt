package com.bsavoini.usecases.di

import com.bsavoini.usecases.favorite.AddFavoriteUseCase
import com.bsavoini.usecases.favorite.GetFavoriteUseCase
import com.bsavoini.usecases.favorite.RemoveFavoriteUseCase
import org.koin.dsl.module

val useCasesModule = module {
    factory { AddFavoriteUseCase(get()) }
    factory { GetFavoriteUseCase(get()) }
    factory { RemoveFavoriteUseCase(get()) }
}