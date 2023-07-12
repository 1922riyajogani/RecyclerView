package com.example.recyclerview.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.ProfileModel
import com.example.recyclerview.R
import de.hdodenhof.circleimageview.CircleImageView

class ChatsAdapter(dataList: ArrayList<ProfileModel>):
    RecyclerView.Adapter<ChatsAdapter.ChatsHolder>() {

    var dataList = dataList
    lateinit var context: Context

    class ChatsHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var image = itemView.findViewById<CircleImageView>(R.id.cimgProfile)
        var name = itemView.findViewById<TextView>(R.id.txtname)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ChatsHolder {
       context = parent.context
       var view = LayoutInflater.from(parent.context).inflate(R.layout.chats_item,parent,false)
       return ChatsHolder(view)
    }

    override fun onBindViewHolder(holder: ChatsAdapter.ChatsHolder, position: Int) {
        holder.name.text = dataList.get(position).name
        holder.image.setImageResource(dataList.get(position).image)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}