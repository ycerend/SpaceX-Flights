package com.example.flightspacex.activity.ui.Events

import android.content.Context
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
import com.example.flightspacex.R
import com.example.flightspacex.api.RetrofitClient
import com.example.flightspacex.data.models.HistoricalEvent
import com.example.flightspacex.data.models.Links
import com.example.flightspacex.databinding.SingleEventDisplayRecyclerviewItemModelBinding
import com.example.flightspacex.interfaces.fragmentOperationsInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.sql.Timestamp

class EventListFragment() : Fragment(), fragmentOperationsInterface {
    private var containerId : ViewGroup? = null
    private lateinit var recyclerView : RecyclerView

    private var id_list = ArrayList<Int>()
    private var title_list =  ArrayList<String>()
    private var event_date_utc_list = ArrayList<Timestamp>()
    private var event_date_unix_list = ArrayList<Int>()
    private var flight_number_list = ArrayList<Int>()
    private var detail_list = ArrayList<String>()
    private var links_list = ArrayList<Links>()

    companion object {
        fun newInstance(): EventListFragment {
            val args = Bundle()
            val fragment = EventListFragment()
            fragment.arguments = args
            return fragment
        }
    }


    private lateinit var viewModel: EventListViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)

        RetrofitClient.instance.getAllHistoricalEvents().enqueue(object :
            Callback<List<HistoricalEvent>> {
            override fun onResponse(
                call: Call<List<HistoricalEvent>>,
                response: Response<List<HistoricalEvent>>
            ) {
                println(response.toString())
                print("response " + (response.code() == 200 ))
                if(response.code() == 200 ){
                    print("burdayız")
                    var eventList = response?.body() as List<HistoricalEvent>
                    id_list.clear()
                    title_list.clear()
                    event_date_utc_list.clear()
                    event_date_unix_list.clear()
                    flight_number_list.clear()
                    detail_list.clear()
                    links_list.clear()


                    for (event in eventList) {
                        id_list.add(event.id as Int)
                        title_list.add(event.title as String)
                        event_date_utc_list.add(event.event_date_utc as Timestamp)
                        event_date_unix_list.add(event.event_date_unix as Int)
                        flight_number_list.add(event.flight_number as Int)
                        detail_list.add(event.details as String)
                        links_list.add(event.links as Links)



                    }
                    recyclerView.layoutManager = GridLayoutManager(context, 1)
                    recyclerView.adapter = EventListAdapter(id_list,title_list,event_date_utc_list,event_date_unix_list,flight_number_list,detail_list,links_list,context)


                }else{
                    print("nalaka")
                    Log.d("error message:", response.message())
                }
            }
            override fun onFailure(call: Call<List<HistoricalEvent>>, t: Throwable) {
                println(t.message)
                println(t)
                Toast.makeText(context,t.message, Toast.LENGTH_LONG).show()
            }
        })


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.event_list_fragment, container,
            false)
        val activity = activity as Context
        containerId = container
        recyclerView = view.findViewById(R.id.list_event_fragment_recyclerview) as RecyclerView
        recyclerView.layoutManager = GridLayoutManager(activity, 1)
        recyclerView.adapter = EventListAdapter(id_list,title_list,event_date_utc_list,event_date_unix_list,flight_number_list,detail_list,links_list,activity)


        return view
    }
    internal inner class EventListAdapter(
        internal var id_list : ArrayList<Int>,
        internal var title_list : ArrayList<String>,
        internal var event_date_utc_list :ArrayList<Timestamp>,
        internal var event_date_unix_list :ArrayList<Int>,
        internal var flight_number_list :ArrayList<Int>,
        internal var detail_list :ArrayList<String>,
        internal var links_list: ArrayList<Links>,
        val context: Context) :RecyclerView.Adapter<ViewHolder>(){

        private val layoutInflater = LayoutInflater.from(context)

        override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
            val singleEventDisplayRecyclerviewItemModelBinding =
                SingleEventDisplayRecyclerviewItemModelBinding.inflate(layoutInflater, viewGroup, false)
            return ViewHolder(singleEventDisplayRecyclerviewItemModelBinding.root, singleEventDisplayRecyclerviewItemModelBinding)
        }

        override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
            if (id_list[position].equals(""))
                id_list[position] = -1
            if (title_list[position].equals(""))
                title_list[position] = "-"
            if (event_date_unix_list[position].equals(""))
                event_date_unix_list[position] = 0
            if (flight_number_list[position].equals(""))
                flight_number_list[position] = -1
            if (detail_list[position].equals(""))
                detail_list[position] = "-"
            if (links_list[position].equals(""))
                links_list[position] = Links()



            val event = HistoricalEvent(title_list[position], id_list[position],event_date_utc_list[position], event_date_unix_list[position],
                flight_number_list[position],detail_list[position],links_list[position])

            val imageView = viewHolder.itemView.findViewById(R.id.event_list_item_image) as ImageView
            viewHolder.setData(event,"",imageView,activity as Context )



            /*val links_textview = viewHolder.itemView.findViewById(R.id.event_links) as TextView
            val link_str = links_list[position].toString()
            links_textview.setText(link_str)*/



            //viewHolder.itemView.setOnClickListener { listener.onArticleSelected(article,isGuest,isLoggedInUser,isFeedPage,isFollowing,userId) }
            viewHolder.itemView.setOnClickListener(object : View.OnClickListener {
                override fun onClick(v: View?) {
                    val parentActivityManager : FragmentManager = activity?.supportFragmentManager as FragmentManager


                    fragmentTransaction(
                        parentActivityManager,
                        SingleEventDisplayFragment.newInstance(event),
                        (containerId!!.id),
                        true,
                        true,
                        false)
                }
            })
        }

        override fun getItemCount() = title_list.size
    }



    internal inner class ViewHolder constructor(itemView: View,
                                                private val displayEventListBinding:
                                                SingleEventDisplayRecyclerviewItemModelBinding

    ) :
        RecyclerView.ViewHolder(itemView) {
        fun setData(historicalEvent: HistoricalEvent,imageUrl: String?,imageView:ImageView,context: Context) {
            print("##### SET DATA İÇİ " + historicalEvent.title)
            displayEventListBinding.historicalEvent = historicalEvent
        }

    }

}