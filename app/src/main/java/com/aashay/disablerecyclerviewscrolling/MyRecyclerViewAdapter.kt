package com.aashay.disablerecyclerviewscrolling

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

private val myItemList = arrayListOf("Delhi", "Mumbai", "Hyderabad", "Bangalore", "Chennai", "Kolkata")

class MyRecyclerViewAdapter: RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder(v: View): RecyclerView.ViewHolder(v), View.OnClickListener{
        val tvPlaceName: TextView = v.findViewById(R.id.place_name)
        override fun onClick(v: View?) {
            TODO()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyRecyclerViewAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.card, parent, false))
    }

    override fun onBindViewHolder(holder: MyRecyclerViewAdapter.ViewHolder, position: Int) {
        holder.tvPlaceName.text = myItemList[position]
    }

    override fun getItemCount(): Int {
        return myItemList.size
    }
}