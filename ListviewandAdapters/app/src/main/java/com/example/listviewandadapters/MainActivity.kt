package com.example.listviewandadapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview=findViewById<ListView>(R.id.list)
        val taskList= arrayListOf<String>()
        taskList.add("Attend Exam")
        taskList.add("complete the app dev project ")
        taskList.add("buy bindi from market")
        taskList.add("work oom resume")
        taskList.add("improve internet pressence")
        val adapterformylistview=ArrayAdapter(this,android.R.layout.simple_list_item_1,taskList)
        listview.adapter=adapterformylistview
        listview.setOnItemClickListener{ parant,view,position,id->
            val text ="Clicked on item : "+(view as TextView).text.toString()
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()


        }




    }
}