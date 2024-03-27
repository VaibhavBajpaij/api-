package com.example.dilogbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AlertDialog
import com.example.dilogbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // Corrected to use binding.root instead of R.layout.activity_main

        binding.textView2.setOnClickListener{
            val options = arrayOf("python", "kotlin", "Java", "C++", "C") // Corrected variable name from option to options
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("choose the correct option")
            builder1.setSingleChoiceItems(options, 0) { dialog, which ->
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            }
            builder1.setPositiveButton("submit") { dialog, i ->
                Toast.makeText(this, "Your answer is saved", Toast.LENGTH_SHORT).show()
            }
            builder1.setNegativeButton("cancel") { dialog, i ->
                Toast.makeText(this, "Your answer is not saved!", Toast.LENGTH_SHORT).show()
            }
            builder1.show()
        }

        binding.textView3.setOnClickListener{
            val options = arrayOf("python", "kotlin", "Java", "C++", "C") // Corrected variable name from option to options
            val checkedItems = booleanArrayOf(false, false, false, false, false) // Initialize checkedItems array
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("choose the correct option")
            builder1.setMultiChoiceItems(options, checkedItems) { dialog, which, isChecked ->
                if (isChecked) {
                    Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
                }
            }
            builder1.setPositiveButton("submit") { dialog, i ->
                Toast.makeText(this, "Your answer is saved", Toast.LENGTH_SHORT).show()
            }
            builder1.setNegativeButton("cancel") { dialog, i ->
                Toast.makeText(this, "Your answer is not saved!", Toast.LENGTH_SHORT).show()
            }
            builder1.show()
        }
        binding.textView4.setOnClickListener{
            val options = arrayOf("Delhi","Sitapur","banglor","sikkim") // Corrected variable name from option to options
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("choose the correct option")
            builder1.setSingleChoiceItems(options, 0) { dialog, which ->
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            }
            builder1.setPositiveButton("submit") { dialog, i ->
                Toast.makeText(this, "Your answer is saved", Toast.LENGTH_SHORT).show()
            }
            builder1.setNegativeButton("cancel") { dialog, i ->
                Toast.makeText(this, "Your answer is not saved!", Toast.LENGTH_SHORT).show()
            }
            builder1.show()
        }
        binding.button.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("SUBMIT!")
            builder1.setIcon(R.drawable.baseline_app_settings_alt_24)
            builder1.setPositiveButton("submit") { dialog, i ->
                Toast.makeText(this, "Your answer is saved", Toast.LENGTH_SHORT).show()
            }
            builder1.setNegativeButton("cancel") { dialog, i ->
                Toast.makeText(this, "Your answer is not saved!", Toast.LENGTH_SHORT).show()
            }
            builder1.show()



        }

    }
}
