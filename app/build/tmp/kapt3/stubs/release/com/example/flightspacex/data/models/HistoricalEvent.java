package com.example.flightspacex.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\fH\u00c6\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020\u0005H\u00d6\u0001J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f\u00a8\u0006\'"}, d2 = {"Lcom/example/flightspacex/data/models/HistoricalEvent;", "Ljava/io/Serializable;", "title", "", "id", "", "event_date_utc", "Ljava/sql/Timestamp;", "event_date_unix", "flight_number", "details", "links", "Lcom/example/flightspacex/data/models/Links;", "(Ljava/lang/String;ILjava/sql/Timestamp;IILjava/lang/String;Lcom/example/flightspacex/data/models/Links;)V", "getDetails", "()Ljava/lang/String;", "getEvent_date_unix", "()I", "getEvent_date_utc", "()Ljava/sql/Timestamp;", "getFlight_number", "getId", "getLinks", "()Lcom/example/flightspacex/data/models/Links;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"})
public final class HistoricalEvent implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.sql.Timestamp event_date_utc = null;
    private final int event_date_unix = 0;
    private final int flight_number = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String details = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.flightspacex.data.models.Links links = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.HistoricalEvent copy(@org.jetbrains.annotations.NotNull()
    java.lang.String title, int id, @org.jetbrains.annotations.NotNull()
    java.sql.Timestamp event_date_utc, int event_date_unix, int flight_number, @org.jetbrains.annotations.NotNull()
    java.lang.String details, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.Links links) {
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
    
    public HistoricalEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String title, int id, @org.jetbrains.annotations.NotNull()
    java.sql.Timestamp event_date_utc, int event_date_unix, int flight_number, @org.jetbrains.annotations.NotNull()
    java.lang.String details, @org.jetbrains.annotations.NotNull()
    com.example.flightspacex.data.models.Links links) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.sql.Timestamp component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.sql.Timestamp getEvent_date_utc() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getEvent_date_unix() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getFlight_number() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.Links component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.Links getLinks() {
        return null;
    }
}