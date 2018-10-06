package com.example.bandhan.differentviews

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
class RecyclerAdapter(val context : Context,val foodcategory:List<Categories>,val itemClick : (Categories)->Unit):RecyclerView.Adapter<RecyclerAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.custom_food_layout, parent, false)
        return Holder(view,itemClick)
    }

    override fun getItemCount(): Int {
        return foodcategory.count()
    }

    override fun onBindViewHolder(holder: Holder, positon: Int) {
        holder?.bindCategory(foodcategory[positon], context)
    }

    inner class Holder(itemView: View?,val itemClick: (Categories) -> Unit) : RecyclerView.ViewHolder(itemView!!) {

        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryimage)
        val categoryTitle = itemView?.findViewById<TextView>(R.id.categorytitle)
        fun bindCategory(category: Categories, context: Context) {
            val resId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage?.setImageResource(resId)
            categoryTitle?.text = category.title
            itemView.setOnClickListener { itemClick(category) }
        }

    }
}

