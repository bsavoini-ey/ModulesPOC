package com.bsavoini.movies.di

import com.bsavoini.movies.presentation.MoviesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.KoinContextHandler
import org.koin.dsl.module

val moviesModule = module {
    viewModel { MoviesViewModel(KoinContextHandler.get().get()) }
}