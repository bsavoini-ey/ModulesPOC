package com.bsavoini.tvshows.di

import com.bsavoini.tvshows.TvShowViewModel
import org.koin.dsl.module

val tvShowModule = module {
    factory { TvShowViewModel(get(), get()) }
}