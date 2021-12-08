package com.example.flightspacex.data.models

import java.io.Serializable
import java.sql.Timestamp


data class HistoricalEvent(
    val title: String,
    val id:Int,
    val event_date_utc: Timestamp,
    val event_date_unix: Int,
    val flight_number: Int,
    val details: String,// Ex: "Falcon 1 becomes the first privately developed liquid fuel rocket to reach Earth orbit.",
    val links: Links):Serializable
