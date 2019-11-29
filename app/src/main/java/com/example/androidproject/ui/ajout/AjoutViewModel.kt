package com.example.androidproject.ui.ajout

import android.util.Log
import android.widget.ArrayAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AjoutViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is medicament Ajout"
    }
    val text: LiveData<String> = _text

}