package uz.turgunboyevjurabek.koinexamplewithktor.feature.data.data_source.remote

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import uz.turgunboyevjurabek.koinexamplewithktor.feature.domein.madels.Month.TimeOfMonth
import uz.turgunboyevjurabek.koinexamplewithktor.feature.domein.madels.Week.TimeOfWeek
import uz.turgunboyevjurabek.koinexamplewithktor.feature.domein.madels.today.TimeOfToday

class ApiService(private val client: HttpClient, private val baseUrl: String) {
    /**
     * Bugungilik namoz vaqtalari
     */
    suspend fun getTodayTime(region:String): TimeOfToday {
        return client.get(baseUrl+"present/day"){
            parameter("region",region)
        }.body()
    }

    /**
     * Birhaftalik namoz vaqtlari
     */
    suspend fun getWeekTime(region:String): TimeOfWeek {
        return client.get(baseUrl+"present/week"){
            parameter("region",region)
        }.body()
    }

    /**
     * Biroylik namoz vaqtlari
     */
    suspend fun getMonthTime(region:String,month: Int = 10): TimeOfMonth {
        return client.get(baseUrl+"present/month"){
            parameter("region",region)
            parameter("month", month)
        }.body()

    }
}