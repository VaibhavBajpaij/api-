package com.example.expliciteintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnIntent = findViewById<Button>(R.id.button)

        btnIntent.setOnClickListener{


        }
    }
}