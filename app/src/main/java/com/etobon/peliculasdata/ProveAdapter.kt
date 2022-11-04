package com.etobon.peliculasdata

import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ProveAdapter(private val allMovies:List<MovieItem>):
        RecyclerView.Adapter<ProveAdapter.ViewHolder>() {


    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_plantilla_rv, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       when(position){
           0->{
               holder.view.findViewById<ImageView>(R.id.ivPoster).setImageResource(R.drawable.add_plus)
           }
       }



        holder.view.findViewById<TextView>(R.id.tvTituloPelicula).text =
            allMovies[position].TituloPelicula
        holder.view.findViewById<TextView>(R.id.tvDirectorPelicula).text =
            allMovies[position].directorPelicula.toString()
        holder.view.findViewById<TextView>(R.id.tvGeneroPelicula).text =
            allMovies[position].generoPelicula.toString()
            holder.view.findViewById<TextView>(R.id.tvFechaPelicula).text = allMovies[position].fechaPelicua.toString()
            holder.view.findViewById<TextView>(R.id.tvCalificacion).text = allMovies[position].calificacionPelicula.toString()


    }

    override fun getItemCount(): Int = allMovies.size



}