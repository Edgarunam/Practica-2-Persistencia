package com.etobon.peliculasdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.etobon.peliculasdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /*
    val moviesBD : AppDatabase by lazy {
        Room.databaseBuilder( this, AppDatabase::class.java, "movies_bd")
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()
    }

     */


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivAdd.setOnClickListener {
            val intent = Intent(this, InsertActivity::class.java)
            startActivity(intent)
        }

    }
}