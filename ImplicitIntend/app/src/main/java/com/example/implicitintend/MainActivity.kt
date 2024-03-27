package com.example.implicitintend

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val web=findViewById<CardView>(R.id.web)
        val camera=findViewById<CardView>(R.id.camera)
        web.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://scholarship.up.gov.in/")
            startActivity(intent)

        }

        camera.setOnClickListener{
            val intent =Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)

        }

    }
}