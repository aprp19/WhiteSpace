package com.aprp.whitespace.ui.musicvideo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MusicvideoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Music Video Fragment"
    }
    val text: LiveData<String> = _text
}