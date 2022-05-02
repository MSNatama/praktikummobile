package com.example.navdrawer.ui.topassist

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

class TopAssistAdapter(private val context: Context) :
    RecyclerView.Adapter<TopAssistAdapter.TopAssistAdapterViewHolder>() {

    private val assistList = TopAssistData.dataAssist

    class TopAssistAdapterViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {
        val image: ImageView? = view?.findViewById(R.id.picture)
        val nameTextView: TextView? = view?.findViewById(R.id.Item_name)
        val teamTextView: TextView? = view?.findViewById(R.id.Teams)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopAssistAdapterViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.vertical_grid_list_item_assist, parent, false)
        return TopAssistAdapterViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return assistList.size
    }

    override fun onBindViewHolder(holder: TopAssistAdapterViewHolder, position: Int) {
        val assistItem = assistList[position]
        holder.image?.setImageResource(assistItem.imageResourceId)
        holder.nameTextView?.text = assistItem.name
        holder.teamTextView?.text = assistItem.team
        holder.image?.setOnClickListener {
            Toast.makeText(context, "Anda memilih pemain peringkat ke-${position+1}" , Toast.LENGTH_SHORT).show()
        }
    }
}