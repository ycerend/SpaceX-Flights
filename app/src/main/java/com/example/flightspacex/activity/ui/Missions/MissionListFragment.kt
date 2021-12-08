package com.example.flightspacex.activity.ui.Missions

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.flightspacex.R
import com.example.flightspacex.activity.ui.Events.EventListFragment
import com.example.flightspacex.activity.ui.Launchs.LaunchListFragment
import com.example.flightspacex.api.RetrofitClient
import com.example.flightspacex.data.models.HistoricalEvent
import com.example.flightspacex.data.models.Links
import com.example.flightspacex.data.models.MissionModel
import com.example.flightspacex.databinding.SingleMissionDisplayReceylerviewItemModelBinding
import com.example.flightspacex.interfaces.fragmentOperationsInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.sql.Timestamp

class MissionListFragment() : Fragment(), fragmentOperationsInterface {
    private var containerId : ViewGroup? = null
    private lateinit var recyclerView : RecyclerView


    private var mission_name_list= ArrayList<String>()
    private var mission_id_list= ArrayList<String>()
    private var manufacturers_list= ArrayList<List<String>>()
    private var payload_ids_list= ArrayList<List<String>>()
    private var wikipedia_list = ArrayList<String>()
    private var website_list = ArrayList<String>()
    private var twitter_list = ArrayList<String>()
    private var description_list= ArrayList<String>()


    companion object {
        fun newInstance(): MissionListFragment {
            val args = Bundle()
            val fragment = MissionListFragment()
            fragment.arguments = args
            return fragment
        }
    }
    private lateinit var viewModel: MissionListViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)

        RetrofitClient.instance.getAllMissions().enqueue(object :
            Callback<List<MissionModel>> {
            override fun onResponse(
                call: Call<List<MissionModel>>,
                response: Response<List<MissionModel>>
            ) {
                println(response.toString())
                print("response " + (response.code() == 200 ))
                if(response.code() == 200 ){
                    print("burdayız")
                    var missionList = response?.body() as List<MissionModel>

                    mission_name_list.clear()
                    mission_id_list.clear()
                    manufacturers_list.clear()
                    payload_ids_list.clear()
                    wikipedia_list.clear()
                    website_list.clear()
                    twitter_list.clear()
                    description_list.clear()




                    for (mission in missionList) {

                        mission_name_list.add(mission.mission_name)
                        mission_id_list.add(mission.mission_id)
                        manufacturers_list.add(mission.manufacturers)
                        payload_ids_list.add(mission.payload_ids)
                        wikipedia_list.add(mission.wikipedia)
                        website_list.add(mission.website)
                        twitter_list.add(mission.twitter)
                        description_list.add(mission.description )




                    }
                    recyclerView.layoutManager = GridLayoutManager(context, 1)
                    recyclerView.adapter = MissionListAdapter(mission_name_list, mission_id_list,manufacturers_list,payload_ids_list,wikipedia_list,website_list,twitter_list,description_list,context)

                }else{
                    print("nalaka")
                    Log.d("error message:", response.message())
                }
            }
            override fun onFailure(call: Call<List<MissionModel>>, t: Throwable) {
                println(t.message)
                println(t)
                Toast.makeText(context,t.message, Toast.LENGTH_LONG).show()
            }
        })}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return inflater.inflate(R.layout.mission_list_fragment, container, false)
        val view: View = inflater.inflate(R.layout.mission_list_fragment, container,
            false)
        val activity = activity as Context
        containerId = container
        recyclerView = view.findViewById(R.id.list_mission_fragment_recyclerview) as RecyclerView
        recyclerView.layoutManager = GridLayoutManager(activity, 1)
        recyclerView.adapter = MissionListAdapter(mission_name_list, mission_id_list,manufacturers_list,payload_ids_list,wikipedia_list,website_list,twitter_list,description_list,activity)


        return view
    }

    internal inner class MissionListAdapter(
        internal var mission_name_list: ArrayList<String>,
        internal var mission_id_list:ArrayList<String>,
        internal var manufacturers_list: ArrayList<List<String>>,
        internal var payload_ids_list: ArrayList<List<String>>,
        internal var wikipedia_list : ArrayList<String>,
        internal var website_list : ArrayList<String>,
        internal var twitter_list : ArrayList<String>,
        internal var description_list:ArrayList<String>,
        val context: Context) :RecyclerView.Adapter<ViewHolder>(){

        private val layoutInflater = LayoutInflater.from(context)

        override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
            val singleMissionDisplayReceylerviewItemModelBinding =
                SingleMissionDisplayReceylerviewItemModelBinding.inflate(layoutInflater, viewGroup, false)
            return  ViewHolder(singleMissionDisplayReceylerviewItemModelBinding.root, singleMissionDisplayReceylerviewItemModelBinding)
        }

        override fun onBindViewHolder(viewHolder:  ViewHolder, position: Int) {

            if (mission_name_list[position].equals(""))
                mission_name_list[position] = "-"

            if (mission_id_list[position].equals(""))
                mission_id_list[position] = ""

            if (manufacturers_list[position].equals(""))
                manufacturers_list[position] = listOf()

            if (payload_ids_list[position].equals(""))
                payload_ids_list[position] = listOf()

            if (wikipedia_list[position].equals(""))
                wikipedia_list[position] = "-"

            if (website_list[position].equals(""))
                website_list[position] = "-"

            if (twitter_list[position].equals(""))
                twitter_list[position] = "-"

            if (description_list[position].equals(""))
                description_list[position] = "-"

            val missionModel = MissionModel(
                mission_name_list[position],
                mission_id_list[position],
                manufacturers_list[position],
                payload_ids_list[position],
                wikipedia_list[position],
                website_list[position],
                twitter_list[position],
                description_list[position]
            )
            viewHolder.setData(missionModel)
            //viewHolder.itemView.setOnClickListener { listener.onArticleSelected(article,isGuest,isLoggedInUser,isFeedPage,isFollowing,userId) }
            viewHolder.itemView.setOnClickListener(object : View.OnClickListener {
                override fun onClick(v: View?) {
                    val parentActivityManager : FragmentManager = activity?.supportFragmentManager as FragmentManager


                    fragmentTransaction(
                        parentActivityManager,
                        SingleMissionDisplayFragment.newInstance(missionModel),
                        (containerId!!.id),
                        true,
                        true,
                        false)
                }
            })
        }

        override fun getItemCount() = mission_name_list.size
    }



    internal inner class ViewHolder constructor(itemView: View,
                                                private val displayMissionListBinding:
                                                SingleMissionDisplayReceylerviewItemModelBinding

    ):RecyclerView.ViewHolder(itemView) {
        fun setData(missionModel: MissionModel) {
            print("##### SET DATA İÇİ " + missionModel.mission_name)
            displayMissionListBinding.missionModel = missionModel
        }
    }

}