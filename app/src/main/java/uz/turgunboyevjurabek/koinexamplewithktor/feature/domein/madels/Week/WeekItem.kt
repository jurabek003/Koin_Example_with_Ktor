package uz.turgunboyevjurabek.koinexamplewithktor.feature.domein.madels.Week

import kotlinx.serialization.Serializable


@Serializable
data class WeekItem(
    var date: String?=null,
    var hijriDate: HijriDate?=null,
    var region: String?=null,
    var times: Times?=null,
    var weekday: String?= null
)