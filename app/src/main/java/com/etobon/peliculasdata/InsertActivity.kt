package com.etobon.peliculasdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AndroidException
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.room.Room
import com.etobon.peliculasdata.databinding.ActivityInsertBinding
import com.etobon.peliculasdata.databinding.ActivityMainBinding
import java.security.CodeSigner

class InsertActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInsertBinding
    var generoMovie:String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInsertBinding.inflate(layoutInflater)
        setContentView(binding.root)





        ArrayAdapter.createFromResource(this,R.array.Generos,android.R.layout.simple_spinner_item).also {
            adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
            binding.spinnerGeneros.adapter = adapter

        }
        SpinnerSelection(binding.spinnerGeneros)


        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "database-name"
        ).allowMainThreadQueries().build()

        binding.btnInsert.setOnClickListener{
            var Titulo:String = binding.etInsertTitulo.text.toString()
            var Director:String = binding.etInsertDirector.text.toString()
            var Año:Int = binding.etInsertFecha.text.toString().toInt()
            var Calificacion:Int= binding.etInsertCalificacion.text.toString().toInt()
            db.peliculaDao().insertALL(MovieItem(Titulo,Director,generoMovie,Año,Calificacion))
            Toast.makeText(this@InsertActivity,"Pelicula Agregada",Toast.LENGTH_SHORT).show()
        }

    }

    private fun SpinnerSelection(spinner: Spinner){
        spinner.onItemSelectedListener = object  : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
                when (pos) {
                    0 -> {
                        generoMovie = "Acción"
                    }
                    1 -> {
                        generoMovie = "Aventura"
                    }
                    2 -> {
                        generoMovie = "Ciencia Ficción"
                    }
                    3 -> {
                        generoMovie = "Comedia"
                    }
                    4 -> {
                        generoMovie = "Drama"
                    }
                    5 -> {
                        generoMovie = "Fantasía"
                    }
                    6 -> {
                        generoMovie = "Musical"
                    }
                    7 -> {
                        generoMovie = "Suspenso"
                    }
                    8 -> {
                        generoMovie = "Terror"
                    }
                }

            }
            override fun onNothingSelected(parent: AdapterView<*>) {
                generoMovie = "Sin Genero Seleccionado"
            }
        }
    }
}