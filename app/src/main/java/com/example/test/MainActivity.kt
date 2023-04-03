package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Intent(this, ExampleService::class.java).also { intent -> startService(intent) }

        val forceGroundServiceIntent = Intent(applicationContext, ForegroundServiceEx::class.java)
        forceGroundServiceIntent.putExtra("inputExtra", "Foreground Service Example in Android")
        ContextCompat.startForegroundService(this, forceGroundServiceIntent)
    }
}