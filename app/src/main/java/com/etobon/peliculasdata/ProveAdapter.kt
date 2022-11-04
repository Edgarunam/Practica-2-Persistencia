package com.etobon.peliculasdata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProveAdapter:RecyclerView.Adapter<ProveAdapter.ViewHolder>() {

    val titles = arrayOf("Spiderman","Harry Potyer")
    val Director = arrayOf("Director 1","Director 2")

        class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_plantilla_rv, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.view.findViewById<TextView>(R.id.tvTituloPelicula).text =
                titles[position]
            holder.view.findViewById<TextView>(R.id.tvDirectorPelicula).text =
               Director[position]
            /*
            holder.view.findViewById<TextView>(R.id.tvGeneroPelicula).text =
                peliculasrv[position].generoPelicula
            holder.view.findViewById<TextView>(R.id.tvFechaPelicula).text =
                peliculasrv[position].fechaPelicua.toString()
            holder.view.findViewById<TextView>(R.id.tvCalificacion).text =
                peliculasrv[position].calificacionPelicula.toString()

*/
        }

        override fun getItemCount(): Int = titles.size


}