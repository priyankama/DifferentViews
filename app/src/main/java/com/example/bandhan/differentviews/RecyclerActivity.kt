package com.example.bandhan.differentviews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler.*
import kotlinx.android.synthetic.main.custom_food_layout.*

class RecyclerActivity : AppCompatActivity() {
    lateinit var adapter: RecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        adapter = RecyclerAdapter(this, Services.foodcategories){categories ->
            println(categories.title)
        }
        recycler_food_list.adapter = adapter

        val layoutmanager = LinearLayoutManager(this)
        recycler_food_list.layoutManager = layoutmanager
        recycler_food_list.setHasFixedSize(true)
    }
}
