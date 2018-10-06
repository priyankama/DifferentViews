package com.example.bandhan.differentviews

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_different_foods.*

class DifferentFoods : AppCompatActivity() {
   //lateinit var adapter : ArrayAdapter<Categories>
    lateinit var adapter : CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_different_foods)
       // adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,Services.foodcategories)
        adapter=CustomAdapter(this,Services.foodcategories)
        food_list_item.adapter = adapter
    }
    fun btnRecyclerClicked(view:View){
        val intent = Intent(this,RecyclerActivity::class.java)
        startActivity(intent)
        finish()
    }

}
