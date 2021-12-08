package com.example.flightspacex.data.models

import java.io.Serializable
import java.sql.Timestamp

data class Launch(
val flight_number:Int =-1,
val mission_name: String = "",
val mission_id: List<String> = listOf(),
val launch_year: String = "",
val launch_date_unix: Int = -1,
val launch_date_utc: Timestamp = Timestamp(1111),
val launch_date_local: Timestamp =Timestamp(1111), // "2018-07-22T01:50:00-04:00",
val is_tentative:Boolean= false,
val tentative_max_precision: String = "",
val tbd: Boolean = false,
val launch_window: Int = -1,
val rocket: Rocket,
val ships: List<String> = listOf(),
val telemetry: Telemetry,
val launch_site: LaunchSite,
val launch_success: Boolean,
val links: Links,
val details: String= "",
val upcoming: Boolean = false,
val static_fire_date_utc: Timestamp = Timestamp(1111),
val static_fire_date_unix: Int = -1,
val timeline : Timeline = Timeline()):Serializable

data class Timeline(
    val webcast_liftoff: Int =-1,
    val go_for_prop_loading: Int=-1,
    val rp1_loading: Int=-1,
    val stage1_lox_loading: Int=-1,
    val stage2_lox_loading: Int=-1,
    val engine_chill: Int=-1,
    val prelaunch_checks: Int=-1,
    val propellant_pressurization: Int=-1,
    val go_for_launch: Int=-1,
    val ignition: Int=-1,
    val liftoff: Int=-1,
    val maxq: Int=-1,
    val meco: Int=-1,
    val stage_sep: Int=-1,
    val fairing_deploy: Int=-1,
    val first_stage_entry_burn: Int=-1,
    val seco_1: Int=-1,
    val first_stage_landing: Int=-1,
    val second_stage_restart: Int=-1,
    val seco_2: Int=-1,
    val payload_deploy: Int=-1)

data class LaunchSite(
    val site_id:String ="",
    val site_name:String="",
    val site_name_long: String="")

data class Telemetry(val fight_club: String="")
