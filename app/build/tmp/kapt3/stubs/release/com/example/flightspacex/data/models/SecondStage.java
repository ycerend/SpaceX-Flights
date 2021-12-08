package com.example.flightspacex.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006 "}, d2 = {"Lcom/example/flightspacex/data/models/SecondStage;", "", "engines", "", "fuel_amount_tons", "burn_time_sec", "thrust", "Lcom/example/flightspacex/data/models/ThrustValues;", "payloads", "", "Lcom/example/flightspacex/data/models/Payload;", "(IIILcom/example/flightspacex/data/models/ThrustValues;Ljava/util/List;)V", "getBurn_time_sec", "()I", "getEngines", "getFuel_amount_tons", "getPayloads", "()Ljava/util/List;", "getThrust", "()Lcom/example/flightspacex/data/models/ThrustValues;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"})
public final class SecondStage {
    private final int engines = 0;
    private final int fuel_amount_tons = 0;
    private final int burn_time_sec = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.flightspacex.data.models.ThrustValues thrust = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.flightspacex.data.models.Payload> payloads = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.SecondStage copy(int engines, int fuel_amount_tons, int burn_time_sec, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.ThrustValues thrust, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.flightspacex.data.models.Payload> payloads) {
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
    
    public SecondStage() {
        super();
    }
    
    public SecondStage(int engines, int fuel_amount_tons, int burn_time_sec, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.ThrustValues thrust, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.flightspacex.data.models.Payload> payloads) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getEngines() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getFuel_amount_tons() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getBurn_time_sec() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.ThrustValues component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.ThrustValues getThrust() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.flightspacex.data.models.Payload> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.flightspacex.data.models.Payload> getPayloads() {
        return null;
    }
}