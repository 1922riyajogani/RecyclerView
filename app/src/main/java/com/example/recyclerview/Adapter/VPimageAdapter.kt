package com.example.recyclerview.Adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.example.recyclerview.Click.VPclick
import com.example.recyclerview.R

class VPimageAdapter(imgs: Array<Int>,click: VPclick): PagerAdapter() {

    var images = imgs
    var click = click

    override fun getCount(): Int {
        return  images.size
    }

    override fun isViewFromObject(view: View, obj: Any): Boolean {
       return view == obj
    }

    @SuppressLint("MissingInflatedId")
    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        var view = LayoutInflater.from(container.context).inflate(R.layout.vp_item,container,false)
        //var binding =
       //     VpItemBinding.inflate(LayoutInflater.from(container.context),container,false)

         var imgItem = view.findViewById<ImageView>(R.id.imgItem)
         imgItem.setImageResource(images.get(position))

        //binding.imgItem.setImageResource(images.get(position))

        container.addView(view)
        //container.addView(binding.root)

       return view
       //return binding.root

    }


    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
       container.removeView(obj as View?)
    }

}