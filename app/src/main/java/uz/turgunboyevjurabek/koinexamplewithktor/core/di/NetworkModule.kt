package uz.turgunboyevjurabek.koinexamplewithktor.core.di

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module
import uz.turgunboyevjurabek.koinexamplewithktor.feature.data.data_source.remote.ApiService

val networkModule = module {
    single { androidApplication().applicationContext }

    single { "https://islomapi.uz/api/" }

    single {
        HttpClient(CIO){
            install(ContentNegotiation){
                json(
                    Json {
                        prettyPrint=true
                        isLenient=true
                        ignoreUnknownKeys=true
                    }
                )

            }
            install(Logging){
                level=LogLevel.INFO
            }
        }
    }
    single { ApiService(get(),get()) }
}
