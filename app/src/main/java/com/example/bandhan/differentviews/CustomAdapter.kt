package com.example.bandhan.differentviews

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(context : Context,foodcategory:List<Categories>) : BaseAdapter() {
    val context = context
    val foodcategory = foodcategory

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
       val foodItemsView : View
        val holder:ViewHolder
        if(convertView==null){
            holder= ViewHolder()
            foodItemsView= LayoutInflater.from(context).inflate(R.layout.custom_food_layout,null)
            holder.categoryImage = foodItemsView.findViewById(R.id.categoryimage)
            holder.categoryTitle= foodItemsView.findViewById(R.id.categorytitle)
            foodItemsView.tag=holder
        }else{
            holder = convertView.tag as ViewHolder
            foodItemsView=convertView
        }


        val category = foodcategory[position]
        val resId =context.resources.getIdentifier(category.image,"drawable",context.packageName)
        holder.categoryImage?.setImageResource(resId)
        holder.categoryTitle?.text = category.title
        return foodItemsView
    }

    override fun getItem(position: Int): Any {
      return  foodcategory[position]
    }

    override fun getItemId(position: Int): Long {
       return 0
    }

    override fun getCount(): Int {
        return foodcategory.count()
    }
    private class ViewHolder(){
        var categoryImage:ImageView?=null
        var categoryTitle:TextView?=null
    }


}