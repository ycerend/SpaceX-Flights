package com.example.flightspacex.databinding;
import com.example.flightspacex.R;
import com.example.flightspacex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SingleLaunchDisplayRecyclerviewItemModelBindingImpl extends SingleLaunchDisplayRecyclerviewItemModelBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.launch_list_item_image, 2);
        sViewsWithIds.put(R.id.launch_list_text_layout, 3);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SingleLaunchDisplayRecyclerviewItemModelBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private SingleLaunchDisplayRecyclerviewItemModelBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.RelativeLayout) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.eventLayoutGeneral.setTag(null);
        this.launchName.setTag(null);
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
        if (BR.launchModel == variableId) {
            setLaunchModel((com.example.flightspacex.data.models.Launch) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLaunchModel(@Nullable com.example.flightspacex.data.models.Launch LaunchModel) {
        this.mLaunchModel = LaunchModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.launchModel);
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
        java.lang.String launchNameAndroidStringTopicLaunchModelMissionNameLaunchModelLaunchSuccess = null;
        java.lang.String launchModelMissionName = null;
        com.example.flightspacex.data.models.Launch launchModel = mLaunchModel;
        boolean launchModelLaunchSuccess = false;

        if ((dirtyFlags & 0x3L) != 0) {



                if (launchModel != null) {
                    // read launchModel.mission_name
                    launchModelMissionName = launchModel.getMission_name();
                    // read launchModel.launch_success
                    launchModelLaunchSuccess = launchModel.getLaunch_success();
                }


                // read @android:string/topic
                launchNameAndroidStringTopicLaunchModelMissionNameLaunchModelLaunchSuccess = launchName.getResources().getString(R.string.topic, launchModelMissionName, launchModelLaunchSuccess);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.launchName.setText(launchNameAndroidStringTopicLaunchModelMissionNameLaunchModelLaunchSuccess);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): launchModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}