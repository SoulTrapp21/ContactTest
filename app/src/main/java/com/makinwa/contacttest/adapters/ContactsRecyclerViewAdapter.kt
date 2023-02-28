package com.makinwa.contacttest.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.makinwa.contacttest.R
import com.makinwa.contacttest.Rows

class ContactsRecyclerViewAdapter(private val rowsList: ArrayList<Rows>): RecyclerView.Adapter<ContactsRecyclerViewAdapter.MyViewHolder>() {






    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_items,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = rowsList[position]
        holder.titleImage.setImageResource(currentItem.contactImg)
        holder.title.text = currentItem.contactName
    }

    override fun getItemCount(): Int {
        return rowsList.size
    }


    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val titleImage : ShapeableImageView = itemView.findViewById(R.id.contactImg)
        val title : TextView = itemView.findViewById(R.id.contactName)
    }
}