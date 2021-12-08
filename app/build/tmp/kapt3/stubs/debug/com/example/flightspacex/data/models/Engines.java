package com.example.flightspacex.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\t\u0010)\u001a\u00020\u0010H\u00c6\u0003J\t\u0010*\u001a\u00020\u0010H\u00c6\u0003J\t\u0010+\u001a\u00020\u0013H\u00c6\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\tH\u00c6\u0003J\t\u0010/\u001a\u00020\tH\u00c6\u0003J\t\u00100\u001a\u00020\tH\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\tH\u00c6\u0003J\t\u00103\u001a\u00020\tH\u00c6\u0003J\u0090\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u00c6\u0001\u00a2\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020\u0003H\u00d6\u0001J\t\u0010:\u001a\u00020\tH\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001b\u00a8\u0006;"}, d2 = {"Lcom/example/flightspacex/data/models/Engines;", "", "block", "", "payloads", "", "Lcom/example/flightspacex/data/models/Payload;", "number", "type", "", "version", "layout", "engine_loss_max", "propellant_1", "propellant_2", "thrust_sea_level", "Lcom/example/flightspacex/data/models/ThrustValues;", "thrust_vacuum", "thrust_to_weight", "", "(Ljava/lang/Integer;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/example/flightspacex/data/models/ThrustValues;Lcom/example/flightspacex/data/models/ThrustValues;D)V", "getBlock", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEngine_loss_max", "()I", "getLayout", "()Ljava/lang/String;", "getNumber", "getPayloads", "()Ljava/util/List;", "getPropellant_1", "getPropellant_2", "getThrust_sea_level", "()Lcom/example/flightspacex/data/models/ThrustValues;", "getThrust_to_weight", "()D", "getThrust_vacuum", "getType", "getVersion", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/example/flightspacex/data/models/ThrustValues;Lcom/example/flightspacex/data/models/ThrustValues;D)Lcom/example/flightspacex/data/models/Engines;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Engines {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer block = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.example.flightspacex.data.models.Payload> payloads = null;
    private final int number = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String version = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String layout = null;
    private final int engine_loss_max = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String propellant_1 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String propellant_2 = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.flightspacex.data.models.ThrustValues thrust_sea_level = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.flightspacex.data.models.ThrustValues thrust_vacuum = null;
    private final double thrust_to_weight = 0.0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.Engines copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer block, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.flightspacex.data.models.Payload> payloads, int number, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    java.lang.String layout, int engine_loss_max, @org.jetbrains.annotations.NotNull()
    java.lang.String propellant_1, @org.jetbrains.annotations.NotNull()
    java.lang.String propellant_2, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.ThrustValues thrust_sea_level, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.ThrustValues thrust_vacuum, double thrust_to_weight) {
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
    
    public Engines() {
        super();
    }
    
    public Engines(@org.jetbrains.annotations.Nullable()
    java.lang.Integer block, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.flightspacex.data.models.Payload> payloads, int number, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    java.lang.String layout, int engine_loss_max, @org.jetbrains.annotations.NotNull()
    java.lang.String propellant_1, @org.jetbrains.annotations.NotNull()
    java.lang.String propellant_2, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.ThrustValues thrust_sea_level, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.ThrustValues thrust_vacuum, double thrust_to_weight) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBlock() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.flightspacex.data.models.Payload> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.flightspacex.data.models.Payload> getPayloads() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getNumber() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLayout() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getEngine_loss_max() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPropellant_1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPropellant_2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.ThrustValues component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.ThrustValues getThrust_sea_level() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.ThrustValues component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.ThrustValues getThrust_vacuum() {
        return null;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final double getThrust_to_weight() {
        return 0.0;
    }
}