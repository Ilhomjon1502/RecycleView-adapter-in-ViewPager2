package com.ilhomjon.recycleviewadapterinviewpager2

import Adapters.ImageAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var list:ArrayList<String>
    lateinit var imageAdapter: ImageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list = ArrayList()
        list.add("https://storage.kun.uz/source/thumbnails/_medium/7/wZeOa7dpr9UmjsZLgdoiqb225gIoYye4_medium.jpg")
        list.add("https://storage.kun.uz/source/thumbnails/_medium/7/biOotzA_2pJAxUma7vsbUjR5lIlkzdqA_medium.jpg")
        list.add("https://storage.kun.uz/source/thumbnails/_medium/7/lyekvEqGb7BveWYAyowANLn8G3UtFO60_medium.jpg")

        imageAdapter = ImageAdapter(list)
        view_pager_2.adapter = imageAdapter

        view_pager_2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                Toast.makeText(this@MainActivity, "onPageScrolled $position, $positionOffset, $positionOffsetPixels", Toast.LENGTH_SHORT).show()
            }

            override fun onPageSelected(position: Int) {
                Toast.makeText(this@MainActivity, "selected $position", Toast.LENGTH_SHORT).show()
            }

            override fun onPageScrollStateChanged(state: Int) {
                Toast.makeText(
                    this@MainActivity,
                    "onPageScrollStateChanged $state",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })

    }
}