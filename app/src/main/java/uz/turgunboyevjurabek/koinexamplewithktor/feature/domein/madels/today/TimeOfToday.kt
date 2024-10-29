package uz.turgunboyevjurabek.koinexamplewithktor.feature.domein.madels.today

import kotlinx.serialization.Serializable

@Serializable
data class TimeOfToday(
    val date: String?,
    val region: String?,
    val times: Times?,
    val weekday: String?
)