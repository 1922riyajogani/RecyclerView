package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.Adapter.FragPageAdapter
import com.example.recyclerview.Fragments.CallsFragment
import com.example.recyclerview.Fragments.ChatsFragment
import com.example.recyclerview.Fragments.StatusFragment
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var titles = arrayOf("Chats","Status","Calls")
    var fragments = arrayOf(ChatsFragment(), StatusFragment(),CallsFragment())

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.vpFragements.adapter = FragPageAdapter(supportFragmentManager,fragments,titles)
        binding.tabTitle.setupWithViewPager(binding.vpFragements)
    }
}