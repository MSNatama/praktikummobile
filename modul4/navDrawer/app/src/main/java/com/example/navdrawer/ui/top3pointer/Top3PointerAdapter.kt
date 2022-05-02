package com.example.navdrawer.ui.top3pointer

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.accessibility.AccessibilityNodeInfo
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.navdrawer.R

class Top3PointerAdapter(private val context: Context) :
    RecyclerView.Adapter<Top3PointerAdapter.Top3PointerAdapterViewHolder>() {

    private val threesList = Top3PointerData.dataThrees

    class Top3PointerAdapterViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {
        val image: ImageView? = view?.findViewById(R.id.picture)
        val nameTextView: TextView? = view?.findViewById(R.id.Item_name)
        val teamTextView: TextView? = view?.findViewById(R.id.Teams)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Top3PointerAdapterViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.vertical_grid_list_item_3pointer, parent, false)
        return Top3PointerAdapterViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return threesList.size
    }

    override fun onBindViewHolder(holder: Top3PointerAdapterViewHolder, position: Int) {
        val threesItem = threesList[position]
        holder.image?.setImageResource(threesItem.imageResourceId)
        holder.nameTextView?.text = threesItem.name
        holder.teamTextView?.text = threesItem.team
        holder.image?.setOnClickListener {
            Toast.makeText(context, "Anda memilih pemain peringkat ke-${position+1}" , Toast.LENGTH_SHORT).show()
        }
    }
}