package com.example.androidproject.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.OffsetDateTime

@Entity
data class Medicament(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var nom: String,
    var quantite: Int = 0,
    var reference: Int = 0,
    var commentaire: String,
    var datePeremption: String
)