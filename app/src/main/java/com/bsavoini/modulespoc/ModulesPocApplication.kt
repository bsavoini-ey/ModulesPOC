package com.bsavoini.modulespoc

import android.app.Application
import com.bsavoini.dependencyinjection.projectModules
import com.bsavoini.modulespoc.di.applicationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ModulesPocApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ModulesPocApplication)
            modules(applicationModule + projectModules)
        }
    }
}