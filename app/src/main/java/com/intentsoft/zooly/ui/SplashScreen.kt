package com.intentsoft.zooly.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.intentsoft.zooly.R
import com.intentsoft.zooly.ui.registration.Login_page

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            val intent = Intent(this, Login_page::class.java)
            startActivity(intent)
            finish()
        },3000)

    }
}