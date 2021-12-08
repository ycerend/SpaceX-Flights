// Generated by data binding compiler. Do not edit!
package com.example.flightspacex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.flightspacex.R;
import com.example.flightspacex.data.models.Launch;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SingleLaunchDisplayFragmentBinding extends ViewDataBinding {
  @NonNull
  public final TextView launchDetails;

  @NonNull
  public final TextView launchLinksArticle;

  @NonNull
  public final TextView launchLinksWiki;

  @NonNull
  public final TextView launchTime;

  @NonNull
  public final TextView launchTopic;

  @Bindable
  protected Launch mLaunchModel;

  protected SingleLaunchDisplayFragmentBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView launchDetails, TextView launchLinksArticle,
      TextView launchLinksWiki, TextView launchTime, TextView launchTopic) {
    super(_bindingComponent, _root, _localFieldCount);
    this.launchDetails = launchDetails;
    this.launchLinksArticle = launchLinksArticle;
    this.launchLinksWiki = launchLinksWiki;
    this.launchTime = launchTime;
    this.launchTopic = launchTopic;
  }

  public abstract void setLaunchModel(@Nullable Launch launchModel);

  @Nullable
  public Launch getLaunchModel() {
    return mLaunchModel;
  }

  @NonNull
  public static SingleLaunchDisplayFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.single_launch_display_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SingleLaunchDisplayFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SingleLaunchDisplayFragmentBinding>inflateInternal(inflater, R.layout.single_launch_display_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static SingleLaunchDisplayFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.single_launch_display_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SingleLaunchDisplayFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SingleLaunchDisplayFragmentBinding>inflateInternal(inflater, R.layout.single_launch_display_fragment, null, false, component);
  }

  public static SingleLaunchDisplayFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static SingleLaunchDisplayFragmentBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (SingleLaunchDisplayFragmentBinding)bind(component, view, R.layout.single_launch_display_fragment);
  }
}
