package com.intentsoft.zooly.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.intentsoft.zooly.R


class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>(){

    private val title = arrayOf("Saiga antelope","Deer of Bukhara ","Gazelle","Beautiful bustard","Manul","Caracal","Kulan (wild ass)","Menzibira marmot","Saiga antelope")
    private val draw = intArrayOf(R.drawable.animals,R.drawable.first,R.drawable.second,R.drawable.third,R.drawable.fourth,R.drawable.fifth,R.drawable.sixth,R.drawable.seventh,R.drawable.eighth,R.drawable.bird1)


    inner class MyViewHolder(view:View):RecyclerView.ViewHolder(view){
        var itemImage: ImageView
        var title: TextView
        var about1: TextView

        init {
            itemImage = view.findViewById(R.id.imageView2)
            title = view.findViewById(R.id.textView4)
            about1 = view.findViewById(R.id.about)
        }


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.home_item,parent,false)
        return MyViewHolder(v)
    }


    override fun getItemCount(): Int {
        return title.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImage.setImageResource(draw[position])
        holder.title.text  = title[position]
    }
}