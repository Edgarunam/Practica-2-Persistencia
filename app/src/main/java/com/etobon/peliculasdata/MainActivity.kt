package com.etobon.peliculasdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.etobon.peliculasdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



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