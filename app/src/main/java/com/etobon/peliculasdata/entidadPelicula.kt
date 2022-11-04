package com.etobon.peliculasdata

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.net.URI

@Entity(tableName = "tabla_pelicula")
data class entidadPelicula (
    @PrimaryKey val TituloPelicula:String,
    @ColumnInfo(name="nombre_pelicula") val nombrePelicula:String?,
    @ColumnInfo(name = "director_pelicula") val directorPelicula:String?,
    @ColumnInfo(name = "genero_pelicula") val generoPelicula: String?,
    @ColumnInfo(name = "fechar_pelicula") val fechaPelicua:Int?,
    @ColumnInfo(name = "calificacion_pelicula") val calificacionPelicula:Int?,
    @ColumnInfo(name = "uri_Pelicula") val uriPelicula:URI?
        )
