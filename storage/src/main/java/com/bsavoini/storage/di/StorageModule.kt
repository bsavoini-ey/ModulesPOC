package com.bsavoini.storage.di

import com.bsavoini.storage.MediasDatabaseBuilder
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module


val storageModule = module {
    single { MediasDatabaseBuilder(androidContext()).build().favoritesDao() }
}
