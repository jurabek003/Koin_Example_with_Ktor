package uz.turgunboyevjurabek.koinexamplewithktor.feature.domein.madels.today

import kotlinx.serialization.Serializable

@Serializable
data class Times(
    val asr: String,
    val hufton: String,
    val peshin: String,
    val quyosh: String,
    val shom_iftor: String,
    val tong_saharlik: String
)