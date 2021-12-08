package com.example.flightspacex.activity.ui.Events

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.flightspacex.R
import com.example.flightspacex.data.models.HistoricalEvent
import com.example.flightspacex.databinding.SingleEventDisplayFragmentBinding
import com.example.flightspacex.databinding.SingleEventDisplayRecyclerviewItemModelBinding

class SingleEventDisplayFragment : Fragment() {


    companion object {

        private const val HISTORICALEVENTMODEL = "model"

        fun newInstance(historicalEvent: HistoricalEvent): SingleEventDisplayFragment {
            val args = Bundle()
            args.putSerializable(HISTORICALEVENTMODEL, historicalEvent)
            val fragment = SingleEventDisplayFragment()
            fragment.arguments = args
            return fragment
        }
    }

    private lateinit var viewModel: SingleEventDisplayViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val singleEventDisplayFragmentBinding = SingleEventDisplayFragmentBinding.inflate(inflater, container, false)

        val link_textview_article =singleEventDisplayFragmentBinding.eventLinksArticle as TextView
        link_textview_article.setMovementMethod(LinkMovementMethod.getInstance());

        val link_textview_wiki =  singleEventDisplayFragmentBinding.eventLinksArticle as TextView
        link_textview_wiki.setMovementMethod(LinkMovementMethod.getInstance());

        val historicalEvent = requireArguments().getSerializable(HISTORICALEVENTMODEL) as HistoricalEvent
        singleEventDisplayFragmentBinding.historicalEvent = historicalEvent
        //model.text = String.format(getString(R.string.description_format), model.description, model.url)
        return singleEventDisplayFragmentBinding.root
    }



}