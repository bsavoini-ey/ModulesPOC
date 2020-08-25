package com.bsavoini.modulespoc

import android.app.Application
import com.bsavoini.interactor.di.interactorModule
import com.bsavoini.modulespoc.di.applicationModule
import com.bsavoini.repository.di.repositoryModule
import com.bsavoini.usecases.di.useCasesModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ModulesPocApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ModulesPocApplication)
            modules(applicationModule, interactorModule, useCasesModule, repositoryModule)
        }
    }
}