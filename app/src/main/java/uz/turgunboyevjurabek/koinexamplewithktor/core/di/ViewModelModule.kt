package uz.turgunboyevjurabek.koinexamplewithktor.core.di

import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module
import uz.turgunboyevjurabek.koinexamplewithktor.feature.presentation.vm.MyViewModel

val viewModelModule = module {
    viewModel { MyViewModel(get()) }
}