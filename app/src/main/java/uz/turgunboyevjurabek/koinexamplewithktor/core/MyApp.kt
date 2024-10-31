package uz.turgunboyevjurabek.koinexamplewithktor.core

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import uz.turgunboyevjurabek.koinexamplewithktor.core.di.networkModule
import uz.turgunboyevjurabek.koinexamplewithktor.core.di.repositoryModule
import uz.turgunboyevjurabek.koinexamplewithktor.core.di.viewModelModule

class MyApp:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(
                listOf(
                    networkModule,
                    repositoryModule,
                    viewModelModule
                )
            )
        }
    }
}