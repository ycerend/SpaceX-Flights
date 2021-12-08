package com.example.flightspacex.databinding;
import com.example.flightspacex.R;
import com.example.flightspacex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SingleEventDisplayFragmentBindingImpl extends SingleEventDisplayFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SingleEventDisplayFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private SingleEventDisplayFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.eventDetails.setTag(null);
        this.eventLinksArticle.setTag(null);
        this.eventLinksWiki.setTag(null);
        this.eventTime.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.historicalEvent == variableId) {
            setHistoricalEvent((com.example.flightspacex.data.models.HistoricalEvent) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHistoricalEvent(@Nullable com.example.flightspacex.data.models.HistoricalEvent HistoricalEvent) {
        this.mHistoricalEvent = HistoricalEvent;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.historicalEvent);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String historicalEventDetails = null;
        com.example.flightspacex.data.models.Links historicalEventLinks = null;
        java.sql.Timestamp historicalEventEventDateUtc = null;
        java.lang.String historicalEventLinksArticle = null;
        java.lang.String historicalEventLinksWikipedia = null;
        java.lang.String historicalEventTitle = null;
        com.example.flightspacex.data.models.HistoricalEvent historicalEvent = mHistoricalEvent;
        java.lang.String historicalEventEventDateUtcToGMTString = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (historicalEvent != null) {
                    // read historicalEvent.details
                    historicalEventDetails = historicalEvent.getDetails();
                    // read historicalEvent.links
                    historicalEventLinks = historicalEvent.getLinks();
                    // read historicalEvent.event_date_utc
                    historicalEventEventDateUtc = historicalEvent.getEvent_date_utc();
                    // read historicalEvent.title
                    historicalEventTitle = historicalEvent.getTitle();
                }


                if (historicalEventLinks != null) {
                    // read historicalEvent.links.article
                    historicalEventLinksArticle = historicalEventLinks.getArticle();
                    // read historicalEvent.links.wikipedia
                    historicalEventLinksWikipedia = historicalEventLinks.getWikipedia();
                }
                if (historicalEventEventDateUtc != null) {
                    // read historicalEvent.event_date_utc.toGMTString()
                    historicalEventEventDateUtcToGMTString = historicalEventEventDateUtc.toGMTString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.eventDetails, historicalEventDetails);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.eventLinksArticle, historicalEventLinksArticle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.eventLinksWiki, historicalEventLinksWikipedia);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.eventTime, historicalEventEventDateUtcToGMTString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, historicalEventTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): historicalEvent
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}