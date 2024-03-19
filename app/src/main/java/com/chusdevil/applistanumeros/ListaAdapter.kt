package com.chusdevil.applistanumeros

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter

class ListaAdapter(val numero: Int) : Adapter<ElementoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElementoViewHolder {

        val elementoActivity = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_elemento_lista, parent, false)
        val elemento = ElementoViewHolder(elementoActivity)
        return elemento
    }

    override fun getItemCount(): Int {
        return numero
    }

    override fun onBindViewHolder(holder: ElementoViewHolder, position: Int) {

        holder.datos("Elemento $position")
    }
}