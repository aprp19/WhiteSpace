package com.aprp.whitespace.ui.daily

/*
NAMA    : ANGGA PUJA RESTU PRAKASA
NIM     : 10117130
KELAS   : IF4
TANGGAL PENGERJAAN : 14 - MEI - 2020
*/

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aprp.whitespace.R

class DailyAdapter(private val listDaily: List<DailyData>): RecyclerView.Adapter<DailyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DailyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return DailyViewHolder(inflater, parent)
    }

    override fun getItemCount(): Int {
        return listDaily.size
    }

    override fun onBindViewHolder(holder: DailyViewHolder, position: Int) {
        val daily: DailyData = listDaily[position]
        holder.bind(daily)
    }

}

class DailyViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.content_daily_cardview,parent,false)){
    private var mTitleDailyActivities: TextView? = null
    private var mImageActivities: ImageView? = null

    init {
        mTitleDailyActivities = itemView.findViewById(R.id.daily_c2)
        mImageActivities = itemView.findViewById(R.id.daily_c1)
    }

    fun bind(daily: DailyData){
        mTitleDailyActivities?.text = daily.title
        mImageActivities?.setImageResource(daily.image)
    }
}