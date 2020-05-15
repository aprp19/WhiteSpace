package com.aprp.whitespace.ui.daily

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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
            Friend("Nadia Rizky Amalia Pattiasina", "Family", R.drawable.ic_menu_profile),
            Friend("Abe Ekayani Pratiwi","Family", R.drawable.ic_menu_profile),
            Friend("Sabri","Family", R.drawable.ic_menu_profile),
            Friend("Anugrah Dwi Cahya Prakasa","Family", R.drawable.ic_menu_profile),
            Friend("Gigih Surya Prakasa","Family", R.drawable.ic_menu_profile),
            Friend("Albarokah Muhammad G. P.","Family", R.drawable.ic_menu_profile),
            Friend("Okeu Agnia Pratama","Family", R.drawable.ic_menu_profile),
            Friend("Fazar Ingsan","Friend", R.drawable.ic_menu_profile),
            Friend("M. Rifa Fauzi","Friend", R.drawable.ic_menu_profile),
            Friend("Ivan Ongko","Friend", R.drawable.ic_menu_profile)
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