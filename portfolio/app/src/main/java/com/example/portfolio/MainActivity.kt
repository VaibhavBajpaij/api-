package com.example.portfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonbark =findViewById<Button>(R.id.btndark)
        val buttonlight =findViewById<Button>(R.id.btnlight)
        val layout =findViewById<LinearLayout>(R.id.linearLayout)

        buttonlight.setOnClickListener{
             //change to to ligth mode
            layout.setBackgroundResource(R.color.yellow)
        }
        buttonbark.setOnClickListener{
            //change to to dark mode
            layout.setBackgroundResource(R.color.black)
        }

    }
}