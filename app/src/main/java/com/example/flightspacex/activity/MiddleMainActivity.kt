package com.example.flightspacex.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.ui.AppBarConfiguration
import com.example.flightspacex.MainActivity
import com.example.flightspacex.R
import com.example.flightspacex.activity.ui.Events.EventListFragment
import com.example.flightspacex.activity.ui.Launchs.LaunchMainFragment
import com.example.flightspacex.activity.ui.Missions.MissionListFragment
import com.example.flightspacex.databinding.ActivityMiddleMainBinding
import com.example.flightspacex.interfaces.fragmentOperationsInterface
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MiddleMainActivity : AppCompatActivity(), fragmentOperationsInterface {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMiddleMainBinding
    private var content : FrameLayout? = null

    //private var navController :NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_middle_main)
        //setSupportActionBar(findViewById(R.id.bottom_navigatin_view))
        val navigation = findViewById<BottomNavigationView>(R.id.bottom_navigatin_view)

        val event = intent.getBooleanExtra("Event",true)
        val launch=intent.getBooleanExtra("Launch",false)
        val mission = intent.getBooleanExtra("Mission",false)
        val content =  findViewById(R.id.content_middle) as View
        val fragmentEventList: Fragment = EventListFragment()
        val fragmentMissionList: Fragment = MissionListFragment()
        val fragmentLaunch: Fragment = LaunchMainFragment()

        var active = fragmentEventList

        if(event){
            val fragment = EventListFragment.Companion.newInstance()

            fragmentTransaction(
                supportFragmentManager,
                fragment,
                content!!.id,
                true,
                true,
                false
            )
            /*supportFragmentManager.beginTransaction().add(R.id.content_middle, fragmentLaunch, "3").hide(fragmentLaunch).commit();
            supportFragmentManager.beginTransaction().add(R.id.content_middle, fragmentMissionList, "2").hide(fragmentMissionList).commit();
            supportFragmentManager.beginTransaction().add(R.id.content_middle,fragmentEventList, "1").commit();
            active = fragmentEventList*/

        }else if(launch){
            val fragment = LaunchMainFragment.Companion.newInstance()
            fragmentTransaction(
                supportFragmentManager,
                fragment,
                content!!.id,
                true,
                true,
                false
            )
        }else if(mission){
            val fragment = MissionListFragment.Companion.newInstance()
            fragmentTransaction(
                supportFragmentManager,
                fragment,
                content!!.id,
                true,
                true,
                false
            )

        }else{
            val fragment = EventListFragment.Companion.newInstance()

            fragmentTransaction(
                supportFragmentManager,
                fragment,
                content!!.id,
                true,
                true,
                false
            )

        }
        navigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_events -> {
                    val fragment = EventListFragment.Companion.newInstance()
                    fragmentTransaction(
                        supportFragmentManager,
                        fragment,
                        content!!.id,
                        true,
                        true,
                        false
                    )
                    return@setOnItemSelectedListener true
                }
                R.id.navigation_missions -> {
                    val fragment = MissionListFragment.Companion.newInstance()
                    fragmentTransaction(
                        supportFragmentManager,
                        fragment,
                        content!!.id,
                        true,
                        true,
                        false
                    )

                    return@setOnItemSelectedListener true
                }
                R.id.navigation_launch -> {
                    val fragment = LaunchMainFragment.Companion.newInstance()
                    fragmentTransaction(
                        supportFragmentManager,
                        fragment,
                        content!!.id,
                        true,
                        true,
                        false
                    )
                    return@setOnItemSelectedListener true
                }

            }
            false
        }
    }
    companion object {
        fun getLaunchIntent(from : Context) = Intent(from, MainActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }

    override fun onBackPressed() {}



    }


