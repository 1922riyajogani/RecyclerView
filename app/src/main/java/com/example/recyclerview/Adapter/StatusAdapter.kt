package com.example.recyclerview.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview.ProfileModel
import com.example.recyclerview.R
import de.hdodenhof.circleimageview.CircleImageView

class StatusAdapter (userList: ArrayList<ProfileModel>):RecyclerView.Adapter<StatusAdapter.StatusHolder>(){

    var userList = userList
    lateinit var context: Context

    class StatusHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var imageProfile = itemView.findViewById<CircleImageView>(R.id.cimgProfile)
        var name = itemView.findViewById<TextView>(R.id.txtname)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusHolder {
        context = parent.context
        var view = LayoutInflater.from(parent.context).inflate(R.layout.status_item,parent,false)
        return StatusHolder(view)
    }

    override fun onBindViewHolder(holder: StatusAdapter.StatusHolder, position: Int) {
        holder.name.text = userList.get(position).name
        Glide.with(context).load(userList.get(position).image).into(holder.imageProfile)

        }

    override fun getItemCount(): Int {
        return  userList.size
    }
}