package com.example.flightspacex.data.models


import java.sql.Timestamp
import java.io.Serializable

data class AllCapsules(
    val capsule_serial:String,
    val capsule_id:String,
    val status:String,
    val original_launch:Timestamp,
    val missions:List<MissionModel>,
    val landings:Int,
    val type: String,
    val reuse_count: Int
)//:Serializable
