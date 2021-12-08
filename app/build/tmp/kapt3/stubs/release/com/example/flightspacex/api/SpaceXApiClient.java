package com.example.flightspacex.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003H\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003H\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\'J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\'\u00a8\u0006\u0013"}, d2 = {"Lcom/example/flightspacex/api/SpaceXApiClient;", "", "getAllHistoricalEvents", "Lretrofit2/Call;", "", "Lcom/example/flightspacex/data/models/HistoricalEvent;", "getAllMissions", "Lcom/example/flightspacex/data/models/MissionModel;", "getAllPastLaunches", "Lcom/example/flightspacex/data/models/Launch;", "getAllUpcomingLaunches", "getLatestLaunch", "getNextLaunch", "getOneLaunch", "flight_number", "", "getOneMission", "mission_id", "", "app_release"})
public abstract interface SpaceXApiClient {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "history")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<java.util.List<com.example.flightspacex.data.models.HistoricalEvent>> getAllHistoricalEvents();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "launches/latest")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<com.example.flightspacex.data.models.Launch> getLatestLaunch();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "launches/upcoming")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<java.util.List<com.example.flightspacex.data.models.Launch>> getAllUpcomingLaunches();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "launches/past")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<java.util.List<com.example.flightspacex.data.models.Launch>> getAllPastLaunches();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "launches/next")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<com.example.flightspacex.data.models.Launch> getNextLaunch();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "launches/{flight_number}")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<com.example.flightspacex.data.models.Launch> getOneLaunch(@retrofit2.http.Path(value = "flight_number", encoded = true)
    int flight_number);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "missions")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<java.util.List<com.example.flightspacex.data.models.MissionModel>> getAllMissions();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "missions/{mission_id}")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<com.example.flightspacex.data.models.MissionModel> getOneMission(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "mission_id", encoded = true)
    java.lang.String mission_id);
}