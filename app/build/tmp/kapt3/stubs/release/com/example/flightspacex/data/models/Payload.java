package com.example.flightspacex.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0012H\u00c6\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u000eH\u00c6\u0003J\t\u0010/\u001a\u00020\u000eH\u00c6\u0003J\u008a\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u00c6\u0001\u00a2\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00104\u001a\u00020\u0006H\u00d6\u0001J\t\u00105\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#\u00a8\u00066"}, d2 = {"Lcom/example/flightspacex/data/models/Payload;", "", "payload_id", "", "norad_id", "", "", "reused", "", "customers", "nationality", "manufacturer", "payload_type", "payload_mass_kg", "", "payload_mass_lbs", "orbit", "orbit_params", "Lcom/example/flightspacex/data/models/OrbitParameters;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Lcom/example/flightspacex/data/models/OrbitParameters;)V", "getCustomers", "()Ljava/util/List;", "getManufacturer", "()Ljava/lang/String;", "getNationality", "getNorad_id", "getOrbit", "getOrbit_params", "()Lcom/example/flightspacex/data/models/OrbitParameters;", "getPayload_id", "getPayload_mass_kg", "()D", "getPayload_mass_lbs", "getPayload_type", "getReused", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Lcom/example/flightspacex/data/models/OrbitParameters;)Lcom/example/flightspacex/data/models/Payload;", "equals", "other", "hashCode", "toString", "app_release"})
public final class Payload {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String payload_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Integer> norad_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean reused = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> customers = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nationality = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String manufacturer = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String payload_type = null;
    private final double payload_mass_kg = 0.0;
    private final double payload_mass_lbs = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String orbit = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.flightspacex.data.models.OrbitParameters orbit_params = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.Payload copy(@org.jetbrains.annotations.NotNull()
    java.lang.String payload_id, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> norad_id, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean reused, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> customers, @org.jetbrains.annotations.NotNull()
    java.lang.String nationality, @org.jetbrains.annotations.NotNull()
    java.lang.String manufacturer, @org.jetbrains.annotations.NotNull()
    java.lang.String payload_type, double payload_mass_kg, double payload_mass_lbs, @org.jetbrains.annotations.NotNull()
    java.lang.String orbit, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.OrbitParameters orbit_params) {
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
    
    public Payload() {
        super();
    }
    
    public Payload(@org.jetbrains.annotations.NotNull()
    java.lang.String payload_id, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> norad_id, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean reused, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> customers, @org.jetbrains.annotations.NotNull()
    java.lang.String nationality, @org.jetbrains.annotations.NotNull()
    java.lang.String manufacturer, @org.jetbrains.annotations.NotNull()
    java.lang.String payload_type, double payload_mass_kg, double payload_mass_lbs, @org.jetbrains.annotations.NotNull()
    java.lang.String orbit, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.OrbitParameters orbit_params) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPayload_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getNorad_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getReused() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCustomers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNationality() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getManufacturer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPayload_type() {
        return null;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double getPayload_mass_kg() {
        return 0.0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    public final double getPayload_mass_lbs() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrbit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.OrbitParameters component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.OrbitParameters getOrbit_params() {
        return null;
    }
}