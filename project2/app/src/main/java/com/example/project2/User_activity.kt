package com.example.project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class User_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        // Retrieve data passed from MainActivity
        val name = intent.getStringExtra("name")
        val phoneno = intent.getStringExtra("phone")
        val imageId = intent.getIntExtra("image", R.drawable.pic2) // R.drawable.pic2 is the default value if imageId is not found

        // Find views by their IDs
        val nameTv = findViewById<TextView>(R.id.tvname)
        val phoneTv = findViewById<TextView>(R.id.tvphone)
        val imageIv = findViewById<CircleImageView>(R.id.profile_image)

        // Set retrieved data to respective views
        nameTv.text = name
        phoneTv.text = phoneno
        imageIv.setImageResource(imageId)
    }
}
