package uz.turgunboyevjurabek.koinexamplewithktor.feature.domein.madels.Month

import kotlinx.serialization.Serializable


@Serializable
data class MonthItem(
    var date: String?=null,
    var day: Int?=null,
    var hijriDate: HijriDate?=null,
    var month: Int?=null,
    var region: String?=null,
    var regionNumber: Int?=null,
    var times: Times?=null,
    var weekday: String?=null
)