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
       if(allMovies[position].generoPelicula == "Acción"){
           holder.view.findViewById<ImageView>(R.id.ivPoster).setImageResource(R.drawable.ic_launcher_background)
       }
       else if(allMovies[position].generoPelicula == "Aventura"){
            holder.view.findViewById<ImageView>(R.id.ivPoster).setImageResource(R.drawable.ic_launcher_background)
        }
       else if(allMovies[position].generoPelicula == "Ciencia Ficción"){
           holder.view.findViewById<ImageView>(R.id.ivPoster).setImageResource(R.drawable.ic_launcher_background)
       }

       else if(allMovies[position].generoPelicula == "Comedia"){
           holder.view.findViewById<ImageView>(R.id.ivPoster).setImageResource(R.drawable.ic_launcher_background)
       }

       else if(allMovies[position].generoPelicula == "Drama"){
           holder.view.findViewById<ImageView>(R.id.ivPoster).setImageResource(R.drawable.ic_launcher_background)
       }
       else if(allMovies[position].generoPelicula == "Fantasía"){
           holder.view.findViewById<ImageView>(R.id.ivPoster).setImageResource(R.drawable.ic_launcher_background)
       }
       else if(allMovies[position].generoPelicula == "Musical"){
           holder.view.findViewById<ImageView>(R.id.ivPoster).setImageResource(R.drawable.ic_launcher_background)
       }
       else if(allMovies[position].generoPelicula == "Suspenso"){
           holder.view.findViewById<ImageView>(R.id.ivPoster).setImageResource(R.drawable.ic_launcher_background)
       }
       else if(allMovies[position].generoPelicula == "Terror"){
           holder.view.findViewById<ImageView>(R.id.ivPoster).setImageResource(R.drawable.ic_launcher_background)
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