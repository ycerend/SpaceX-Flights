package com.example.flightspacex.activity.ui.Missions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0003 !\"B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/example/flightspacex/activity/ui/Missions/MissionListFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/flightspacex/interfaces/fragmentOperationsInterface;", "()V", "containerId", "Landroid/view/ViewGroup;", "description_list", "Ljava/util/ArrayList;", "", "manufacturers_list", "", "mission_id_list", "mission_name_list", "payload_ids_list", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "twitter_list", "viewModel", "Lcom/example/flightspacex/activity/ui/Missions/MissionListViewModel;", "website_list", "wikipedia_list", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "MissionListAdapter", "ViewHolder", "app_release"})
public final class MissionListFragment extends androidx.fragment.app.Fragment implements com.example.flightspacex.interfaces.fragmentOperationsInterface {
    private android.view.ViewGroup containerId;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private java.util.ArrayList<java.lang.String> mission_name_list;
    private java.util.ArrayList<java.lang.String> mission_id_list;
    private java.util.ArrayList<java.util.List<java.lang.String>> manufacturers_list;
    private java.util.ArrayList<java.util.List<java.lang.String>> payload_ids_list;
    private java.util.ArrayList<java.lang.String> wikipedia_list;
    private java.util.ArrayList<java.lang.String> website_list;
    private java.util.ArrayList<java.lang.String> twitter_list;
    private java.util.ArrayList<java.lang.String> description_list;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.flightspacex.activity.ui.Missions.MissionListFragment.Companion Companion = null;
    private com.example.flightspacex.activity.ui.Missions.MissionListViewModel viewModel;
    
    public MissionListFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public void fragmentTransaction(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager manager, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int container, boolean replace, boolean addToBackStack, boolean addAnimation) {
    }
    
    public void removeFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager manager) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u00e5\u0001\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\"\u0010\t\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\u0005j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n`\u0007\u0012\"\u0010\u000b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\u0005j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n`\u0007\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\b\u0010*\u001a\u00020+H\u0016J\u001c\u0010,\u001a\u00020-2\n\u0010.\u001a\u00060\u0002R\u00020\u00032\u0006\u0010/\u001a\u00020+H\u0016J\u001c\u00100\u001a\u00060\u0002R\u00020\u00032\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020+H\u0016R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R6\u0010\t\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\u0005j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n`\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0018R*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R6\u0010\u000b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\u0005j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n`\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u0018R*\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b\'\u0010\u0018R*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010\u0018\u00a8\u00064"}, d2 = {"Lcom/example/flightspacex/activity/ui/Missions/MissionListFragment$MissionListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/flightspacex/activity/ui/Missions/MissionListFragment$ViewHolder;", "Lcom/example/flightspacex/activity/ui/Missions/MissionListFragment;", "mission_name_list", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "mission_id_list", "manufacturers_list", "", "payload_ids_list", "wikipedia_list", "website_list", "twitter_list", "description_list", "context", "Landroid/content/Context;", "(Lcom/example/flightspacex/activity/ui/Missions/MissionListFragment;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getDescription_list$app_release", "()Ljava/util/ArrayList;", "setDescription_list$app_release", "(Ljava/util/ArrayList;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "getManufacturers_list$app_release", "setManufacturers_list$app_release", "getMission_id_list$app_release", "setMission_id_list$app_release", "getMission_name_list$app_release", "setMission_name_list$app_release", "getPayload_ids_list$app_release", "setPayload_ids_list$app_release", "getTwitter_list$app_release", "setTwitter_list$app_release", "getWebsite_list$app_release", "setWebsite_list$app_release", "getWikipedia_list$app_release", "setWikipedia_list$app_release", "getItemCount", "", "onBindViewHolder", "", "viewHolder", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "app_release"})
    public final class MissionListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.flightspacex.activity.ui.Missions.MissionListFragment.ViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> mission_name_list;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> mission_id_list;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.util.List<java.lang.String>> manufacturers_list;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.util.List<java.lang.String>> payload_ids_list;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> wikipedia_list;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> website_list;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> twitter_list;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> description_list;
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        private final android.view.LayoutInflater layoutInflater = null;
        
        public MissionListAdapter(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> mission_name_list, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> mission_id_list, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.util.List<java.lang.String>> manufacturers_list, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.util.List<java.lang.String>> payload_ids_list, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> wikipedia_list, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> website_list, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> twitter_list, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> description_list, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getMission_name_list$app_release() {
            return null;
        }
        
        public final void setMission_name_list$app_release(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getMission_id_list$app_release() {
            return null;
        }
        
        public final void setMission_id_list$app_release(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.util.List<java.lang.String>> getManufacturers_list$app_release() {
            return null;
        }
        
        public final void setManufacturers_list$app_release(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.util.List<java.lang.String>> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.util.List<java.lang.String>> getPayload_ids_list$app_release() {
            return null;
        }
        
        public final void setPayload_ids_list$app_release(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.util.List<java.lang.String>> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getWikipedia_list$app_release() {
            return null;
        }
        
        public final void setWikipedia_list$app_release(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getWebsite_list$app_release() {
            return null;
        }
        
        public final void setWebsite_list$app_release(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getTwitter_list$app_release() {
            return null;
        }
        
        public final void setTwitter_list$app_release(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getDescription_list$app_release() {
            return null;
        }
        
        public final void setDescription_list$app_release(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.example.flightspacex.activity.ui.Missions.MissionListFragment.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup viewGroup, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.flightspacex.activity.ui.Missions.MissionListFragment.ViewHolder viewHolder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/flightspacex/activity/ui/Missions/MissionListFragment$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "displayMissionListBinding", "Lcom/example/flightspacex/databinding/SingleMissionDisplayReceylerviewItemModelBinding;", "(Lcom/example/flightspacex/activity/ui/Missions/MissionListFragment;Landroid/view/View;Lcom/example/flightspacex/databinding/SingleMissionDisplayReceylerviewItemModelBinding;)V", "setData", "", "missionModel", "Lcom/example/flightspacex/data/models/MissionModel;", "app_release"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.flightspacex.databinding.SingleMissionDisplayReceylerviewItemModelBinding displayMissionListBinding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        com.example.flightspacex.databinding.SingleMissionDisplayReceylerviewItemModelBinding displayMissionListBinding) {
            super(null);
        }
        
        public final void setData(@org.jetbrains.annotations.NotNull()
        com.example.flightspacex.data.models.MissionModel missionModel) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/flightspacex/activity/ui/Missions/MissionListFragment$Companion;", "", "()V", "newInstance", "Lcom/example/flightspacex/activity/ui/Missions/MissionListFragment;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.flightspacex.activity.ui.Missions.MissionListFragment newInstance() {
            return null;
        }
    }
}