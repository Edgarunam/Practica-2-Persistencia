package com.etobon.peliculasdata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorRecycleView(private val peliculasrv: List<entidadPelicula>) :
    RecyclerView.Adapter<AdaptadorRecycleView.ViewHolder>(){

    class ViewHolder (val view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_plantilla_rv,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.view.findViewById<TextView>(R.id.tvTituloPelicula).text = peliculasrv[position].TituloPelicula
        holder.view.findViewById<TextView>(R.id.tvDirectorPelicula).text = peliculasrv[position].directorPelicula
        holder.view.findViewById<TextView>(R.id.tvGeneroPelicula).text = peliculasrv[position].generoPelicula
        holder.view.findViewById<TextView>(R.id.tvFechaPelicula).text = peliculasrv[position].fechaPelicua.toString()
        holder.view.findViewById<TextView>(R.id.tvCalificacion).text = peliculasrv[position].calificacionPelicula.toString()



    }

    override fun getItemCount(): Int = peliculasrv.size

}