package com.example.flightspacex.data.models

data class Cores(
    val core_serial: String,
    val flight: Int,
    val block: Int,
    val gridfins: Boolean,
    val legs: Boolean,
    val reused: Boolean,
    val land_success: Boolean,
    val landing_intent: Boolean,
    val landing_type: String,
    val landing_vehicle: String
)