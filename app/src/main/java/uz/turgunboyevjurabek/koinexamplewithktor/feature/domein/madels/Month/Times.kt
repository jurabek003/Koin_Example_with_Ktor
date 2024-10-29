package uz.turgunboyevjurabek.koinexamplewithktor.feature.domein.madels.Month

import kotlinx.serialization.Serializable

@Serializable
data class Times(
    var asr: String?,
    var hufton: String?,
    var peshin: String?,
    var quyosh: String?,
    var shomIftor: String?,
    var tongSaharlik: String?
)