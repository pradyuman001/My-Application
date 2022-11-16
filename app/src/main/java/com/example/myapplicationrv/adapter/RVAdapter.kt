package com.example.myapplicationrv.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplicationrv.R
import com.example.myapplicationrv.model.DataModel
import com.example.myapplicationrv.screen.MainActivity
import com.example.myapplicationrv.screen.ViewActivity2

class RVAdapter(val activity: MainActivity,val list: ArrayList<DataModel>) : RecyclerView.Adapter<RVAdapter.ViewData>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewData {
        val view = LayoutInflater.from(activity).inflate(R.layout.item,parent,false)
        return ViewData(view)
    }

    override fun onBindViewHolder(holder: ViewData, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.name.setText(list[position].name)

        holder.image.setOnClickListener {

            val intent = Intent(activity,ViewActivity2::class.java)
            intent.putExtra("name", list[position].name)
            intent.putExtra("image", list[position].image)
            activity.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewData(itemView: View) : RecyclerView.ViewHolder(itemView){

        val image = itemView.findViewById<ImageView>(R.id.image_view)
        val name = itemView.findViewById<TextView>(R.id.text_view)

    }
}