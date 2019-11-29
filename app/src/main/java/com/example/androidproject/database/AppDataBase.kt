package com.example.androidproject.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

const val DATABASE_NAME = "AppDatabase"

@Database(entities = [Medicament::class], version = 1)
abstract class AppDataBase : RoomDatabase(){
    abstract fun medicamentDao(): MedicamentDao}

private lateinit var databaseInstance: AppDataBase

fun getDatabase(context: Context): AppDataBase{
        if(!::databaseInstance.isInitialized){
            databaseInstance = Room.databaseBuilder(
                context,
                AppDataBase::class.java,
                DATABASE_NAME)
            .build()
        }
    return databaseInstance
    }
