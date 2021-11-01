package com.slowmotion.dzikirapp.adapter

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.slowmotion.dzikirapp.R
import com.slowmotion.dzikirapp.model.DzikirDoa

class DzikirDoaAdapter(private val listDikirDoa: ArrayList<DzikirDoa>):RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>() {
    inner class MyViewHolder (view : View): RecyclerView.ViewHolder(view){
        val tvDesc = view.findViewById<TextView>(R.id.tvDesc)
        val tvLafaz = view.findViewById<TextView>(R.id.tvLafaz)
        val tvTerjemah = view.findViewById<TextView>(R.id.tvTerjemah)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    )= MyViewHolder (
        LayoutInflater.from(parent.context).inflate(R.layout.item_doa, parent, false)

    )

    override fun onBindViewHolder(holder: DzikirDoaAdapter.MyViewHolder, position: Int) {
        val dzikir = listDikirDoa[position]
        holder.tvDesc.text = dzikir.desc
        holder.tvLafaz.text = dzikir.lafaz
        holder.tvTerjemah.text = dzikir.terjemah
    }

    override fun getItemCount() = listDikirDoa.size

}