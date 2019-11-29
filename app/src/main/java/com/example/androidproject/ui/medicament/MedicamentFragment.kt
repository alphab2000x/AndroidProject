package com.example.androidproject.ui.medicament

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.androidproject.R
import com.example.androidproject.database.Medicament
import com.example.androidproject.database.getDatabase
import kotlinx.android.synthetic.main.fragment_medicaments.*
import org.jetbrains.anko.doAsync
import com.example.androidproject.database.AppDataBase as AppDataBase1

class MedicamentFragment : Fragment() {

    private lateinit var medicamentViewModel: MedicamentViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val med1 = Medicament(nom = "med1", reference = 12345,commentaire = "com1",quantite = 42, datePeremption = "date1")
        val med2 = Medicament(nom = "med2", reference = 65435,commentaire = "com2",quantite = 1, datePeremption = "date2")
        val med3 = Medicament(nom = "med3", reference = 12323,commentaire = "com3",quantite = 0, datePeremption = "date3")


        doAsync{
            getDatabase(activity!!.applicationContext).medicamentDao().apply{
                insertMedicament(med1)
                insertMedicament(med2)
                insertMedicament(med3)
                val medicaments = ArrayAdapter(activity!!.applicationContext, android.R.layout.simple_list_item_1, getMedicaments())
                listMedicaments.adapter = medicaments
            }
        }
        medicamentViewModel =
            ViewModelProviders.of(this).get(MedicamentViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_medicaments, container, false)
        val textView: TextView = root.findViewById(R.id.text_medicament)
        medicamentViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}