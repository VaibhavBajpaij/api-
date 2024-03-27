package com.example.project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var useArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sample data for users
        val name = arrayOf("Vaibhav", "Deepika Padukone", "Hariom bajpai", "Sarthak", "Unnatidar")
        val lastmsg = arrayOf("hey what's up", "Hi what are you doing ", "Ram Ram sare ni", "Hi vaibhav sIr!", "I need a team for a project")
        val lastmsgtime = arrayOf("12:01pm", "12:00am", "3:00am", "3:30", "5:00pm")
        val phoneno = arrayOf("9067543564", "6048658908", "8081546378", "8946394736", "7860476345")
        val image = arrayOf(R.drawable.pic1, R.drawable.pic3, R.drawable.pic4, R.drawable.pic2, R.drawable.pic)

        // Initialize ArrayList to hold user data
        useArrayList = ArrayList()

        // Populate ArrayList with User objects
        for (eachIndex in name.indices) {
            val user = User(name[eachIndex], lastmsg[eachIndex], lastmsgtime[eachIndex], phoneno[eachIndex], image[eachIndex])
            useArrayList.add(user)
        }

        // Find the ListView in the layout
        val list = findViewById<ListView>(R.id.lv)

        // Enable clickability for ListView
        list.isClickable = true

        // Set custom adapter to populate ListView with user data
        list.adapter = Myadapter(this, useArrayList)

        // Set click listener for ListView items
        list.setOnItemClickListener { parent, view, position, id ->
            // Extract data of the clicked user
            val userName = name[position]
            val userPhone = phoneno[position]
            val userImage = image[position]

            // Create an Intent to start the User_activity
            val intent = Intent(this, User_activity::class.java)

            // Pass user data as extras to the Intent
            intent.putExtra("name", userName)
            intent.putExtra("phone", userPhone)
            intent.putExtra("image", userImage)

            // Start the User_activity
            startActivity(intent)
        }
    }
}
