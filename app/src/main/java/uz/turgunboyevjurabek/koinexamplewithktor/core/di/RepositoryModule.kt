package uz.turgunboyevjurabek.koinexamplewithktor.core.di

import org.koin.dsl.module
import uz.turgunboyevjurabek.koinexamplewithktor.feature.data.repository_impl.MyRepositoryImpl
import uz.turgunboyevjurabek.koinexamplewithktor.feature.domein.repository.MyRepository

val repositoryModule = module {

    single<MyRepository> { MyRepositoryImpl(get()) }

}