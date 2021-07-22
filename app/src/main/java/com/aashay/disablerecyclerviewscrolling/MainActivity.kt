package com.aashay.disablerecyclerviewscrolling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myRecyclerView = findViewById<RecyclerView>(R.id.recycler_view_1)

        // val myLinearLayoutManager = LinearLayoutManager(this)


        val myLinearLayoutManager = object : LinearLayoutManager(this) {
            override fun canScrollVertically(): Boolean {
                return false
            }
        }

        myRecyclerView.layoutManager = myLinearLayoutManager

        myRecyclerView.adapter = MyRecyclerViewAdapter()

    }


}