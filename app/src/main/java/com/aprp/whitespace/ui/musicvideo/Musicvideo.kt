package com.aprp.whitespace.ui.musicvideo

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
import androidx.recyclerview.widget.RecyclerView
import com.aprp.whitespace.R
import kotlinx.android.synthetic.main.fragment_musicvideo.*


class Musicvideo : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_musicvideo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        rv_mv.setHasFixedSize(true)
        val mLayoutManager: RecyclerView.LayoutManager = LinearLayoutManager(activity)
        rv_mv.layoutManager = mLayoutManager
        val videoIds = arrayOf(
            "KBtk5FUeJbk",
            "jJPMnTXl63E",
            "kcc9Kfip2uw",
            "CJC5PY5erzI",
            "FcOctsNXyjk",
            "9JSIBwQqD70",
            "t0Bt3a-MLGs"
        )
        val recyclerViewAdapter: RecyclerView.Adapter<*> =
            MVAdapter(videoIds, this.lifecycle)
        rv_mv.adapter = recyclerViewAdapter
    }
}