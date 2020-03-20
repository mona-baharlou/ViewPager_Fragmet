package com.baharlou.mylearn

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class MyViewPagerAdapter(supportFragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(supportFragmentManager) {
    override fun getItem(position: Int): Fragment {
        return MyFragment.newInstance("FRAGMENT $position")
    }

    override fun getCount(): Int {
        return 4
    }


}