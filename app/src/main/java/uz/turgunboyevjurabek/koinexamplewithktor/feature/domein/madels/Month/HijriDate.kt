package uz.turgunboyevjurabek.koinexamplewithktor.feature.domein.madels.Month

import kotlinx.serialization.Serializable


@Serializable
data class HijriDate(
    var day: Int?,
    var month: String?
)