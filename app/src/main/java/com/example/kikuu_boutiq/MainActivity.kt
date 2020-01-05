package com.example.kikuu_boutiq

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val splash_screen = 3000L
        Handler().postDelayed({
            val i = Intent(this@MainActivity,Main2Activity::class.java)
            startActivity(i)
            finish()
        },splash_screen)
    }
}
