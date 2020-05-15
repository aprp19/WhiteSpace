package com.aprp.whitespace.ui.gallery

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
import androidx.recyclerview.widget.GridLayoutManager
import com.aprp.whitespace.R
import kotlinx.android.synthetic.main.fragment_gallery.*

class GalleryFragment : Fragment() {

    private val mGallery = GalleryAdapter(
        listOf(
            GalleryData(R.drawable.content_gallery_foto),
            GalleryData(R.drawable.content_gallery_foto10),
            GalleryData(R.drawable.content_gallery_foto11),
            GalleryData(R.drawable.content_gallery_foto12),
            GalleryData(R.drawable.content_gallery_foto13),
            GalleryData(R.drawable.content_gallery_foto2),
            GalleryData(R.drawable.content_gallery_foto3),
            GalleryData(R.drawable.content_gallery_foto5),
            GalleryData(R.drawable.content_gallery_foto4),
            GalleryData(R.drawable.content_gallery_foto6),
            GalleryData(R.drawable.content_gallery_foto7),
            GalleryData(R.drawable.content_gallery_foto8),
            GalleryData(R.drawable.content_gallery_foto9)
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gallery, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_gallery.apply {
            layoutManager = GridLayoutManager(activity,2)
            adapter = mGallery
        }
    }
}