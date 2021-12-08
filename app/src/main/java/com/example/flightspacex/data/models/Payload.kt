package com.example.flightspacex.data.models

import java.sql.Timestamp

data class Payload(
    val payload_id: String = "",
    val norad_id: List<Int> = listOf(),
    val reused: Boolean?= null,
    val customers: List<String> = listOf(),
    val nationality: String= "",
    val manufacturer: String= "",
    val payload_type:String= "",
    val payload_mass_kg: Double=-1.0,
    val payload_mass_lbs: Double=-1.0,
    val orbit: String = "",
    val orbit_params: OrbitParameters = OrbitParameters()
)
data class OrbitParameters(
    val reference_system: String="",
    val regime: String ="",
    val longitude: Double=-1.0,
    val semi_major_axis_km:Double=-1.0,
    val eccentricity:Double=-1.0,
    val periapsis_km:Double=-1.0,
    val apoapsis_km:Double=-1.0,
    val inclination_deg:Double =-1.0,
    val period_min:Double =-1.0,
    val lifespan_years:Int =-1,
    val epochval : Timestamp= Timestamp(1111),
    val mean_motion: Double =-1.0,
    val raan: Double =-1.0,
    val arg_of_pericenter: Double =-1.0,
    val mean_anomaly: Double =-1.0
)
