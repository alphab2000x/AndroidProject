package com.example.androidproject.database

import androidx.room.*

@Dao
interface MedicamentDao{

    @Query("SELECT * FROM Medicament")
    fun getMedicaments(): List<Medicament>

    // @Query("SELECT * FROM User WHERE id=:id")
    // fun getUserById(id: Int)

    @Insert
    fun insertMedicament(vararg medicament: Medicament)

    @Update
    fun updateMedicament(vararg medicament: Medicament)

    @Delete
    fun deleteMedicament(medicament: Medicament)
}