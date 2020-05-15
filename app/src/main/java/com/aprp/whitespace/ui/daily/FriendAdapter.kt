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

class FriendAdapter(private val listFriend: List<Friend>): RecyclerView.Adapter<FriendViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return FriendViewHolder(inflater, parent)
    }

    override fun getItemCount(): Int {
        return listFriend.size
    }

    override fun onBindViewHolder(holder: FriendViewHolder, position: Int) {
        val friend: Friend = listFriend[position]
        holder.bind(friend)
    }
}

class FriendViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.content_daily_cardview,parent,false)){
    private var mTextFriendName: TextView? = null
    private var mTextFriendFrom: TextView? = null
    private var mImageFriend: ImageView? = null

    init {
        mTextFriendName = itemView.findViewById(R.id.daily_c2)
        mTextFriendFrom = itemView.findViewById(R.id.daily_c3)
        mImageFriend = itemView.findViewById(R.id.daily_c1)
    }

    fun bind(friend: Friend){
        mTextFriendName?.text = friend.name
        mTextFriendFrom?.text = friend.from
        mImageFriend?.setImageResource(friend.image)
    }
}