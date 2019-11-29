package com.example.androidproject.ui.medicament

import android.util.Log
import android.widget.ArrayAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MedicamentViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is medicament Fragment"
    }
    val text: LiveData<String> = _text

}