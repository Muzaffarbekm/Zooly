package com.intentsoft.zooly.ui.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.intentsoft.zooly.R
import com.intentsoft.zooly.ui.MainActivity
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {
    var sampleImages = intArrayOf(
        R.drawable.splash_img,
        R.drawable.splash_img2
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        carouselView.pageCount = sampleImages.size
        carouselView.setImageListener { position, imageView ->
            imageView.setImageResource(sampleImages[position])
        }

        btnSKIP.setOnClickListener {
            startActivity(Intent(this, Login_page::class.java))
        }

    }
}