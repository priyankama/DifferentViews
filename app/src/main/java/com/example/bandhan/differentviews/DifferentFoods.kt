package com.example.bandhan.differentviews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_different_foods.*

class DifferentFoods : AppCompatActivity() {
    lateinit var adapter : ArrayAdapter<Categories>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_different_foods)
        adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,Services.foodcategories)
        food_list_item.adapter = adapter
    }

}
