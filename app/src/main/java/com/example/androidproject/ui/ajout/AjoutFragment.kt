package com.example.androidproject.ui.ajout


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.androidproject.R
import com.example.androidproject.database.getDatabase
import com.example.androidproject.ui.medicament.MedicamentViewModel
import kotlinx.android.synthetic.main.fragment_medicaments.*
import org.jetbrains.anko.doAsync

/**
 * A simple [Fragment] subclass.
 */
class AjoutFragment : Fragment() {

    private lateinit var AjoutViewModelViewModel: AjoutViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ajout, container, false)
    }
}
