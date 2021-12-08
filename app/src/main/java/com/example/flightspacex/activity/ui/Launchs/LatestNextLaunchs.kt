package com.example.flightspacex.activity.ui.Launchs

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.flightspacex.R
import com.example.flightspacex.activity.ui.Events.EventListFragment
import com.example.flightspacex.activity.ui.Events.SingleEventDisplayFragment
import com.example.flightspacex.api.RetrofitClient
import com.example.flightspacex.data.models.*
import com.example.flightspacex.databinding.SingleEventDisplayRecyclerviewItemModelBinding
import com.example.flightspacex.databinding.SingleLaunchDisplayRecyclerviewItemModelBinding
import com.example.flightspacex.interfaces.fragmentOperationsInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.net.URI
import java.sql.Time
import java.sql.Timestamp

class LatestNextLaunchs() : Fragment(),
    fragmentOperationsInterface {

    private var containerId: ViewGroup? = null
    private lateinit var recyclerView: RecyclerView

    private var flight_number_list = ArrayList<Int>()
    private var mission_name_list = ArrayList<String>()
    private var mission_id_list = ArrayList<List<String>>()
    private var launch_year_list = ArrayList<String>()
    private var launch_date_unix_list = ArrayList<Int>()
    private var launch_date_utc_list = ArrayList<Timestamp>()
    private var launch_date_local_list = ArrayList<Timestamp>()
    private var is_tentative_list = ArrayList<Boolean>()
    private var tentative_max_precision_list = ArrayList<String>()
    private var tbd_list = ArrayList<Boolean>()
    private var launch_window_list = ArrayList<Int>()
    private var rocket_list = ArrayList<Rocket>()
    private var ships_list = ArrayList<List<String>>()
    private var telemetry_list = ArrayList<Telemetry>()
    private var launch_site_list = ArrayList<LaunchSite>()
    private var launch_success_list = ArrayList<Boolean>()
    private var links_list = ArrayList<Links>()
    private var details_list = ArrayList<String>()
    private var upcoming_list = ArrayList<Boolean>()
    private var static_fire_date_utc_list = ArrayList<Timestamp>()
    private var static_fire_date_unix_list = ArrayList<Int>()
    private var timeline_list = ArrayList<Timeline>()


    companion object {
        fun newInstance(): LatestNextLaunchs {
            val args = Bundle()
            val fragment = LatestNextLaunchs()
            fragment.arguments = args
            return fragment
        }
    }


    private lateinit var viewModel: LatestNextLaunchsViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)


        val parentActivityManager: FragmentManager =
            activity?.supportFragmentManager as FragmentManager
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
                            (containerId!!.id),
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


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.latest_next_launchs_fragment, container, false)

        val activity = activity as Context



        return view
    }



}



//flight_number_list[position],mission_name_list[position],mission_id_list[position],launch_year_list[position],launch_date_unix_list[position],launch_date_utc_list[position],launch_date_local_list[position],is_tentative_list[position],tentative_max_precision_list[position],tbd_list[position],launch_window_list[position],rocket_list[position],ships_list[position],telemetry_list[position],aunch_site_list[position],launch_success_list[position],links_list[position],details_list[position],upcoming_list[position], static_fire_date_utc_list[position],static_fire_date_unix_list[position],timeline_list[position]