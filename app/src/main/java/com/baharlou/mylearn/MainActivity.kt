package com.baharlou.mylearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setViewPager()
    }

    private fun setViewPager() {
        var viewPagerAdapter = MyViewPagerAdapter(supportFragmentManager)
        view_pg.adapter = viewPagerAdapter

        val bgColor = resources.getIntArray(R.array.frag_color)

        view_pg.addOnPageChangeListener(object: ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                view_pg.setBackgroundColor(bgColor[position])
            }

            override fun onPageSelected(position: Int) {
            }

        })
    }


}
