package com.bsavoini.network.di

import com.bsavoini.network.ClientFactory
import com.bsavoini.network.MoshiFactory
import com.bsavoini.network.RetrofitFactory
import org.koin.dsl.module
import java.util.*

val networkModule = module {
    single { ClientFactory.build(Locale.getDefault().language) }
    single { MoshiFactory.build() }
    single { RetrofitFactory.build(get(), get()) }
}