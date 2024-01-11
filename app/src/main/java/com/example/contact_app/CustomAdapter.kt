package com.example.contact_app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.contact_app.model.Person

class CustomAdapter(context: Context, private val items: List<Person>): ArrayAdapter<Person>(context, R.layout.list_item, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val itemView = inflater.inflate(R.layout.list_item, parent, false)
        val item = getItem(position)
        val iconItem = itemView.findViewById<TextView>( R.id.icon_item)
        iconItem.text = item?.username?.first().toString();
        val username = itemView.findViewById<TextView>(R.id.username)
        username.text = item?.username ?: ""
        return itemView
    }
}