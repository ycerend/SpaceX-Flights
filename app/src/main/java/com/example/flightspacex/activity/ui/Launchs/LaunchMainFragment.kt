package com.example.flightspacex.activity.ui.Launchs

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import com.example.flightspacex.R
import com.example.flightspacex.activity.MiddleMainActivity
import com.example.flightspacex.api.RetrofitClient
import com.example.flightspacex.data.models.Launch
import com.example.flightspacex.interfaces.fragmentOperationsInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
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
            RetrofitClient.instance.getLatestLaunch()
                .enqueue(object : Callback<Launch> {
                    override fun onResponse(
                        call: Call<Launch>?,
                        response: Response<Launch>
                    ) {
                        if (response.code() == 200) {
                            val response_launch_next = response?.body() as Launch

                            fragmentTransaction(
                                parentActivityManager,
                                SingleLaunchDisplayFragment.newInstance(response_launch_next),
                                containerId,
                                true,
                                true,
                                false
                            )

                        } else {
                            print("nalaka")
                            Log.d("error message:", response.message())
                        }
                    }

                    override fun onFailure(call: Call<Launch>, t: Throwable) {
                        println(t.message)
                        println(t)
                        Toast.makeText(context, t.message, Toast.LENGTH_LONG).show()
                    }

                })

        }
        val nextLaunchButton = root.findViewById<TextView>(R.id.nextLaunchesButton)
        nextLaunchButton.isEnabled = true
        nextLaunchButton.isClickable = true
        nextLaunchButton.setOnClickListener{root->
            RetrofitClient.instance.getNextLaunch()
                .enqueue(object : Callback<Launch> {
                    override fun onResponse(
                        call: Call<Launch>?,
                        response: Response<Launch>
                    ) {
                        if (response.code() == 200) {
                            val response_launch_next = response?.body() as Launch

                            fragmentTransaction(
                                parentActivityManager,
                                SingleLaunchDisplayFragment.newInstance(response_launch_next),
                                containerId,
                                true,
                                true,
                                false
                            )

                        } else {
                            print("nalaka")
                            Log.d("error message:", response.message())
                        }
                    }

                    override fun onFailure(call: Call<Launch>, t: Throwable) {
                        println(t.message)
                        println(t)
                        Toast.makeText(context, t.message, Toast.LENGTH_LONG).show()
                    }

                })
        }
        return root

    }







}