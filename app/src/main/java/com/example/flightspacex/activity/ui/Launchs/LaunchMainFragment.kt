package com.example.flightspacex.activity.ui.Launchs

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import com.example.flightspacex.R
import com.example.flightspacex.activity.MiddleMainActivity
import com.example.flightspacex.interfaces.fragmentOperationsInterface
import kotlin.properties.Delegates

class LaunchMainFragment() : Fragment(), fragmentOperationsInterface {
    companion object {
        fun newInstance() = LaunchMainFragment()
    }

    private lateinit var viewModel: LaunchMainViewModel
    private lateinit var parentActivityManager: FragmentManager
    private var containerId by Delegates.notNull<Int>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root =  inflater.inflate(R.layout.launch_main_fragment, container, false)
        val parentActivityManager : FragmentManager = activity?.supportFragmentManager as FragmentManager
        containerId= container!!.id





        val latestLaunchButton = root.findViewById<TextView>(R.id.latestLaunchesButton)
        latestLaunchButton.isEnabled = true
        latestLaunchButton.isClickable = true
        latestLaunchButton.setOnClickListener{root->
            val fragment = LatestLaunchFragment.newInstance()
            fragmentTransaction(
                parentActivityManager,
                fragment,
                containerId,
                true,
                true,
                false
            )
        }
        val nextLaunchButton = root.findViewById<TextView>(R.id.nextLaunchesButton)
        nextLaunchButton.isEnabled = true
        nextLaunchButton.isClickable = true
        nextLaunchButton.setOnClickListener{root->
            val fragment = LatestNextLaunchs.newInstance()
            fragmentTransaction(
                parentActivityManager,
                fragment,
                containerId,
                true,
                true,
                false
            )
        }
        return root

    }







}