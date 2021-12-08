package com.example.flightspacex.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010 \u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\"\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010#\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rH\u00c6\u0003Jh\u0010%\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0002\u0010&J\u0013\u0010\'\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020\nH\u00d6\u0001J\t\u0010*\u001a\u00020\bH\u00d6\u0001R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001c\u00a8\u0006+"}, d2 = {"Lcom/example/flightspacex/data/models/FirstStage;", "", "cores", "", "Lcom/example/flightspacex/data/models/Cores;", "reusable", "", "engines", "", "fuel_amount_tons", "", "burn_time_sec", "thrust_sea_level", "Lcom/example/flightspacex/data/models/ThrustValues;", "thrust_vacuum", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/example/flightspacex/data/models/ThrustValues;Lcom/example/flightspacex/data/models/ThrustValues;)V", "getBurn_time_sec", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCores", "()Ljava/util/List;", "getEngines", "()Ljava/lang/String;", "getFuel_amount_tons", "getReusable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getThrust_sea_level", "()Lcom/example/flightspacex/data/models/ThrustValues;", "getThrust_vacuum", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/example/flightspacex/data/models/ThrustValues;Lcom/example/flightspacex/data/models/ThrustValues;)Lcom/example/flightspacex/data/models/FirstStage;", "equals", "other", "hashCode", "toString", "app_release"})
public final class FirstStage {
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.example.flightspacex.data.models.Cores> cores = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean reusable = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String engines = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer fuel_amount_tons = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer burn_time_sec = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.flightspacex.data.models.ThrustValues thrust_sea_level = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.flightspacex.data.models.ThrustValues thrust_vacuum = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.FirstStage copy(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.flightspacex.data.models.Cores> cores, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean reusable, @org.jetbrains.annotations.Nullable()
    java.lang.String engines, @org.jetbrains.annotations.Nullable()
    java.lang.Integer fuel_amount_tons, @org.jetbrains.annotations.Nullable()
    java.lang.Integer burn_time_sec, @org.jetbrains.annotations.Nullable()
    com.example.flightspacex.data.models.ThrustValues thrust_sea_level, @org.jetbrains.annotations.Nullable()
    com.example.flightspacex.data.models.ThrustValues thrust_vacuum) {
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
    
    public FirstStage() {
        super();
    }
    
    public FirstStage(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.flightspacex.data.models.Cores> cores, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean reusable, @org.jetbrains.annotations.Nullable()
    java.lang.String engines, @org.jetbrains.annotations.Nullable()
    java.lang.Integer fuel_amount_tons, @org.jetbrains.annotations.Nullable()
    java.lang.Integer burn_time_sec, @org.jetbrains.annotations.Nullable()
    com.example.flightspacex.data.models.ThrustValues thrust_sea_level, @org.jetbrains.annotations.Nullable()
    com.example.flightspacex.data.models.ThrustValues thrust_vacuum) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.flightspacex.data.models.Cores> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.flightspacex.data.models.Cores> getCores() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getReusable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEngines() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFuel_amount_tons() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBurn_time_sec() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.flightspacex.data.models.ThrustValues component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.flightspacex.data.models.ThrustValues getThrust_sea_level() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.flightspacex.data.models.ThrustValues component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.flightspacex.data.models.ThrustValues getThrust_vacuum() {
        return null;
    }
}