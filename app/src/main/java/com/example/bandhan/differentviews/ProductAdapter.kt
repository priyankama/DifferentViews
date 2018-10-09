package com.example.bandhan.differentviews

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class ProductAdapter(val context : Context, val foodslist:List<Foods>): RecyclerView.Adapter<ProductAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_layout, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return foodslist.count()
    }

    override fun onBindViewHolder(holder: Holder, positon: Int) {
        holder?.bindCategory(foodslist[positon], context)
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {

        val foodImage = itemView?.findViewById<ImageView>(R.id.foodImg)
        val foodTitle = itemView?.findViewById<TextView>(R.id.foodName)
        val foodPrice = itemView?.findViewById<TextView>(R.id.foodPrice)
        fun bindCategory(foodList : Foods, context: Context) {
            val resId = context.resources.getIdentifier(foodList.image, "drawable", context.packageName)
            foodImage?.setImageResource(resId)
            foodTitle?.text = foodList.title
            foodPrice?.text = foodList.price
        }

    }
}