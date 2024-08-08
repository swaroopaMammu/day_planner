package com.example.dayplanner

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.dayplanner.databinding.ActivitySplashScreenBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : AppCompatActivity() {

    private lateinit var dataBinding : ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_splash_screen)
        val scope = CoroutineScope(Dispatchers.Main)
        scope.launch {
            delay(3000)
            val intent = Intent(this@SplashScreen,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}