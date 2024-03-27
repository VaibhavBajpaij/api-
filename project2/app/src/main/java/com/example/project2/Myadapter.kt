package com.example.project2

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class Myadapter(val context: Activity, val arrayList: ArrayList<User>) : ArrayAdapter<User>(context, R.layout.eachitem, arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater=LayoutInflater.from(context)
        val view=inflater.inflate(R.layout.eachitem,null)
        val image =view.findViewById<CircleImageView>(R.id.profile_image)
        val name=view.findViewById<TextView>(R.id.tvname)
        val last=view.findViewById<TextView>(R.id.tvlast)
        val time=view.findViewById<TextView>(R.id.tvtime)
        name.text=arrayList[position].name
        last.text=arrayList[position].lastmsg
        time.text=arrayList[position].lastmsgtime
        image.setImageResource(arrayList[position].image)
        return view
    }
}
