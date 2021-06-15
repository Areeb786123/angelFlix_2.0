package com.areeb.angelflix_20.Views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.areeb.angelflix_20.MainActivity
import com.areeb.angelflix_20.R
import kotlinx.coroutines.MainScope

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            val splash_intent = Intent(this, MainActivity()::class.java)
            startActivity(splash_intent)
            finish()

        },3000)
    }
}