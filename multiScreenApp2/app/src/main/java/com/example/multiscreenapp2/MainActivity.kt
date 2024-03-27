package com.example.multiscreenapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    // Creating Key
    companion object {
        const val KEY = "com.example.multiscreenapp2.MainActivity.Key"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tt1 = findViewById<EditText>(R.id.tt1)
        val tt2 = findViewById<EditText>(R.id.tt2)
        val tt3 = findViewById<EditText>(R.id.tt3)
        val tt4 = findViewById<EditText>(R.id.tt4)
        val Butto = findViewById<Button>(R.id.button)

        Butto.setOnClickListener {
            val ordersPlaced = arrayOf(
                tt1.text.toString(),
                tt2.text.toString(),
                tt3.text.toString(),
                tt4.text.toString()
            ) // Combine EditText values into a single string

            intent= Intent(this,MainActivity2::class.java)
            intent.putExtra(MainActivity.KEY,ordersPlaced)
            startActivity(intent)

        }
    }
}
