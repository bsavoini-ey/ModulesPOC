package com.bsavoini.movies.di

import org.koin.dsl.koinApplication


val moviesKoinApplication = koinApplication {
    modules(moviesModule)
}