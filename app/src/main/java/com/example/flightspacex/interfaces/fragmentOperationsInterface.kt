package com.example.flightspacex.interfaces

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.flightspacex.R

interface fragmentOperationsInterface {

    fun fragmentTransaction(
        manager : FragmentManager,
        fragment: Fragment,
        container: Int,
        replace: Boolean,
        addToBackStack: Boolean,
        addAnimation: Boolean
    ) {

        val fragmentTransaction = manager.beginTransaction()
        if (addAnimation)
            fragmentTransaction.setCustomAnimations(
                R.anim.design_bottom_sheet_slide_in,
                R.anim.design_bottom_sheet_slide_out
            )
        if (replace)
            fragmentTransaction.replace(container, fragment, fragment.javaClass.name)
        else
            fragmentTransaction.add(container, fragment, fragment.javaClass.name)
        if (addToBackStack)
            fragmentTransaction.addToBackStack(fragment.javaClass.name)
        fragmentTransaction.commit()
    }

    fun removeFragment(
        manager : FragmentManager
    ){
        manager.popBackStack ()
    }

}