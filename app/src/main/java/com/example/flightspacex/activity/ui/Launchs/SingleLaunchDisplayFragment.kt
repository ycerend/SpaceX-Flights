package com.example.flightspacex.activity.ui.Launchs

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.flightspacex.R
import com.example.flightspacex.activity.ui.Events.SingleEventDisplayFragment
import com.example.flightspacex.data.models.HistoricalEvent
import com.example.flightspacex.data.models.Launch
import com.example.flightspacex.databinding.SingleEventDisplayFragmentBinding
import com.example.flightspacex.databinding.SingleLaunchDisplayFragmentBinding

class SingleLaunchDisplayFragment : Fragment() {

    companion object {

        private const val LAUNCHMODEL = "model"

        fun newInstance(launchModel: Launch): SingleLaunchDisplayFragment {
            val args = Bundle()
            args.putSerializable(LAUNCHMODEL, launchModel)
            val fragment = SingleLaunchDisplayFragment()
            fragment.arguments = args
            return fragment
        }
    }

    private lateinit var viewModel: SingleLaunchDisplayViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val singleLaunchDisplayFragmentBinding = SingleLaunchDisplayFragmentBinding.inflate(inflater, container, false)

        var link_launch_wiki = singleLaunchDisplayFragmentBinding.launchLinksWiki as TextView
        link_launch_wiki.setMovementMethod(LinkMovementMethod.getInstance());

        val launchModel = requireArguments().getSerializable(SingleLaunchDisplayFragment.LAUNCHMODEL) as Launch
        singleLaunchDisplayFragmentBinding.launchModel = launchModel
        //model.text = String.format(getString(R.string.description_format), model.description, model.url)
        return singleLaunchDisplayFragmentBinding.root
    }



}