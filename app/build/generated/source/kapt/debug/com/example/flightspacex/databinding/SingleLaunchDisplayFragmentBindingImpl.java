package com.example.flightspacex.databinding;
import com.example.flightspacex.R;
import com.example.flightspacex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SingleLaunchDisplayFragmentBindingImpl extends SingleLaunchDisplayFragmentBinding  {

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

    public SingleLaunchDisplayFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private SingleLaunchDisplayFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.launchDetails.setTag(null);
        this.launchLinksArticle.setTag(null);
        this.launchLinksWiki.setTag(null);
        this.launchTime.setTag(null);
        this.launchTopic.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
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
        java.lang.String launchTopicAndroidStringTopicLaunchModelMissionNameLaunchModelLaunchSuccess = null;
        java.lang.String launchModelLinksArticle = null;
        com.example.flightspacex.data.models.Launch launchModel = mLaunchModel;
        boolean launchModelLaunchSuccess = false;
        java.sql.Timestamp launchModelLaunchDateUtc = null;
        java.lang.String launchModelMissionName = null;
        java.lang.String launchModelDetails = null;
        java.lang.String launchModelLaunchDateUtcToString = null;
        com.example.flightspacex.data.models.Links launchModelLinks = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (launchModel != null) {
                    // read launchModel.launch_success
                    launchModelLaunchSuccess = launchModel.getLaunch_success();
                    // read launchModel.launch_date_utc
                    launchModelLaunchDateUtc = launchModel.getLaunch_date_utc();
                    // read launchModel.mission_name
                    launchModelMissionName = launchModel.getMission_name();
                    // read launchModel.details
                    launchModelDetails = launchModel.getDetails();
                    // read launchModel.links
                    launchModelLinks = launchModel.getLinks();
                }


                if (launchModelLaunchDateUtc != null) {
                    // read launchModel.launch_date_utc.toString()
                    launchModelLaunchDateUtcToString = launchModelLaunchDateUtc.toString();
                }
                // read @android:string/topic
                launchTopicAndroidStringTopicLaunchModelMissionNameLaunchModelLaunchSuccess = launchTopic.getResources().getString(R.string.topic, launchModelMissionName, launchModelLaunchSuccess);
                if (launchModelLinks != null) {
                    // read launchModel.links.article
                    launchModelLinksArticle = launchModelLinks.getArticle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.launchDetails, launchModelDetails);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.launchLinksArticle, launchModelLinksArticle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.launchLinksWiki, launchModelLinksArticle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.launchTime, launchModelLaunchDateUtcToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.launchTopic, launchTopicAndroidStringTopicLaunchModelMissionNameLaunchModelLaunchSuccess);
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