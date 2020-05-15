package com.aprp.whitespace.ui.musicvideo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.aprp.whitespace.R

class Musicvideo : Fragment() {

    private lateinit var musicvideoViewModel: MusicvideoViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        musicvideoViewModel =
            ViewModelProviders.of(this).get(MusicvideoViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_musicvideo, container, false)
        val textView: TextView = root.findViewById(R.id.text_musicvideo)
        musicvideoViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}