package uz.turgunboyevjurabek.koinexamplewithktor.feature.domein.repository

import uz.turgunboyevjurabek.koinexamplewithktor.feature.domein.madels.Month.TimeOfMonth
import uz.turgunboyevjurabek.koinexamplewithktor.feature.domein.madels.Week.TimeOfWeek
import uz.turgunboyevjurabek.koinexamplewithktor.feature.domein.madels.today.TimeOfToday

interface MyRepository {

    suspend fun getTodayTime(region: String): TimeOfToday
    suspend fun getWeekTime(region: String): TimeOfWeek
    suspend fun getMonthTime(region: String): TimeOfMonth


}