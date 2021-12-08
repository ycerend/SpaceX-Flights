package com.example.flightspacex.data.models

import java.sql.Timestamp

data class Rocket(
    val id: Int?=-1,
    val active: Boolean?=null,
    val stages: Int?=-1,
    val boosters: Int?=-1,
    val cost_per_launch: Int? =-1,
    val success_rate_pct: Int? = -1,
    val first_flight: Timestamp? = Timestamp(1111),
    val country: String?="",
    val company: String? ="",
    val height: Height? = Height(),
    val diameter: Diameter? = Diameter(),
    val mass: Mass? = Mass(),
    val payload_weights : List<PayloadWeights>? = listOf(),
    val first_stage : FirstStage? = FirstStage(),
    val second_stage: SecondStage = SecondStage(),
    val engines: Engines? = Engines(),
    val landing_legs: LandingLegs? = LandingLegs(),
    val wikipedia: String?="", // "https://en.wikipedia.org/wiki/Falcon_9",
    val description: String?="", // "Falcon 9 is a two-stage rocket designed and manufactured by SpaceX for the reliable and safe transport of satellites and the Dragon spacecraft into orbit.",
    val rocket_id: String?="",
    val rocket_name: String?="",
    val rocket_type:String?="",
    val fairings: Fairing? = Fairing()
)

data class Height(val meters: Double = -1.0,val feet: Double =-1.0)
data class Diameter(val meters: Double= -1.0,val feet: Double= -1.0)
data class Mass(val kg:Double= -1.0,val lb: Double= -1.0)
data class PayloadWeights(val id:String="", val name: String="", val kg: Int= -1, val lb: Int= -1)
data class ThrustValues(val kN:Int= -1, val lbt: Int= -1)
data class Metrics(val height: Double= -1.0,val meters: Double= -1.0, val feet: Double= -1.0)
data class PayloadDetail(
    val option_1:String="",
    val option_2: String="",
    val composite_fairing: List<Metrics> = listOf())
data class FirstStage(
    val cores: List<Cores>? = listOf(),
    val reusable: Boolean? = null,
    val engines: String?="",
    val fuel_amount_tons: Int?=-1,
    val burn_time_sec: Int?=-1,
    val thrust_sea_level: ThrustValues? = ThrustValues(),
    val thrust_vacuum: ThrustValues?= ThrustValues())
data class SecondStage(
    val engines: Int =-1,
    val fuel_amount_tons: Int=-1,
    val burn_time_sec: Int=-1,
    val thrust: ThrustValues = ThrustValues(),
    val payloads: List<Payload> = listOf()
)

data class Engines(
    val block : Int?=-1,
    val payloads: List<Payload>?= listOf(),
    val number: Int=-1,
    val type: String="",
    val version: String="",
    val layout: String="",
    val engine_loss_max: Int=-1,
    val propellant_1: String="",
    val propellant_2: String="",
    val thrust_sea_level: ThrustValues= ThrustValues(),
    val thrust_vacuum: ThrustValues= ThrustValues(),
    val thrust_to_weight: Double=-1.0)

data class LandingLegs(val number: Int =-1, val material: String="")

data class Fairing(
    val reused: Boolean?= null,
    val recovery_attempt: Boolean? = null,
    val recovered: Boolean? = null,
    val ship: Int =0 //BAKBURAYA
)