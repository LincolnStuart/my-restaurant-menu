package com.github.lincolnstuart.desafiointegradorandroidcomponentes.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.github.lincolnstuart.desafiointegradorandroidcomponentes.R

class SplashActivity : AppCompatActivity() {

    private val splashTimeout: Long = 3500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()
        initSplashTimer()
    }

    private fun initSplashTimer() {
        Handler().postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }, splashTimeout)
    }
}