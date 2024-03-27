package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    lateinit var database : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sign = findViewById<Button>(R.id.button)
        val name = findViewById<EditText>(R.id.name)
        val pass = findViewById<EditText>(R.id.pass)
        val id = findViewById<EditText>(R.id.id)
        val email = findViewById<EditText>(R.id.email)

        sign.setOnClickListener {
            val nam = name.text.toString()
            val pa = pass.text.toString()
            val un = id.text.toString()
            val em = email.text.toString()

            val user = User(nam, em, pa, un)


            database = FirebaseDatabase.getInstance().getReference("user")
            database.child(un).setValue(user).addOnSuccessListener {
                Toast.makeText(this, "User Registered", Toast.LENGTH_SHORT).show()
                name.text.clear()
                pass.text.clear()
                id.text.clear()
                email.text.clear()
                println("Its and Success")
            }.addOnFailureListener {
                Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
                // Clearing editText fields on failure

                name.text.clear()
                pass.text.clear()
                id.text.clear()
                email.text.clear()
                println("Its and Fail")
            }
        }
        val signin=findViewById<TextView>(R.id.textView)
        signin.setOnClickListener {
            val openSignInActivity=Intent(this,SignInActivity::class.java)
            startActivity(openSignInActivity)
        }

    }
}
