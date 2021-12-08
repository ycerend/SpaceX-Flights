package com.example.flightspacex.activity.ui.Missions

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flightspacex.R
import com.example.flightspacex.activity.ui.Events.SingleEventDisplayFragment
import com.example.flightspacex.data.models.HistoricalEvent
import com.example.flightspacex.data.models.MissionModel
import com.example.flightspacex.databinding.SingleEventDisplayRecyclerviewItemModelBinding
import com.example.flightspacex.databinding.SingleMissionDisplayFragmentBinding
import com.example.flightspacex.databinding.SingleMissionDisplayReceylerviewItemModelBinding

class SingleMissionDisplayFragment : Fragment() {

    companion object {

        private const val MISSIONMODEL = "model"

        fun newInstance(missionModel: MissionModel): SingleMissionDisplayFragment {
            val args = Bundle()
            args.putSerializable(MISSIONMODEL, missionModel)
            val fragment = SingleMissionDisplayFragment()
            fragment.arguments = args
            return fragment
        }
    }

    private lateinit var viewModel: SingleMissionDisplayViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return inflater.inflate(R.layout.single_mission_display_fragment, container, false)
        val singleMissionDisplayFragmentBinding = SingleMissionDisplayFragmentBinding.inflate(inflater, container, false)

        val missionModel = requireArguments().getSerializable(MISSIONMODEL) as MissionModel
        singleMissionDisplayFragmentBinding.missionModel = missionModel
        //model.text = String.format(getString(R.string.description_format), model.description, model.url)
        return singleMissionDisplayFragmentBinding.root
    }



}