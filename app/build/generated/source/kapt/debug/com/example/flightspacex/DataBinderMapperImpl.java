package com.example.flightspacex;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.flightspacex.databinding.SingleEventDisplayFragmentBindingImpl;
import com.example.flightspacex.databinding.SingleEventDisplayRecyclerviewItemModelBindingImpl;
import com.example.flightspacex.databinding.SingleLaunchDisplayFragmentBindingImpl;
import com.example.flightspacex.databinding.SingleLaunchDisplayRecyclerviewItemModelBindingImpl;
import com.example.flightspacex.databinding.SingleMissionDisplayFragmentBindingImpl;
import com.example.flightspacex.databinding.SingleMissionDisplayReceylerviewItemModelBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_SINGLEEVENTDISPLAYFRAGMENT = 1;

  private static final int LAYOUT_SINGLEEVENTDISPLAYRECYCLERVIEWITEMMODEL = 2;

  private static final int LAYOUT_SINGLELAUNCHDISPLAYFRAGMENT = 3;

  private static final int LAYOUT_SINGLELAUNCHDISPLAYRECYCLERVIEWITEMMODEL = 4;

  private static final int LAYOUT_SINGLEMISSIONDISPLAYFRAGMENT = 5;

  private static final int LAYOUT_SINGLEMISSIONDISPLAYRECEYLERVIEWITEMMODEL = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.flightspacex.R.layout.single_event_display_fragment, LAYOUT_SINGLEEVENTDISPLAYFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.flightspacex.R.layout.single_event_display_recyclerview_item_model, LAYOUT_SINGLEEVENTDISPLAYRECYCLERVIEWITEMMODEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.flightspacex.R.layout.single_launch_display_fragment, LAYOUT_SINGLELAUNCHDISPLAYFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.flightspacex.R.layout.single_launch_display_recyclerview_item_model, LAYOUT_SINGLELAUNCHDISPLAYRECYCLERVIEWITEMMODEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.flightspacex.R.layout.single_mission_display_fragment, LAYOUT_SINGLEMISSIONDISPLAYFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.flightspacex.R.layout.single_mission_display_receylerview_item_model, LAYOUT_SINGLEMISSIONDISPLAYRECEYLERVIEWITEMMODEL);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_SINGLEEVENTDISPLAYFRAGMENT: {
          if ("layout/single_event_display_fragment_0".equals(tag)) {
            return new SingleEventDisplayFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for single_event_display_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_SINGLEEVENTDISPLAYRECYCLERVIEWITEMMODEL: {
          if ("layout/single_event_display_recyclerview_item_model_0".equals(tag)) {
            return new SingleEventDisplayRecyclerviewItemModelBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for single_event_display_recyclerview_item_model is invalid. Received: " + tag);
        }
        case  LAYOUT_SINGLELAUNCHDISPLAYFRAGMENT: {
          if ("layout/single_launch_display_fragment_0".equals(tag)) {
            return new SingleLaunchDisplayFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for single_launch_display_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_SINGLELAUNCHDISPLAYRECYCLERVIEWITEMMODEL: {
          if ("layout/single_launch_display_recyclerview_item_model_0".equals(tag)) {
            return new SingleLaunchDisplayRecyclerviewItemModelBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for single_launch_display_recyclerview_item_model is invalid. Received: " + tag);
        }
        case  LAYOUT_SINGLEMISSIONDISPLAYFRAGMENT: {
          if ("layout/single_mission_display_fragment_0".equals(tag)) {
            return new SingleMissionDisplayFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for single_mission_display_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_SINGLEMISSIONDISPLAYRECEYLERVIEWITEMMODEL: {
          if ("layout/single_mission_display_receylerview_item_model_0".equals(tag)) {
            return new SingleMissionDisplayReceylerviewItemModelBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for single_mission_display_receylerview_item_model is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "historicalEvent");
      sKeys.put(2, "launchModel");
      sKeys.put(3, "missionModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/single_event_display_fragment_0", com.example.flightspacex.R.layout.single_event_display_fragment);
      sKeys.put("layout/single_event_display_recyclerview_item_model_0", com.example.flightspacex.R.layout.single_event_display_recyclerview_item_model);
      sKeys.put("layout/single_launch_display_fragment_0", com.example.flightspacex.R.layout.single_launch_display_fragment);
      sKeys.put("layout/single_launch_display_recyclerview_item_model_0", com.example.flightspacex.R.layout.single_launch_display_recyclerview_item_model);
      sKeys.put("layout/single_mission_display_fragment_0", com.example.flightspacex.R.layout.single_mission_display_fragment);
      sKeys.put("layout/single_mission_display_receylerview_item_model_0", com.example.flightspacex.R.layout.single_mission_display_receylerview_item_model);
    }
  }
}
