package com.ascstb.mangaapp3.core

import android.app.Application
import com.ascstb.mangaapp3.BuildConfig
import com.ascstb.mangaapp3.di.apiModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            if (BuildConfig.DEBUG) androidLogger()
            androidContext(this@MyApp)
            /*modules(
                apiModule
            )*/
        }
    }
}