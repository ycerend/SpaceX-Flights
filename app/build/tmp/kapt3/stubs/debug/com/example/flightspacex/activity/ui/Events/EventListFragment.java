package com.example.flightspacex.activity.ui.Events;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0003!\"#B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/example/flightspacex/activity/ui/Events/EventListFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/flightspacex/interfaces/fragmentOperationsInterface;", "()V", "containerId", "Landroid/view/ViewGroup;", "detail_list", "Ljava/util/ArrayList;", "", "event_date_unix_list", "", "event_date_utc_list", "Ljava/sql/Timestamp;", "flight_number_list", "id_list", "links_list", "Lcom/example/flightspacex/data/models/Links;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "title_list", "viewModel", "Lcom/example/flightspacex/activity/ui/Events/EventListViewModel;", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "EventListAdapter", "ViewHolder", "app_debug"})
public final class EventListFragment extends androidx.fragment.app.Fragment implements com.example.flightspacex.interfaces.fragmentOperationsInterface {
    private android.view.ViewGroup containerId;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private java.util.ArrayList<java.lang.Integer> id_list;
    private java.util.ArrayList<java.lang.String> title_list;
    private java.util.ArrayList<java.sql.Timestamp> event_date_utc_list;
    private java.util.ArrayList<java.lang.Integer> event_date_unix_list;
    private java.util.ArrayList<java.lang.Integer> flight_number_list;
    private java.util.ArrayList<java.lang.String> detail_list;
    private java.util.ArrayList<com.example.flightspacex.data.models.Links> links_list;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.flightspacex.activity.ui.Events.EventListFragment.Companion Companion = null;
    private com.example.flightspacex.activity.ui.Events.EventListViewModel viewModel;
    
    public EventListFragment() {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u00b5\u0001\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0007\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0005j\b\u0012\u0004\u0012\u00020\u000b`\u0007\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0007\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0005j\b\u0012\u0004\u0012\u00020\u0010`\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\b\u0010)\u001a\u00020\u0006H\u0016J\u001c\u0010*\u001a\u00020+2\n\u0010,\u001a\u00060\u0002R\u00020\u00032\u0006\u0010-\u001a\u00020\u0006H\u0016J\u001c\u0010.\u001a\u00060\u0002R\u00020\u00032\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0006H\u0016R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0005j\b\u0012\u0004\u0012\u00020\u000b`\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R*\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u0016\u0010\"\u001a\n $*\u0004\u0018\u00010#0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0005j\b\u0012\u0004\u0012\u00020\u0010`\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010\u0019R*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0017\"\u0004\b(\u0010\u0019\u00a8\u00062"}, d2 = {"Lcom/example/flightspacex/activity/ui/Events/EventListFragment$EventListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/flightspacex/activity/ui/Events/EventListFragment$ViewHolder;", "Lcom/example/flightspacex/activity/ui/Events/EventListFragment;", "id_list", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "title_list", "", "event_date_utc_list", "Ljava/sql/Timestamp;", "event_date_unix_list", "flight_number_list", "detail_list", "links_list", "Lcom/example/flightspacex/data/models/Links;", "context", "Landroid/content/Context;", "(Lcom/example/flightspacex/activity/ui/Events/EventListFragment;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getDetail_list$app_debug", "()Ljava/util/ArrayList;", "setDetail_list$app_debug", "(Ljava/util/ArrayList;)V", "getEvent_date_unix_list$app_debug", "setEvent_date_unix_list$app_debug", "getEvent_date_utc_list$app_debug", "setEvent_date_utc_list$app_debug", "getFlight_number_list$app_debug", "setFlight_number_list$app_debug", "getId_list$app_debug", "setId_list$app_debug", "layoutInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "getLinks_list$app_debug", "setLinks_list$app_debug", "getTitle_list$app_debug", "setTitle_list$app_debug", "getItemCount", "onBindViewHolder", "", "viewHolder", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
    public final class EventListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.flightspacex.activity.ui.Events.EventListFragment.ViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.Integer> id_list;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> title_list;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.sql.Timestamp> event_date_utc_list;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.Integer> event_date_unix_list;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.Integer> flight_number_list;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<java.lang.String> detail_list;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<com.example.flightspacex.data.models.Links> links_list;
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        private final android.view.LayoutInflater layoutInflater = null;
        
        public EventListAdapter(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.Integer> id_list, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> title_list, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.sql.Timestamp> event_date_utc_list, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.Integer> event_date_unix_list, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.Integer> flight_number_list, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> detail_list, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.example.flightspacex.data.models.Links> links_list, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.Integer> getId_list$app_debug() {
            return null;
        }
        
        public final void setId_list$app_debug(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.Integer> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getTitle_list$app_debug() {
            return null;
        }
        
        public final void setTitle_list$app_debug(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.sql.Timestamp> getEvent_date_utc_list$app_debug() {
            return null;
        }
        
        public final void setEvent_date_utc_list$app_debug(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.sql.Timestamp> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.Integer> getEvent_date_unix_list$app_debug() {
            return null;
        }
        
        public final void setEvent_date_unix_list$app_debug(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.Integer> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.Integer> getFlight_number_list$app_debug() {
            return null;
        }
        
        public final void setFlight_number_list$app_debug(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.Integer> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getDetail_list$app_debug() {
            return null;
        }
        
        public final void setDetail_list$app_debug(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.example.flightspacex.data.models.Links> getLinks_list$app_debug() {
            return null;
        }
        
        public final void setLinks_list$app_debug(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.example.flightspacex.data.models.Links> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.example.flightspacex.activity.ui.Events.EventListFragment.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup viewGroup, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.flightspacex.activity.ui.Events.EventListFragment.ViewHolder viewHolder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/flightspacex/activity/ui/Events/EventListFragment$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "displayEventListBinding", "Lcom/example/flightspacex/databinding/SingleEventDisplayRecyclerviewItemModelBinding;", "(Lcom/example/flightspacex/activity/ui/Events/EventListFragment;Landroid/view/View;Lcom/example/flightspacex/databinding/SingleEventDisplayRecyclerviewItemModelBinding;)V", "setData", "", "historicalEvent", "Lcom/example/flightspacex/data/models/HistoricalEvent;", "imageUrl", "", "imageView", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.flightspacex.databinding.SingleEventDisplayRecyclerviewItemModelBinding displayEventListBinding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        com.example.flightspacex.databinding.SingleEventDisplayRecyclerviewItemModelBinding displayEventListBinding) {
            super(null);
        }
        
        public final void setData(@org.jetbrains.annotations.NotNull()
        com.example.flightspacex.data.models.HistoricalEvent historicalEvent, @org.jetbrains.annotations.Nullable()
        java.lang.String imageUrl, @org.jetbrains.annotations.NotNull()
        android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/flightspacex/activity/ui/Events/EventListFragment$Companion;", "", "()V", "newInstance", "Lcom/example/flightspacex/activity/ui/Events/EventListFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.flightspacex.activity.ui.Events.EventListFragment newInstance() {
            return null;
        }
    }
}