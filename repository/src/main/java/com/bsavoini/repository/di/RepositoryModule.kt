package com.bsavoini.repository.di

import com.bsavoini.repository.FavoritesRepository
import com.bsavoini.repository.FavoritesRepositoryImpl
import com.bsavoini.repository.MediaRepository
import com.bsavoini.repository.MediaRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single { MediaRepositoryImpl(get()) as MediaRepository}
    single { FavoritesRepositoryImpl() as FavoritesRepository}
}