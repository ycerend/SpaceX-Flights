package com.example.flightspacex.data.models

import java.io.Serializable

data class MissionModel(
    val mission_name:String= "",
    val mission_id:String = "" ,
    val manufacturers: List<String> =listOf(),
    val payload_ids: List<String> =listOf(),
    val wikipedia: String = "",
    val website: String = "",
    val twitter: String = "",
    val description: String = ""):Serializable

