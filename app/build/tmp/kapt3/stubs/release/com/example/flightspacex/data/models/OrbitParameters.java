package com.example.flightspacex.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u000eH\u00c6\u0003J\t\u0010+\u001a\u00020\u0010H\u00c6\u0003J\t\u0010,\u001a\u00020\u0006H\u00c6\u0003J\t\u0010-\u001a\u00020\u0006H\u00c6\u0003J\t\u0010.\u001a\u00020\u0006H\u00c6\u0003J\t\u0010/\u001a\u00020\u0006H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0006H\u00c6\u0003J\t\u00102\u001a\u00020\u0006H\u00c6\u0003J\t\u00103\u001a\u00020\u0006H\u00c6\u0003J\t\u00104\u001a\u00020\u0006H\u00c6\u0003J\t\u00105\u001a\u00020\u0006H\u00c6\u0003J\t\u00106\u001a\u00020\u0006H\u00c6\u0003J\t\u00107\u001a\u00020\u0006H\u00c6\u0003J\u009f\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0006H\u00c6\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010<\u001a\u00020\u000eH\u00d6\u0001J\t\u0010=\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\u0014\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010&R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017\u00a8\u0006>"}, d2 = {"Lcom/example/flightspacex/data/models/OrbitParameters;", "", "reference_system", "", "regime", "longitude", "", "semi_major_axis_km", "eccentricity", "periapsis_km", "apoapsis_km", "inclination_deg", "period_min", "lifespan_years", "", "epochval", "Ljava/sql/Timestamp;", "mean_motion", "raan", "arg_of_pericenter", "mean_anomaly", "(Ljava/lang/String;Ljava/lang/String;DDDDDDDILjava/sql/Timestamp;DDDD)V", "getApoapsis_km", "()D", "getArg_of_pericenter", "getEccentricity", "getEpochval", "()Ljava/sql/Timestamp;", "getInclination_deg", "getLifespan_years", "()I", "getLongitude", "getMean_anomaly", "getMean_motion", "getPeriapsis_km", "getPeriod_min", "getRaan", "getReference_system", "()Ljava/lang/String;", "getRegime", "getSemi_major_axis_km", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
public final class OrbitParameters {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String reference_system = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String regime = null;
    private final double longitude = 0.0;
    private final double semi_major_axis_km = 0.0;
    private final double eccentricity = 0.0;
    private final double periapsis_km = 0.0;
    private final double apoapsis_km = 0.0;
    private final double inclination_deg = 0.0;
    private final double period_min = 0.0;
    private final int lifespan_years = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.sql.Timestamp epochval = null;
    private final double mean_motion = 0.0;
    private final double raan = 0.0;
    private final double arg_of_pericenter = 0.0;
    private final double mean_anomaly = 0.0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.OrbitParameters copy(@org.jetbrains.annotations.NotNull()
    java.lang.String reference_system, @org.jetbrains.annotations.NotNull()
    java.lang.String regime, double longitude, double semi_major_axis_km, double eccentricity, double periapsis_km, double apoapsis_km, double inclination_deg, double period_min, int lifespan_years, @org.jetbrains.annotations.NotNull()
    java.sql.Timestamp epochval, double mean_motion, double raan, double arg_of_pericenter, double mean_anomaly) {
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
    
    public OrbitParameters() {
        super();
    }
    
    public OrbitParameters(@org.jetbrains.annotations.NotNull()
    java.lang.String reference_system, @org.jetbrains.annotations.NotNull()
    java.lang.String regime, double longitude, double semi_major_axis_km, double eccentricity, double periapsis_km, double apoapsis_km, double inclination_deg, double period_min, int lifespan_years, @org.jetbrains.annotations.NotNull()
    java.sql.Timestamp epochval, double mean_motion, double raan, double arg_of_pericenter, double mean_anomaly) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReference_system() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRegime() {
        return null;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double getLongitude() {
        return 0.0;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double getSemi_major_axis_km() {
        return 0.0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double getEccentricity() {
        return 0.0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double getPeriapsis_km() {
        return 0.0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double getApoapsis_km() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double getInclination_deg() {
        return 0.0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    public final double getPeriod_min() {
        return 0.0;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getLifespan_years() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.sql.Timestamp component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.sql.Timestamp getEpochval() {
        return null;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final double getMean_motion() {
        return 0.0;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    public final double getRaan() {
        return 0.0;
    }
    
    public final double component14() {
        return 0.0;
    }
    
    public final double getArg_of_pericenter() {
        return 0.0;
    }
    
    public final double component15() {
        return 0.0;
    }
    
    public final double getMean_anomaly() {
        return 0.0;
    }
}