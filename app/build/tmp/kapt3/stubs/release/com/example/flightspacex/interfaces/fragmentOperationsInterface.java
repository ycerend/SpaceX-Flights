package com.example.flightspacex.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/example/flightspacex/interfaces/fragmentOperationsInterface;", "", "fragmentTransaction", "", "manager", "Landroidx/fragment/app/FragmentManager;", "fragment", "Landroidx/fragment/app/Fragment;", "container", "", "replace", "", "addToBackStack", "addAnimation", "removeFragment", "app_release"})
public abstract interface fragmentOperationsInterface {
    
    public abstract void fragmentTransaction(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager manager, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int container, boolean replace, boolean addToBackStack, boolean addAnimation);
    
    public abstract void removeFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager manager);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static void fragmentTransaction(@org.jetbrains.annotations.NotNull()
        com.example.flightspacex.interfaces.fragmentOperationsInterface $this, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager manager, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment, int container, boolean replace, boolean addToBackStack, boolean addAnimation) {
        }
        
        public static void removeFragment(@org.jetbrains.annotations.NotNull()
        com.example.flightspacex.interfaces.fragmentOperationsInterface $this, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager manager) {
        }
    }
}