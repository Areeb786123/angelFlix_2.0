package com.areeb.angelflix_20.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.areeb.angelflix_20.Adapters.Trendind_Adapter
import com.areeb.angelflix_20.R
import com.areeb.angelflix_20.TrendingModel.results
import com.areeb.angelflix_20.ViewModel.trending_View_Model


class homeFragment : Fragment() {

    lateinit var trending_adapter: Trendind_Adapter
    lateinit var trending_recycle: RecyclerView
    lateinit var trendingViewModel: trending_View_Model


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        trending_recycle = root.findViewById(R.id.trending_recycl)

        //trending_adapter=Trendind_Adapter()



        trending_recycle.layoutManager = LinearLayoutManager(activity)
        trending_recycle.setHasFixedSize(true)


        trending_recycle.adapter = trending_adapter
        trending_adapter.notifyDataSetChanged()
        trendingViewModel.trending_movies.observe(viewLifecycleOwner, Observer {
            trending_adapter.trending_movie = it
        })







        return root

    }


}