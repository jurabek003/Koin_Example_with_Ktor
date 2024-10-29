package uz.turgunboyevjurabek.koinexamplewithktor.feature.presentation.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import uz.turgunboyevjurabek.koinexamplewithktor.feature.domein.madels.today.TimeOfToday
import uz.turgunboyevjurabek.koinexamplewithktor.feature.domein.repository.MyRepository

class MyViewModel(private val repository: MyRepository) : ViewModel() {
    private val _todayTime = MutableStateFlow<TimeOfToday?>(null)
    val todayTime  = _todayTime.asStateFlow()

    init {
        getTodayTime()
    }

    private fun getTodayTime() {
        viewModelScope.launch {
            try {
                _todayTime.value = repository.getTodayTime("Farg'ona")
            }catch (e:Exception){
                println("obbo -> ${e.message}")
            }

        }
    }
}