package com.bsavoini.repository.di

import com.bsavoini.repository.FavoritesRepositoryImpl
import com.bsavoini.repository.MediaRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    factory { MediaRepositoryImpl() }
    factory { FavoritesRepositoryImpl() }
}