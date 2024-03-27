package com.example.photoframe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var currentImage = 0
    lateinit var image: ImageView // Declare image variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val prev = findViewById<ImageButton>(R.id.imgp)
        val next = findViewById<ImageButton>(R.id.imgn)
        //image = findViewById(R.id.imageView) // Initialize image variable with the ImageView from layout

        prev.setOnClickListener{
            // Build the string to get the resource ID of the current image
            val idCurrentImageString = "pic$currentImage"
            // Get the resource ID associated with the string
            val idCurrentImageInt = resources.getIdentifier(idCurrentImageString, "drawable", packageName)
            // Set the alpha of the current image to 0
            image.setImageResource(idCurrentImageInt)
            image.alpha = 0f

            // Calculate the index of the previous image
            currentImage = (4 + currentImage - 1) % 4

            // Build the string to get the resource ID of the image to show
            val idImageToShowString = "pic$currentImage"
            // Get the resource ID associated with the string
            val idImageToShowInt = resources.getIdentifier(idImageToShowString, "drawable", packageName)
            // Set the alpha of the image to show to 1
            image.setImageResource(idImageToShowInt)
            image.alpha = 1f
        }
    }
}
