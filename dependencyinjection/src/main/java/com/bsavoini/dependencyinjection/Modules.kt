package com.bsavoini.dependencyinjection

import com.bsavoini.interactor.di.interactorModule
import com.bsavoini.repository.di.repositoryModule
import com.bsavoini.tvshows.di.tvShowModule
import com.bsavoini.usecases.di.useCasesModule

val projectModules = listOf(
    tvShowModule, interactorModule, useCasesModule, repositoryModule
)