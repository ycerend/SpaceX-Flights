package com.example.flightspacex.databinding;
import com.example.flightspacex.R;
import com.example.flightspacex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SingleMissionDisplayReceylerviewItemModelBindingImpl extends SingleMissionDisplayReceylerviewItemModelBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mission_list_text_layout, 2);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SingleMissionDisplayReceylerviewItemModelBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private SingleMissionDisplayReceylerviewItemModelBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.RelativeLayout) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.missionLayoutGeneral.setTag(null);
        this.missionName.setTag(null);
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
        if (BR.missionModel == variableId) {
            setMissionModel((com.example.flightspacex.data.models.MissionModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMissionModel(@Nullable com.example.flightspacex.data.models.MissionModel MissionModel) {
        this.mMissionModel = MissionModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.missionModel);
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
        com.example.flightspacex.data.models.MissionModel missionModel = mMissionModel;
        java.lang.String missionModelMissionName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (missionModel != null) {
                    // read missionModel.mission_name
                    missionModelMissionName = missionModel.getMission_name();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.missionName.setText(missionModelMissionName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): missionModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}