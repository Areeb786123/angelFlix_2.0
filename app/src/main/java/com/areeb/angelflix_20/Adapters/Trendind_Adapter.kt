package com.areeb.angelflix_20.Adapters

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.areeb.angelflix_20.R
import com.areeb.angelflix_20.TrendingModel.results
import com.squareup.picasso.Picasso

class Trendind_Adapter(val context:Context
, var trending_movie :List<results>)
    :RecyclerView.Adapter<Trendind_Adapter.Trending_ViewHolder>()
{


    class Trending_ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        var trending_image=itemView.findViewById<ImageView>(R.id.trending_image)
        var trending_rating=itemView.findViewById<TextView>(R.id.trending_rating)
        var trending_name =itemView.findViewById<TextView>(R.id.trending_name)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Trending_ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.trending_item,parent,false)
        return  Trending_ViewHolder(view)
    }

    override fun onBindViewHolder(holder: Trending_ViewHolder, position: Int) {
        //holder.trending_rating.text= trending_item[position].vote_average.toString().toFloat().toString()
        holder.trending_name.text= trending_movie!![position].name

        Picasso.get().load("https://image.tmdb.org/t/p/original/"+ trending_movie!![position].poster_path).into(holder.trending_image)
    }


    override fun getItemCount(): Int {
        return trending_movie?.size!!
    }


}
