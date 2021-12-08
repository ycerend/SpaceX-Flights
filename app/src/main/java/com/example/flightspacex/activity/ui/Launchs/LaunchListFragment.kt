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

class LaunchListFragment(upcoming: Boolean, past: Boolean, latest: Boolean, next: Boolean) : Fragment(),
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
        fun newInstance(
            upcoming: Boolean,
            past: Boolean,
            latest: Boolean,
            next: Boolean
        ): LaunchListFragment {
            val args = Bundle()
            val fragment = LaunchListFragment(upcoming, past, latest, next)
            fragment.arguments = args
            return fragment
        }
    }


    private lateinit var viewModel: LaaunchListViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val upcoming = requireArguments().getBoolean("upcoming")
        val past = requireArguments().getBoolean("past")
        val latest = requireArguments().getBoolean("latest")
        val next = requireArguments().getBoolean("next")

        if(latest){
            val parentActivityManager: FragmentManager =
                activity?.supportFragmentManager as FragmentManager

            activity?.supportFragmentManager as FragmentManager
            RetrofitClient.instance.getLatestLaunch()
                .enqueue(object : Callback<Launch> {
                    override fun onResponse(
                        call: Call<Launch>?,
                        response: Response<Launch>
                    ) {
                        if(response.code() == 200 ){
                            val response_launch_latest = response?.body() as Launch

                            fragmentTransaction(
                                parentActivityManager,
                                SingleLaunchDisplayFragment.newInstance(response_launch_latest),
                                (containerId!!.id),
                                true,
                                true,
                                false
                            )

                        }
                        else{
                            print("nalaka")
                            Log.d("error message:", response.message())
                        }
                    }
                    override fun onFailure(call: Call<Launch>, t: Throwable) {
                        println(t.message)
                        println(t)
                        Toast.makeText(context,t.message, Toast.LENGTH_LONG).show()
                    }

                })


        }
        else if(next){
            val parentActivityManager: FragmentManager =
                activity?.supportFragmentManager as FragmentManager
            RetrofitClient.instance.getNextLaunch()
                .enqueue(object : Callback<Launch> {
                    override fun onResponse(
                        call: Call<Launch>?,
                        response: Response<Launch>
                    ) {
                        if(response.code() == 200 ){
                            val response_launch_next = response?.body() as Launch

                            fragmentTransaction(
                                parentActivityManager,
                                SingleLaunchDisplayFragment.newInstance(response_launch_next),
                                (containerId!!.id),
                                true,
                                true,
                                false
                            )

                        }
                        else{
                            print("nalaka")
                            Log.d("error message:", response.message())
                        }
                    }
                    override fun onFailure(call: Call<Launch>, t: Throwable) {
                        println(t.message)
                        println(t)
                        Toast.makeText(context,t.message, Toast.LENGTH_LONG).show()
                    }

                })


        }
        else if(upcoming){
            RetrofitClient.instance.getAllUpcomingLaunches().enqueue(object :
                Callback<List<Launch>> {
                override fun onResponse(
                    call: Call<List<Launch>>,
                    response: Response<List<Launch>>
                ) {
                    println(response.toString())
                    print("response " + (response.code() == 200 ))
                    if(response.code() == 200 ){
                        print("burdayız")
                        var launchList = response?.body() as List<Launch>
                        flight_number_list.clear()
                        mission_name_list.clear()
                        mission_id_list.clear()
                        launch_year_list.clear()
                        launch_date_unix_list.clear()
                        launch_date_utc_list.clear()
                        launch_date_local_list.clear()
                        is_tentative_list.clear()

                        tentative_max_precision_list.clear()
                        tbd_list.clear()
                        launch_window_list.clear()
                        rocket_list.clear()
                        ships_list.clear()
                        telemetry_list.clear()
                        launch_site_list.clear()
                        launch_success_list.clear()
                        links_list.clear()
                        details_list.clear()
                        upcoming_list.clear()

                        static_fire_date_utc_list.clear()
                        static_fire_date_unix_list.clear()
                        timeline_list.clear()


                        for (launch in launchList) {
                            flight_number_list.add(launch.flight_number)
                            mission_name_list.add(launch.mission_name )
                            mission_id_list.add(launch.mission_id )
                            launch_year_list.add(launch.launch_year )
                            launch_date_unix_list.add(launch.launch_date_unix )
                            launch_date_utc_list.add(launch.launch_date_utc)
                            launch_date_local_list.add(launch.launch_date_local )
                            is_tentative_list.add(launch.is_tentative)

                            tentative_max_precision_list.add(launch.tentative_max_precision )
                            tbd_list.add(launch.tbd )
                            launch_window_list.add(launch.launch_window)
                            rocket_list.add(launch.rocket)
                            ships_list.add(launch.ships )
                            telemetry_list.add(launch.telemetry )
                            launch_site_list.add(launch.launch_site )
                            launch_success_list.add(launch.launch_success )
                            links_list.add(launch.links as Links)
                            details_list.add(launch.details )
                            upcoming_list.add(launch.upcoming )

                            static_fire_date_utc_list.add(launch.static_fire_date_utc )
                            static_fire_date_unix_list.add(launch.static_fire_date_unix)
                            timeline_list.add(launch.timeline)

                        }
                        recyclerView.layoutManager = GridLayoutManager(context, 1)
                        recyclerView.adapter = LaunchListAdapter(
                            flight_number_list,
                            mission_name_list,
                            mission_id_list,
                            launch_year_list,
                            launch_date_unix_list,
                            launch_date_utc_list,
                            launch_date_local_list,
                            is_tentative_list,
                            tentative_max_precision_list,
                            tbd_list,
                            launch_window_list,
                            rocket_list,
                            ships_list,
                            telemetry_list,
                            launch_site_list,
                            launch_success_list,
                            links_list,
                            details_list,
                            upcoming_list,
                            static_fire_date_utc_list,
                            static_fire_date_unix_list,
                            timeline_list,
                            context
                        )

                    }else{
                        print("nalaka")
                        Log.d("error message:", response.message())
                    }
                }
                override fun onFailure(call: Call<List<Launch>>, t: Throwable) {
                    println(t.message)
                    println(t)
                    Toast.makeText(context,t.message, Toast.LENGTH_LONG).show()
                }
            })
        }
        else if(past){
            RetrofitClient.instance.getAllPastLaunches().enqueue(object :
                Callback<List<Launch>> {
                override fun onResponse(
                    call: Call<List<Launch>>,
                    response: Response<List<Launch>>
                ) {
                    println(response.toString())
                    print("response " + (response.code() == 200 ))
                    if(response.code() == 200 ){
                        print("burdayız")
                        var launchList = response?.body() as List<Launch>
                        flight_number_list.clear()
                        mission_name_list.clear()
                        mission_id_list.clear()
                        launch_year_list.clear()
                        launch_date_unix_list.clear()
                        launch_date_utc_list.clear()
                        launch_date_local_list.clear()
                        is_tentative_list.clear()

                        tentative_max_precision_list.clear()
                        tbd_list.clear()
                        launch_window_list.clear()
                        rocket_list.clear()
                        ships_list.clear()
                        telemetry_list.clear()
                        launch_site_list.clear()
                        launch_success_list.clear()
                        links_list.clear()
                        details_list.clear()
                        upcoming_list.clear()

                        static_fire_date_utc_list.clear()
                        static_fire_date_unix_list.clear()
                        timeline_list.clear()


                        for (launch in launchList) {
                            flight_number_list.add(launch.flight_number)
                            mission_name_list.add(launch.mission_name )
                            mission_id_list.add(launch.mission_id )
                            launch_year_list.add(launch.launch_year )
                            launch_date_unix_list.add(launch.launch_date_unix )
                            launch_date_utc_list.add(launch.launch_date_utc)
                            launch_date_local_list.add(launch.launch_date_local )
                            is_tentative_list.add(launch.is_tentative)

                            tentative_max_precision_list.add(launch.tentative_max_precision )
                            tbd_list.add(launch.tbd )
                            launch_window_list.add(launch.launch_window)
                            rocket_list.add(launch.rocket)
                            ships_list.add(launch.ships )
                            telemetry_list.add(launch.telemetry )
                            launch_site_list.add(launch.launch_site )
                            launch_success_list.add(launch.launch_success )
                            links_list.add(launch.links as Links)
                            details_list.add(launch.details )
                            upcoming_list.add(launch.upcoming )

                            static_fire_date_utc_list.add(launch.static_fire_date_utc )
                            static_fire_date_unix_list.add(launch.static_fire_date_unix)
                            timeline_list.add(launch.timeline)

                        }
                        recyclerView.layoutManager = GridLayoutManager(context, 1)
                        recyclerView.adapter = LaunchListAdapter(
                            flight_number_list,
                            mission_name_list,
                            mission_id_list,
                            launch_year_list,
                            launch_date_unix_list,
                            launch_date_utc_list,
                            launch_date_local_list,
                            is_tentative_list,
                            tentative_max_precision_list,
                            tbd_list,
                            launch_window_list,
                            rocket_list,
                            ships_list,
                            telemetry_list,
                            launch_site_list,
                            launch_success_list,
                            links_list,
                            details_list,
                            upcoming_list,
                            static_fire_date_utc_list,
                            static_fire_date_unix_list,
                            timeline_list,
                            context
                        )

                    }else{
                        print("nalaka")
                        Log.d("error message:", response.message())
                    }
                }
                override fun onFailure(call: Call<List<Launch>>, t: Throwable) {
                    println(t.message)
                    println(t)
                    Toast.makeText(context,t.message, Toast.LENGTH_LONG).show()
                }
            })
        }


    }

    private fun arrangeListItemsForRecycleView(launchList: List<Launch>) {
        flight_number_list.clear()
        mission_name_list.clear()
        mission_id_list.clear()
        launch_year_list.clear()
        launch_date_unix_list.clear()
        launch_date_utc_list.clear()
        launch_date_local_list.clear()
        is_tentative_list.clear()

        tentative_max_precision_list.clear()
        tbd_list.clear()
        launch_window_list.clear()
        rocket_list.clear()
        ships_list.clear()
        telemetry_list.clear()
        launch_site_list.clear()
        launch_success_list.clear()
        links_list.clear()
        details_list.clear()
        upcoming_list.clear()

        static_fire_date_utc_list.clear()
        static_fire_date_unix_list.clear()
        timeline_list.clear()


        for (launch in launchList) {
            flight_number_list.add(launch.flight_number)
            mission_name_list.add(launch.mission_name )
            mission_id_list.add(launch.mission_id )
            launch_year_list.add(launch.launch_year )
            launch_date_unix_list.add(launch.launch_date_unix )
            launch_date_utc_list.add(launch.launch_date_utc)
            launch_date_local_list.add(launch.launch_date_local )
            is_tentative_list.add(launch.is_tentative)

            tentative_max_precision_list.add(launch.tentative_max_precision )
            tbd_list.add(launch.tbd )
            launch_window_list.add(launch.launch_window)
            rocket_list.add(launch.rocket)
            ships_list.add(launch.ships )
            telemetry_list.add(launch.telemetry )
            launch_site_list.add(launch.launch_site )
            launch_success_list.add(launch.launch_success )
            links_list.add(launch.links as Links)
            details_list.add(launch.details )
            upcoming_list.add(launch.upcoming )

            static_fire_date_utc_list.add(launch.static_fire_date_utc )
            static_fire_date_unix_list.add(launch.static_fire_date_unix)
            timeline_list.add(launch.timeline)

        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.launch_list_fragment, container, false)

        val activity = activity as Context
        containerId = container
        recyclerView = view.findViewById(R.id.list_Launch_fragment_recyclerview) as RecyclerView
        recyclerView.layoutManager = GridLayoutManager(activity, 1)
        recyclerView.adapter = LaunchListAdapter(
            flight_number_list,
            mission_name_list,
            mission_id_list,
            launch_year_list,
            launch_date_unix_list,
            launch_date_utc_list,
            launch_date_local_list,
            is_tentative_list,
            tentative_max_precision_list,
            tbd_list,
            launch_window_list,
            rocket_list,
            ships_list,
            telemetry_list,
            launch_site_list,
            launch_success_list,
            links_list,
            details_list,
            upcoming_list,
            static_fire_date_utc_list,
            static_fire_date_unix_list,
            timeline_list,
            activity
        )


        return view
    }



    internal inner class LaunchListAdapter(
        internal var flight_number_list : ArrayList<Int>,
        internal var mission_name_list : ArrayList<String>,
        internal var mission_id_list : ArrayList<List<String>>,
        internal var launch_year_list : ArrayList<String>,
        internal var launch_date_unix_list : ArrayList<Int>,
        internal var launch_date_utc_list : ArrayList<Timestamp>,
        internal var launch_date_local_list : ArrayList<Timestamp>,
        internal var is_tentative_list : ArrayList<Boolean>,
        internal var tentative_max_precision_list : ArrayList<String>,
        internal var tbd_list : ArrayList<Boolean>,
        internal var launch_window_list : ArrayList<Int>,
        internal var rocket_list : ArrayList<Rocket>,
        internal var ships_list : ArrayList<List<String>>,
        internal var telemetry_list : ArrayList<Telemetry>,
        internal var launch_site_list : ArrayList<LaunchSite>,
        internal var launch_success_list : ArrayList<Boolean>,
        internal var links_list : ArrayList<Links>,
        internal var details_list : ArrayList<String>,
        internal var upcoming_list : ArrayList<Boolean>,
        internal var static_fire_date_utc_list : ArrayList<Timestamp>,
        internal var static_fire_date_unix_list : ArrayList<Int>,
        internal var timeline_list : ArrayList<Timeline>,
        val context: Context) :RecyclerView.Adapter<ViewHolder>() {

        private val layoutInflater = LayoutInflater.from(context)

        override fun onCreateViewHolder(
            viewGroup: ViewGroup,
            viewType: Int
        ): ViewHolder {
            val singleLaunchDisplayRecyclerviewItemModelBinding =
                SingleLaunchDisplayRecyclerviewItemModelBinding.inflate(
                    layoutInflater,
                    viewGroup,
                    false
                )
            return ViewHolder(
                singleLaunchDisplayRecyclerviewItemModelBinding.root,
                singleLaunchDisplayRecyclerviewItemModelBinding
            )
        }


        override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

            if (flight_number_list[position].equals(""))
                flight_number_list[position] = -1

            if (mission_name_list[position].equals(""))
                mission_name_list[position] = "-"

            if (mission_id_list[position].equals(""))
                mission_id_list[position] = listOf("")

            if (flight_number_list[position].equals(""))
                flight_number_list[position] = -1

            if (launch_year_list[position].equals(""))
                launch_year_list[position] = "-"

            if (launch_date_unix_list[position].equals(""))
                launch_date_unix_list[position] = -1

            if (launch_date_utc_list[position].equals(""))
                launch_date_utc_list[position] = Timestamp(11111)
            if (launch_date_local_list[position].equals(""))
                launch_date_local_list[position] = Timestamp(11111)

            if (is_tentative_list[position].equals(""))
                is_tentative_list[position] = false

            if (tentative_max_precision_list[position].equals(""))
                tentative_max_precision_list[position] = "-"

            if (tbd_list[position].equals(""))
                tbd_list[position] = false

            if (launch_window_list[position].equals(""))
                launch_window_list[position] = -1

            if (rocket_list[position].equals(""))
                rocket_list[position] = Rocket()

                if (ships_list[position].equals(""))
                    ships_list[position] = listOf()

                if (telemetry_list[position].equals(""))
                    telemetry_list[position] = Telemetry()

                if (launch_site_list[position].equals(""))
                    launch_site_list[position] = LaunchSite()

                if (launch_success_list[position].equals(""))
                    launch_success_list[position] = false

                if (links_list[position].equals(""))
                    links_list[position] = Links()

                if (details_list[position].equals(""))
                    details_list[position] = "-"

                if (upcoming_list[position].equals(""))
                    upcoming_list[position] = false

                if (static_fire_date_utc_list[position].equals(""))
                    static_fire_date_utc_list[position] = Timestamp(1111)
                if (static_fire_date_unix_list[position].equals(""))
                    static_fire_date_unix_list[position] = -1
                if (timeline_list[position].equals(""))
                    timeline_list[position] = Timeline()


                val launch = Launch(
                    flight_number_list[position],
                    mission_name_list[position],
                    mission_id_list[position],
                    launch_year_list[position],
                    launch_date_unix_list[position],
                    launch_date_utc_list[position],
                    launch_date_local_list[position],
                    is_tentative_list[position],
                    tentative_max_precision_list[position],
                    tbd_list[position],
                    launch_window_list[position],
                    rocket_list[position],
                    ships_list[position],
                    telemetry_list[position],
                    launch_site_list[position],
                    launch_success_list[position],
                    links_list[position],
                    details_list[position],
                    upcoming_list[position],
                    static_fire_date_utc_list[position],
                    static_fire_date_unix_list[position],
                    timeline_list[position]
                )

                val imageView =
                    viewHolder.itemView.findViewById(R.id.launch_list_item_image) as ImageView
                viewHolder.setData(
                    launch,
                    links_list[position]?.flickr_images[0],
                    imageView,
                    activity as Context
                )


                /*val links_textview = viewHolder.itemView.findViewById(R.id.event_links) as TextView
            val link_str = links_list[position].toString()
            links_textview.setText(link_str)*/


                //viewHolder.itemView.setOnClickListener { listener.onArticleSelected(article,isGuest,isLoggedInUser,isFeedPage,isFollowing,userId) }
                viewHolder.itemView.setOnClickListener(object : View.OnClickListener {
                    override fun onClick(v: View?) {
                        val parentActivityManager: FragmentManager =
                            activity?.supportFragmentManager as FragmentManager


                        fragmentTransaction(
                            parentActivityManager,
                            SingleLaunchDisplayFragment.newInstance(launch),
                            (containerId!!.id),
                            true,
                            true,
                            false
                        )
                    }
                })
            }

            override fun getItemCount() = mission_id_list.size
        }


        internal inner class ViewHolder constructor(
            itemView: View,
            private val displayLaunchListBinding:
            SingleLaunchDisplayRecyclerviewItemModelBinding

        ) :
            RecyclerView.ViewHolder(itemView) {
            fun setData(
                launchModel: Launch,
                imageUrl: String?,
                imageView: ImageView,
                context: Context
            ) {
                print("##### SET DATA İÇİ " + launchModel.mission_id + " " + launchModel.mission_name)
                if (imageUrl != "") {
                    var url = URI(imageUrl)
                    System.out.print(url)
                    Glide.with(context).asBitmap().load(url).into(imageView)
                } else {
                    val imgResId = R.drawable.ic_event_item_icon_image_foreground
                    imageView.setImageResource(imgResId)

                }
                displayLaunchListBinding.launchModel = launchModel
            }


        }

    }



//flight_number_list[position],mission_name_list[position],mission_id_list[position],launch_year_list[position],launch_date_unix_list[position],launch_date_utc_list[position],launch_date_local_list[position],is_tentative_list[position],tentative_max_precision_list[position],tbd_list[position],launch_window_list[position],rocket_list[position],ships_list[position],telemetry_list[position],aunch_site_list[position],launch_success_list[position],links_list[position],details_list[position],upcoming_list[position], static_fire_date_utc_list[position],static_fire_date_unix_list[position],timeline_list[position]