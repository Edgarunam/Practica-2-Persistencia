package com.etobon.peliculasdata

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PeliculaDao {

    //Obtener Todos los Datos
    @Query("SELECT * FROM tabla_pelicula")
    fun getAll(): List<MovieItem>

    @Insert
    fun insertALL(vararg pelicula: MovieItem)

    @Delete
    fun delete(pelicula: MovieItem)
}