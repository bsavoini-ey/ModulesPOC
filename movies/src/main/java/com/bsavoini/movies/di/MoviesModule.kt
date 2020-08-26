package com.bsavoini.movies.di

import com.bsavoini.movies.presentation.MoviesViewModel
import org.koin.dsl.module

val moviesModule = module {
    factory { MoviesViewModel(get(), get()) }
}