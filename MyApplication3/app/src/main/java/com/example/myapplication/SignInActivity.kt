package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class SignInActivity : AppCompatActivity() {
    companion object{
        const val KEY1="com.example.myapplication.mail"
        const val KEY2="com.example.myapplication.name"
        const val KEY3="com.example.myapplication.ID"
    }
    lateinit var databaseReference: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        val btn=findViewById<Button>(R.id.button)
        val username=findViewById<TextInputEditText>(R.id.email)

        btn.setOnClickListener {
            val usernames=username.text.toString()
            if(usernames.isNotEmpty()){
                readData(usernames)
            }else{
                Toast.makeText(this,"please enter user name ",Toast.LENGTH_SHORT).show()
            }
        }


        // Move readData function out of onCreate method
    }

    // Define readData function outside of onCreate method
    private fun readData(uniqueId: String) {
        databaseReference = FirebaseDatabase.getInstance().getReference("user")
        databaseReference.child(uniqueId).get().addOnSuccessListener {
            if(it.exists()){
                val email = it.child("email").value
                val name = it.child("name").value
                val id = it.child("id").value

                val intent = Intent(this, welcome::class.java)
                // Use correct constant KEY instead of Key
                intent.putExtra(KEY1, email.toString())
                intent.putExtra(KEY2, name.toString())
                intent.putExtra(KEY3, id.toString())
                startActivity(intent)

            } else {
                // Correct typo: Toast.makeText instead of oast.makeText
                Toast.makeText(this, "This ID does not exist", Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener() {
            // Correct typo: Toast.makeText instead of oast.makeText
            Toast.makeText(this, "Some failure happened, try again", Toast.LENGTH_SHORT).show()
        }
    }
}
