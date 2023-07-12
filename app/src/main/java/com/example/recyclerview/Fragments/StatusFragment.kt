package com.example.recyclerview.Fragments

import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.Adapter.StatusAdapter
import com.example.recyclerview.ProfileModel
import com.example.recyclerview.R
import com.example.recyclerview.databinding.FragmentStatus2Binding

class StatusFragment : Fragment() {

    var imgs = arrayOf(
        R.drawable.img1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
        R.drawable.image6,
        R.drawable.image7,
        R.drawable.image8,
        R.drawable.image9,
        R.drawable.image10
    )

    var name = arrayOf("Mansi","Shivani","Hasti","Princy","Mitixa","Yesha","Nency","Dharmi","Bhumi","Bsc.it")
    lateinit var binding: FragmentStatus2Binding
    var userList = ArrayList<ProfileModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStatus2Binding.inflate(layoutInflater)
        for (i in 0..imgs.size - 1){
            var model = ProfileModel(imgs[i],name[i])
            userList.add(model)
        }
        binding.rcvStatus.layoutManager = LinearLayoutManager(context)
        binding.rcvStatus.adapter = StatusAdapter(userList)
        
        return binding.root
    }

}
