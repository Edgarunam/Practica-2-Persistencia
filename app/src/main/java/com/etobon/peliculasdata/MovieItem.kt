package com.etobon.peliculasdata

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "tabla_pelicula")
class MovieItem (
    @PrimaryKey var TituloPelicula:String,
    @ColumnInfo(name = "director_pelicula") val directorPelicula:String?,
    @ColumnInfo(name = "genero_pelicula") val generoPelicula: String?,
    @ColumnInfo(name = "fechar_pelicula") val fechaPelicua:Int?,
    @ColumnInfo(name = "calificacion_pelicula") val calificacionPelicula:Int?

        )
