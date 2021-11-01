package com.slowmotion.dzikirapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.slowmotion.dzikirapp.model.Artikel

class ArtikelAdapter(private val listArtikel: ArrayList<Artikel>) :
    RecyclerView.Adapter<ArtikelAdapter.MyViewHolder>() {
    private lateinit var onItemClickCallback: onItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgArtikel = view.findViewById<ImageView>(R.id.ivArtikel)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_artikel, parent, false)
    )


    override fun onBindViewHolder(holder: ArtikelAdapter.MyViewHolder, position: Int) {
        holder.imgArtikel.setImageResource(listArtikel[position].imageArtikel)
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listArtikel[position])
        }
    }

    override fun getItemCount(): Int = listArtikel.size
}

interface onItemClickCallback {
    fun onItemClicked(data: Artikel)
}
