package com.etobon.peliculasdata

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [entidadPelicula::class],version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun peliculaDao(): PeliculaDao
}