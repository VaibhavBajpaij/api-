package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val mail =intent.getStringExtra(SignInActivity.KEY1)
        val name =intent.getStringExtra(SignInActivity.KEY2)
        val ID =intent.getStringExtra(SignInActivity.KEY3)

        val welcomeText=findViewById<TextView>(R.id.textView3)
        val mailText=findViewById<TextView>(R.id.tv3)
        val idtext=findViewById<TextView>(R.id.tv4)
        welcomeText.text="Welcome $name"
        mailText.text="Mail: $mail"
        idtext.text="UserId :$ID"

    }
}