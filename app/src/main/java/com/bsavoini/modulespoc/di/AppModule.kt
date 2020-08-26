package com.bsavoini.modulespoc.di

import com.bsavoini.modulespoc.presentation.MainViewModel
import org.koin.dsl.module

val applicationModule = module {
    factory { MainViewModel(get()) }
}