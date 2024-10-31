package uz.turgunboyevjurabek.koinexamplewithktor.feature.data.repository_impl

import uz.turgunboyevjurabek.koinexamplewithktor.feature.data.data_source.remote.ApiService
import uz.turgunboyevjurabek.koinexamplewithktor.feature.domein.madels.Month.TimeOfMonth
import uz.turgunboyevjurabek.koinexamplewithktor.feature.domein.madels.Week.TimeOfWeek
import uz.turgunboyevjurabek.koinexamplewithktor.feature.domein.madels.today.TimeOfToday
import uz.turgunboyevjurabek.koinexamplewithktor.feature.domein.repository.MyRepository

class MyRepositoryImpl(private val apiService: ApiService):MyRepository {
    
    override suspend fun getTodayTime(region: String): TimeOfToday {
        return apiService.getTodayTime(region)
    }

    override suspend fun getWeekTime(region: String): TimeOfWeek {
        return apiService.getWeekTime(region)
    }

    override suspend fun getMonthTime(region: String): TimeOfMonth {
        return apiService.getMonthTime(region)
    }

}