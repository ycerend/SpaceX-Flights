package com.example.flightspacex.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\bB\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u00d7\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0018J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\u00db\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010H\u001a\u00020\u0003H\u00d6\u0001J\t\u0010I\u001a\u00020JH\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001aR\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001a\u00a8\u0006K"}, d2 = {"Lcom/example/flightspacex/data/models/Timeline;", "", "webcast_liftoff", "", "go_for_prop_loading", "rp1_loading", "stage1_lox_loading", "stage2_lox_loading", "engine_chill", "prelaunch_checks", "propellant_pressurization", "go_for_launch", "ignition", "liftoff", "maxq", "meco", "stage_sep", "fairing_deploy", "first_stage_entry_burn", "seco_1", "first_stage_landing", "second_stage_restart", "seco_2", "payload_deploy", "(IIIIIIIIIIIIIIIIIIIII)V", "getEngine_chill", "()I", "getFairing_deploy", "getFirst_stage_entry_burn", "getFirst_stage_landing", "getGo_for_launch", "getGo_for_prop_loading", "getIgnition", "getLiftoff", "getMaxq", "getMeco", "getPayload_deploy", "getPrelaunch_checks", "getPropellant_pressurization", "getRp1_loading", "getSeco_1", "getSeco_2", "getSecond_stage_restart", "getStage1_lox_loading", "getStage2_lox_loading", "getStage_sep", "getWebcast_liftoff", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"})
public final class Timeline {
    private final int webcast_liftoff = 0;
    private final int go_for_prop_loading = 0;
    private final int rp1_loading = 0;
    private final int stage1_lox_loading = 0;
    private final int stage2_lox_loading = 0;
    private final int engine_chill = 0;
    private final int prelaunch_checks = 0;
    private final int propellant_pressurization = 0;
    private final int go_for_launch = 0;
    private final int ignition = 0;
    private final int liftoff = 0;
    private final int maxq = 0;
    private final int meco = 0;
    private final int stage_sep = 0;
    private final int fairing_deploy = 0;
    private final int first_stage_entry_burn = 0;
    private final int seco_1 = 0;
    private final int first_stage_landing = 0;
    private final int second_stage_restart = 0;
    private final int seco_2 = 0;
    private final int payload_deploy = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flightspacex.data.models.Timeline copy(int webcast_liftoff, int go_for_prop_loading, int rp1_loading, int stage1_lox_loading, int stage2_lox_loading, int engine_chill, int prelaunch_checks, int propellant_pressurization, int go_for_launch, int ignition, int liftoff, int maxq, int meco, int stage_sep, int fairing_deploy, int first_stage_entry_burn, int seco_1, int first_stage_landing, int second_stage_restart, int seco_2, int payload_deploy) {
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
    
    public Timeline() {
        super();
    }
    
    public Timeline(int webcast_liftoff, int go_for_prop_loading, int rp1_loading, int stage1_lox_loading, int stage2_lox_loading, int engine_chill, int prelaunch_checks, int propellant_pressurization, int go_for_launch, int ignition, int liftoff, int maxq, int meco, int stage_sep, int fairing_deploy, int first_stage_entry_burn, int seco_1, int first_stage_landing, int second_stage_restart, int seco_2, int payload_deploy) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getWebcast_liftoff() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getGo_for_prop_loading() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getRp1_loading() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getStage1_lox_loading() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getStage2_lox_loading() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getEngine_chill() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getPrelaunch_checks() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getPropellant_pressurization() {
        return 0;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getGo_for_launch() {
        return 0;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getIgnition() {
        return 0;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getLiftoff() {
        return 0;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int getMaxq() {
        return 0;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getMeco() {
        return 0;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int getStage_sep() {
        return 0;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getFairing_deploy() {
        return 0;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int getFirst_stage_entry_burn() {
        return 0;
    }
    
    public final int component17() {
        return 0;
    }
    
    public final int getSeco_1() {
        return 0;
    }
    
    public final int component18() {
        return 0;
    }
    
    public final int getFirst_stage_landing() {
        return 0;
    }
    
    public final int component19() {
        return 0;
    }
    
    public final int getSecond_stage_restart() {
        return 0;
    }
    
    public final int component20() {
        return 0;
    }
    
    public final int getSeco_2() {
        return 0;
    }
    
    public final int component21() {
        return 0;
    }
    
    public final int getPayload_deploy() {
        return 0;
    }
}