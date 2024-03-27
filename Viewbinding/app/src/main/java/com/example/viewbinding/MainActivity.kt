package com.example.viewbinding

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if (binding.checkbox1.isChecked) {
                val intent = Intent(this, second::class.java)
                startActivity(intent)
            } else {

                Toast.makeText(this, "Please accept terms and conditions", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
