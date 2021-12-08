package com.example.flightspacex.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bE\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u00a2\u0006\u0002\u0010\'J\u0010\u0010N\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010,J\u000b\u0010O\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u0011\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\t\u0010T\u001a\u00020\u001bH\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u001fH\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010)J\u000b\u0010Z\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010&H\u00c6\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010,J\u0010\u0010_\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010,J\u0010\u0010`\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010,J\u0010\u0010a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010,J\u000b\u0010b\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u00a6\u0002\u0010e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&H\u00c6\u0001\u00a2\u0006\u0002\u0010fJ\u0013\u0010g\u001a\u00020\u00052\b\u0010h\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010i\u001a\u00020\u0003H\u00d6\u0001J\t\u0010j\u001a\u00020\rH\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010-\u001a\u0004\b0\u0010,R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010/R\u0013\u0010!\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010%\u001a\u0004\u0018\u00010&\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010-\u001a\u0004\b?\u0010,R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\"\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010/R\u0013\u0010#\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010/R\u0013\u0010$\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010/R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010-\u001a\u0004\bK\u0010,R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010-\u001a\u0004\bL\u0010,R\u0013\u0010 \u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010/\u00a8\u0006k"}, d2 = {"Lcom/example/flightspacex/data/models/Rocket;", "", "id", "", "active", "", "stages", "boosters", "cost_per_launch", "success_rate_pct", "first_flight", "Ljava/sql/Timestamp;", "country", "", "company", "height", "Lcom/example/flightspacex/data/models/Height;", "diameter", "Lcom/example/flightspacex/data/models/Diameter;", "mass", "Lcom/example/flightspacex/data/models/Mass;", "payload_weights", "", "Lcom/example/flightspacex/data/models/PayloadWeights;", "first_stage", "Lcom/example/flightspacex/data/models/FirstStage;", "second_stage", "Lcom/example/flightspacex/data/models/SecondStage;", "engines", "Lcom/example/flightspacex/data/models/Engines;", "landing_legs", "Lcom/example/flightspacex/data/models/LandingLegs;", "wikipedia", "description", "rocket_id", "rocket_name", "rocket_type", "fairings", "Lcom/example/flightspacex/data/models/Fairing;", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/sql/Timestamp;Ljava/lang/String;Ljava/lang/String;Lcom/example/flightspacex/data/models/Height;Lcom/example/flightspacex/data/models/Diameter;Lcom/example/flightspacex/data/models/Mass;Ljava/util/List;Lcom/example/flightspacex/data/models/FirstStage;Lcom/example/flightspacex/data/models/SecondStage;Lcom/example/flightspacex/data/models/Engines;Lcom/example/flightspacex/data/models/LandingLegs;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/flightspacex/data/models/Fairing;)V", "getActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBoosters", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCompany", "()Ljava/lang/String;", "getCost_per_launch", "getCountry", "getDescription", "getDiameter", "()Lcom/example/flightspacex/data/models/Diameter;", "getEngines", "()Lcom/example/flightspacex/data/models/Engines;", "getFairings", "()Lcom/example/flightspacex/data/models/Fairing;", "getFirst_flight", "()Ljava/sql/Timestamp;", "getFirst_stage", "()Lcom/example/flightspacex/data/models/FirstStage;", "getHeight", "()Lcom/example/flightspacex/data/models/Height;", "getId", "getLanding_legs", "()Lcom/example/flightspacex/data/models/LandingLegs;", "getMass", "()Lcom/example/flightspacex/data/models/Mass;", "getPayload_weights", "()Ljava/util/List;", "getRocket_id", "getRocket_name", "getRocket_type", "getSecond_stage", "()Lcom/example/flightspacex/data/models/SecondStage;", "getStages", "getSuccess_rate_pct", "getWikipedia", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/sql/Timestamp;Ljava/lang/String;Ljava/lang/String;Lcom/example/flightspacex/data/models/Height;Lcom/example/flightspacex/data/models/Diameter;Lcom/example/flightspacex/data/models/Mass;Ljava/util/List;Lcom/example/flightspacex/data/models/FirstStage;Lcom/example/flightspacex/data/models/SecondStage;Lcom/example/flightspacex/data/models/Engines;Lcom/example/flightspacex/data/models/LandingLegs;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/flightspacex/data/models/Fairing;)Lcom/example/flightspacex/data/models/Rocket;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class Rocket {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean active = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer stages = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer boosters = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer cost_per_launch = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer success_rate_pct = null;
    @org.jetbrains.annotations.Nullable()
    private final java.sql.Timestamp first_flight = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String country = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String company = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.flightspacex.data.models.Height height = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.flightspacex.data.models.Diameter diameter = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.flightspacex.data.models.Mass mass = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.example.flightspacex.data.models.PayloadWeights> payload_weights = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.flightspacex.data.models.FirstStage first_stage = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.flightspacex.data.models.SecondStage second_stage = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.flightspacex.data.models.Engines engines = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.flightspacex.data.models.LandingLegs landing_legs = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String wikipedia = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String rocket_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String rocket_name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String rocket_type = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.flightspacex.data.models.Fairing fairings = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.Rocket copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean active, @org.jetbrains.annotations.Nullable()
    java.lang.Integer stages, @org.jetbrains.annotations.Nullable()
    java.lang.Integer boosters, @org.jetbrains.annotations.Nullable()
    java.lang.Integer cost_per_launch, @org.jetbrains.annotations.Nullable()
    java.lang.Integer success_rate_pct, @org.jetbrains.annotations.Nullable()
    java.sql.Timestamp first_flight, @org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.String company, @org.jetbrains.annotations.Nullable()
    com.example.flightspacex.data.models.Height height, @org.jetbrains.annotations.Nullable()
    com.example.flightspacex.data.models.Diameter diameter, @org.jetbrains.annotations.Nullable()
    com.example.flightspacex.data.models.Mass mass, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.flightspacex.data.models.PayloadWeights> payload_weights, @org.jetbrains.annotations.Nullable()
    com.example.flightspacex.data.models.FirstStage first_stage, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.SecondStage second_stage, @org.jetbrains.annotations.Nullable()
    com.example.flightspacex.data.models.Engines engines, @org.jetbrains.annotations.Nullable()
    com.example.flightspacex.data.models.LandingLegs landing_legs, @org.jetbrains.annotations.Nullable()
    java.lang.String wikipedia, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String rocket_id, @org.jetbrains.annotations.Nullable()
    java.lang.String rocket_name, @org.jetbrains.annotations.Nullable()
    java.lang.String rocket_type, @org.jetbrains.annotations.Nullable()
    com.example.flightspacex.data.models.Fairing fairings) {
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
    
    public Rocket() {
        super();
    }
    
    public Rocket(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean active, @org.jetbrains.annotations.Nullable()
    java.lang.Integer stages, @org.jetbrains.annotations.Nullable()
    java.lang.Integer boosters, @org.jetbrains.annotations.Nullable()
    java.lang.Integer cost_per_launch, @org.jetbrains.annotations.Nullable()
    java.lang.Integer success_rate_pct, @org.jetbrains.annotations.Nullable()
    java.sql.Timestamp first_flight, @org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.String company, @org.jetbrains.annotations.Nullable()
    com.example.flightspacex.data.models.Height height, @org.jetbrains.annotations.Nullable()
    com.example.flightspacex.data.models.Diameter diameter, @org.jetbrains.annotations.Nullable()
    com.example.flightspacex.data.models.Mass mass, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.flightspacex.data.models.PayloadWeights> payload_weights, @org.jetbrains.annotations.Nullable()
    com.example.flightspacex.data.models.FirstStage first_stage, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.SecondStage second_stage, @org.jetbrains.annotations.Nullable()
    com.example.flightspacex.data.models.Engines engines, @org.jetbrains.annotations.Nullable()
    com.example.flightspacex.data.models.LandingLegs landing_legs, @org.jetbrains.annotations.Nullable()
    java.lang.String wikipedia, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String rocket_id, @org.jetbrains.annotations.Nullable()
    java.lang.String rocket_name, @org.jetbrains.annotations.Nullable()
    java.lang.String rocket_type, @org.jetbrains.annotations.Nullable()
    com.example.flightspacex.data.models.Fairing fairings) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getActive() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBoosters() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCost_per_launch() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSuccess_rate_pct() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.sql.Timestamp component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.sql.Timestamp getFirst_flight() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompany() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.flightspacex.data.models.Height component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.flightspacex.data.models.Height getHeight() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.flightspacex.data.models.Diameter component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.flightspacex.data.models.Diameter getDiameter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.flightspacex.data.models.Mass component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.flightspacex.data.models.Mass getMass() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.flightspacex.data.models.PayloadWeights> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.flightspacex.data.models.PayloadWeights> getPayload_weights() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.flightspacex.data.models.FirstStage component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.flightspacex.data.models.FirstStage getFirst_stage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.SecondStage component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.SecondStage getSecond_stage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.flightspacex.data.models.Engines component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.flightspacex.data.models.Engines getEngines() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.flightspacex.data.models.LandingLegs component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.flightspacex.data.models.LandingLegs getLanding_legs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWikipedia() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRocket_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRocket_name() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRocket_type() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.flightspacex.data.models.Fairing component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.flightspacex.data.models.Fairing getFairings() {
        return null;
    }
}