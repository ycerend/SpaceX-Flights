package com.example.flightspacex.api

import com.example.flightspacex.data.models.*
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*
interface SpaceXApiClient {

    @Headers("Content-Type: application/json")
    @GET("history")
    fun getAllHistoricalEvents():Call<List<HistoricalEvent>>

    @Headers("Content-Type: application/json")
    @GET("launches/latest")
    fun getLatestLaunch():Call<Launch>

    @Headers("Content-Type: application/json")
    @GET("launches/upcoming")
    fun getAllUpcomingLaunches():Call<List<Launch>>

    @Headers("Content-Type: application/json")
    @GET("launches/past")
    fun getAllPastLaunches():Call<List<Launch>>

    @Headers("Content-Type: application/json")
    @GET("launches/next")
    fun getNextLaunch():Call<Launch>

    @Headers("Content-Type: application/json")
    @GET("launches/{flight_number}")
    fun getOneLaunch(@Path(value = "flight_number", encoded = true) flight_number: Int):Call<Launch>

    @Headers("Content-Type: application/json")
    @GET("missions")
    fun getAllMissions():Call<List<MissionModel>>

    @Headers("Content-Type: application/json")
    @GET("missions/{mission_id}")
    fun getOneMission(@Path(value = "mission_id", encoded = true) mission_id: String):Call<MissionModel>

}