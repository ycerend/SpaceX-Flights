package com.example.flightspacex.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u00e3\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020!\u00a2\u0006\u0002\u0010\"J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u000eH\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0013H\u00c6\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0003J\t\u0010G\u001a\u00020\u0016H\u00c6\u0003J\t\u0010H\u001a\u00020\u0018H\u00c6\u0003J\t\u0010I\u001a\u00020\u000eH\u00c6\u0003J\t\u0010J\u001a\u00020\u001bH\u00c6\u0003J\t\u0010K\u001a\u00020\u0005H\u00c6\u0003J\t\u0010L\u001a\u00020\u000eH\u00c6\u0003J\t\u0010M\u001a\u00020\u0005H\u00c6\u0003J\t\u0010N\u001a\u00020\u000bH\u00c6\u0003J\t\u0010O\u001a\u00020\u0003H\u00c6\u0003J\t\u0010P\u001a\u00020!H\u00c6\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0003J\t\u0010R\u001a\u00020\u0005H\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u000bH\u00c6\u0003J\t\u0010U\u001a\u00020\u000bH\u00c6\u0003J\t\u0010V\u001a\u00020\u000eH\u00c6\u0003J\t\u0010W\u001a\u00020\u0005H\u00c6\u0003J\u00f1\u0001\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020!H\u00c6\u0001J\u0013\u0010Y\u001a\u00020\u000e2\b\u0010Z\u001a\u0004\u0018\u00010[H\u00d6\u0003J\t\u0010\\\u001a\u00020\u0003H\u00d6\u0001J\t\u0010]\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u001c\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\'R\u0011\u0010\f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0019\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\'R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00104R\u0011\u0010\u001f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010&R\u0011\u0010\u001e\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010)R\u0011\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\'R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010$R\u0011\u0010 \u001a\u00020!\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u001d\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010\'\u00a8\u0006^"}, d2 = {"Lcom/example/flightspacex/data/models/Launch;", "Ljava/io/Serializable;", "flight_number", "", "mission_name", "", "mission_id", "", "launch_year", "launch_date_unix", "launch_date_utc", "Ljava/sql/Timestamp;", "launch_date_local", "is_tentative", "", "tentative_max_precision", "tbd", "launch_window", "rocket", "Lcom/example/flightspacex/data/models/Rocket;", "ships", "telemetry", "Lcom/example/flightspacex/data/models/Telemetry;", "launch_site", "Lcom/example/flightspacex/data/models/LaunchSite;", "launch_success", "links", "Lcom/example/flightspacex/data/models/Links;", "details", "upcoming", "static_fire_date_utc", "static_fire_date_unix", "timeline", "Lcom/example/flightspacex/data/models/Timeline;", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/sql/Timestamp;Ljava/sql/Timestamp;ZLjava/lang/String;ZILcom/example/flightspacex/data/models/Rocket;Ljava/util/List;Lcom/example/flightspacex/data/models/Telemetry;Lcom/example/flightspacex/data/models/LaunchSite;ZLcom/example/flightspacex/data/models/Links;Ljava/lang/String;ZLjava/sql/Timestamp;ILcom/example/flightspacex/data/models/Timeline;)V", "getDetails", "()Ljava/lang/String;", "getFlight_number", "()I", "()Z", "getLaunch_date_local", "()Ljava/sql/Timestamp;", "getLaunch_date_unix", "getLaunch_date_utc", "getLaunch_site", "()Lcom/example/flightspacex/data/models/LaunchSite;", "getLaunch_success", "getLaunch_window", "getLaunch_year", "getLinks", "()Lcom/example/flightspacex/data/models/Links;", "getMission_id", "()Ljava/util/List;", "getMission_name", "getRocket", "()Lcom/example/flightspacex/data/models/Rocket;", "getShips", "getStatic_fire_date_unix", "getStatic_fire_date_utc", "getTbd", "getTelemetry", "()Lcom/example/flightspacex/data/models/Telemetry;", "getTentative_max_precision", "getTimeline", "()Lcom/example/flightspacex/data/models/Timeline;", "getUpcoming", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_debug"})
public final class Launch implements java.io.Serializable {
    private final int flight_number = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mission_name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> mission_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String launch_year = null;
    private final int launch_date_unix = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.sql.Timestamp launch_date_utc = null;
    @org.jetbrains.annotations.NotNull()
    private final java.sql.Timestamp launch_date_local = null;
    private final boolean is_tentative = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String tentative_max_precision = null;
    private final boolean tbd = false;
    private final int launch_window = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.flightspacex.data.models.Rocket rocket = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> ships = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.flightspacex.data.models.Telemetry telemetry = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.flightspacex.data.models.LaunchSite launch_site = null;
    private final boolean launch_success = false;
    @org.jetbrains.annotations.NotNull()
    private final com.example.flightspacex.data.models.Links links = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String details = null;
    private final boolean upcoming = false;
    @org.jetbrains.annotations.NotNull()
    private final java.sql.Timestamp static_fire_date_utc = null;
    private final int static_fire_date_unix = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.flightspacex.data.models.Timeline timeline = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.Launch copy(int flight_number, @org.jetbrains.annotations.NotNull()
    java.lang.String mission_name, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> mission_id, @org.jetbrains.annotations.NotNull()
    java.lang.String launch_year, int launch_date_unix, @org.jetbrains.annotations.NotNull()
    java.sql.Timestamp launch_date_utc, @org.jetbrains.annotations.NotNull()
    java.sql.Timestamp launch_date_local, boolean is_tentative, @org.jetbrains.annotations.NotNull()
    java.lang.String tentative_max_precision, boolean tbd, int launch_window, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.Rocket rocket, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> ships, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.Telemetry telemetry, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.LaunchSite launch_site, boolean launch_success, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.Links links, @org.jetbrains.annotations.NotNull()
    java.lang.String details, boolean upcoming, @org.jetbrains.annotations.NotNull()
    java.sql.Timestamp static_fire_date_utc, int static_fire_date_unix, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.Timeline timeline) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Launch(int flight_number, @org.jetbrains.annotations.NotNull()
    java.lang.String mission_name, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> mission_id, @org.jetbrains.annotations.NotNull()
    java.lang.String launch_year, int launch_date_unix, @org.jetbrains.annotations.NotNull()
    java.sql.Timestamp launch_date_utc, @org.jetbrains.annotations.NotNull()
    java.sql.Timestamp launch_date_local, boolean is_tentative, @org.jetbrains.annotations.NotNull()
    java.lang.String tentative_max_precision, boolean tbd, int launch_window, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.Rocket rocket, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> ships, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.Telemetry telemetry, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.LaunchSite launch_site, boolean launch_success, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.Links links, @org.jetbrains.annotations.NotNull()
    java.lang.String details, boolean upcoming, @org.jetbrains.annotations.NotNull()
    java.sql.Timestamp static_fire_date_utc, int static_fire_date_unix, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.Timeline timeline) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getFlight_number() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMission_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getMission_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLaunch_year() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getLaunch_date_unix() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.sql.Timestamp component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.sql.Timestamp getLaunch_date_utc() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.sql.Timestamp component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.sql.Timestamp getLaunch_date_local() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean is_tentative() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTentative_max_precision() {
        return null;
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean getTbd() {
        return false;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getLaunch_window() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.Rocket component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.Rocket getRocket() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getShips() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.Telemetry component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.Telemetry getTelemetry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.LaunchSite component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.LaunchSite getLaunch_site() {
        return null;
    }
    
    public final boolean component16() {
        return false;
    }
    
    public final boolean getLaunch_success() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.Links component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.Links getLinks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDetails() {
        return null;
    }
    
    public final boolean component19() {
        return false;
    }
    
    public final boolean getUpcoming() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.sql.Timestamp component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.sql.Timestamp getStatic_fire_date_utc() {
        return null;
    }
    
    public final int component21() {
        return 0;
    }
    
    public final int getStatic_fire_date_unix() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.Timeline component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.Timeline getTimeline() {
        return null;
    }
}