package com.example.recyclerview.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class FragPageAdapter (fm: FragmentManager, fragments: Array<Fragment>, titles: Array<String>): FragmentPagerAdapter(fm){

    var fragments   = fragments
    var titles  = titles

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments.get(position)
    }


    override fun getPageTitle(position: Int): CharSequence? {
        return titles.get(position)
    }
}