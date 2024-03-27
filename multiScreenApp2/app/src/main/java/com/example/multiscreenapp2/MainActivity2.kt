package com.example.multiscreenapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val tv = findViewById<TextView>(R.id.tv)

        val orderOfCustomer = intent.getStringArrayExtra(MainActivity.KEY)
        if (orderOfCustomer != null) {
            tv.text = "Order Placed: " + orderOfCustomer.joinToString(", ")
        } else {
            tv.text = "No order data found."
        }
    }

}