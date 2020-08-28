package com.bsavoini.repository.di

import com.bsavoini.repository.*
import org.koin.dsl.module

val repositoryModule = module {
    single { MediaRepositoryImpl(get()) as MediaRepository}
    single { FavoritesRepositoryImpl(get()) as FavoritesRepository}
}