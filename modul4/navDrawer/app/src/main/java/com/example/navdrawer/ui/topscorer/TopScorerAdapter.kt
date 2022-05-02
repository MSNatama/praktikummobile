package com.example.navdrawer.ui.topscorer

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

class TopScorerAdapter (private val context: Context) :
    RecyclerView.Adapter<TopScorerAdapter.TopScorerAdapterViewHolder>() {
    private val scorerList = TopScorerData.dataScorer

    class TopScorerAdapterViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {
        val image: ImageView? = view?.findViewById(R.id.picture)
        val nameTextView: TextView? = view?.findViewById(R.id.Item_name)
        val teamTextView: TextView? = view?.findViewById(R.id.Teams)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopScorerAdapterViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.vertical_grid_list_item_scorer, parent, false)
        return TopScorerAdapterViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return scorerList.size
    }

    override fun onBindViewHolder(holder: TopScorerAdapterViewHolder, position: Int) {
        val scorerItem = scorerList[position]
        holder.image?.setImageResource(scorerItem.imageResourceId)
        holder.nameTextView?.text = scorerItem.name
        holder.teamTextView?.text = scorerItem.team
        holder.image?.setOnClickListener {
            Toast.makeText(context, "Anda memilih pemain peringkat ke-${position+1}" , Toast.LENGTH_SHORT).show()
        }
    }
}