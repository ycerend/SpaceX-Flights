package com.example.flightspacex.databinding;
import com.example.flightspacex.R;
import com.example.flightspacex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SingleEventDisplayRecyclerviewItemModelBindingImpl extends SingleEventDisplayRecyclerviewItemModelBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.event_list_item_image, 2);
        sViewsWithIds.put(R.id.event_list_text_layout, 3);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SingleEventDisplayRecyclerviewItemModelBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private SingleEventDisplayRecyclerviewItemModelBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.RelativeLayout) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.eventLayoutGeneral.setTag(null);
        this.eventName.setTag(null);
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
        java.lang.String historicalEventTitle = null;
        com.example.flightspacex.data.models.HistoricalEvent historicalEvent = mHistoricalEvent;

        if ((dirtyFlags & 0x3L) != 0) {



                if (historicalEvent != null) {
                    // read historicalEvent.title
                    historicalEventTitle = historicalEvent.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.eventName.setText(historicalEventTitle);
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