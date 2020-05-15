package com.aprp.whitespace.ui.gallery

/*
NAMA    : ANGGA PUJA RESTU PRAKASA
NIM     : 10117130
KELAS   : IF4
TANGGAL PENGERJAAN : 14 - MEI - 2020
*/

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.aprp.whitespace.R

class GalleryAdapter(private val listDaily: List<GalleryData>): RecyclerView.Adapter<GalleryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return GalleryViewHolder(inflater, parent)
    }

    override fun getItemCount(): Int {
        return listDaily.size
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        val gallery: GalleryData = listDaily[position]
        holder.bind(gallery)
    }

}

class GalleryViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.content_gallery_cardview,parent,false)){
    private var mImageActivities: ImageView? = null

    init {
        mImageActivities = itemView.findViewById(R.id.daily_c1)
    }

    fun bind(daily: GalleryData){
        mImageActivities?.setImageResource(daily.image)
    }
}