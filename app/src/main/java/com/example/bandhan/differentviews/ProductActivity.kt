package com.example.bandhan.differentviews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.example.bandhan.differentviews.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {
    lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val foodType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductAdapter(this,Services.getFoodItems(foodType))
        recycler_product_list.adapter=adapter

        val layoutManager = GridLayoutManager(this,2)
        recycler_product_list.layoutManager=layoutManager
        recycler_product_list.setHasFixedSize(false)
    }
}
