package com.ascstb.mangaapp3.di

import com.ascstb.repository.ApiClient
import org.koin.dsl.module

val apiModule = module {
    single { ApiClient.createOkHttpClient() }
}