package com.bsavoini.modulespoc

import com.bsavoini.dependencyinjection.projectModules
import com.bsavoini.modulespoc.di.applicationModule
import com.google.android.play.core.splitcompat.SplitCompatApplication
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ModulesPocApplication : SplitCompatApplication() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ModulesPocApplication)
            modules(applicationModule + projectModules)
        }
    }
}