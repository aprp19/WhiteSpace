package com.aprp.whitespace.Walktrough

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.aprp.whitespace.MainActivity
import com.aprp.whitespace.R
import kotlinx.android.synthetic.main.activity_walktrough.dots
import kotlinx.android.synthetic.main.activity_walktrough.frame
import kotlinx.android.synthetic.main.activity_walktrough.pager

class WalktroughActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walktrough)

        pager.adapter = WalktroughAdapter()
        pager.offscreenPageLimit = 3
        dots.attachViewPager(pager)

        pager.onPageSelected {
            val colorRes = when (it) {
                0 -> R.color.white
                1 -> R.color.white
                2 -> R.color.white
                else -> R.color.white
            }
            val color = ContextCompat.getColor(this, colorRes)
            frame.setBackgroundColor(color)
            dots.setDotTintRes(if (color.isColorLight()) R.color.black else R.color.white)
        }

        val imgBtn = findViewById<ImageView>(R.id.bt1)
        imgBtn.setOnClickListener {startActivity(Intent(this,MainActivity::class.java))}
    }
}
