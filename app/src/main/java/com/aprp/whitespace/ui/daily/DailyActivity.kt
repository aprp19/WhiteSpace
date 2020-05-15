package com.aprp.whitespace.ui.daily

/*
NAMA    : ANGGA PUJA RESTU PRAKASA
NIM     : 10117130
KELAS   : IF4
TANGGAL PENGERJAAN : 14 - MEI - 2020
*/

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.aprp.whitespace.R
import kotlinx.android.synthetic.main.fragment_daily.*


class DailyActivity : Fragment() {

    private val mDailyActivities = DailyAdapter(
        listOf(
            DailyData("Bangun Tidur", R.drawable.ic_tidur),
            DailyData("Makan", R.drawable.ic_makan),
            DailyData("Minum", R.drawable.ic_minum),
            DailyData("Mengerjakan Tugas", R.drawable.ic_tugas),
            DailyData("Sholat", R.drawable.ic_sholat),
            DailyData("Tidur Siang", R.drawable.ic_tidur),
            DailyData("Mandi", R.drawable.ic_mandi),
            DailyData("Main Game", R.drawable.ic_game)
        )
    )

    private val mFriendList = FriendAdapter(
        listOf(
            Friend("Nadia Rizky Amalia Pattiasina", "Family", R.drawable.content_friend_nadia),
            Friend("Abe Ekayani Pratiwi","Family", R.drawable.content_friend_ibubapak),
            Friend("Sabri","Family", R.drawable.content_friend_ibubapak),
            Friend("Anugrah Dwi Cahya Prakasa","Family", R.drawable.content_friend_anugrah),
            Friend("Gigih Surya Prakasa","Family", R.drawable.content_friend_gigihokeu),
            Friend("Albarokah Muhammad G. P.","Family", R.drawable.content_friend_albar),
            Friend("Okeu Agnia Pratama","Family", R.drawable.content_friend_gigihokeu),
            Friend("Fazar Ingsan","Friend", R.drawable.ic_menu_profile),
            Friend("M. Rifa Fauzi","Friend", R.drawable.content_friend_rifa),
            Friend("Ivan Ongko","Friend", R.drawable.content_friend_ivan)
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_daily, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_daily.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = mDailyActivities
        }

        rv_friendlist.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = mFriendList
        }

        rv_friendlist.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
    }
}