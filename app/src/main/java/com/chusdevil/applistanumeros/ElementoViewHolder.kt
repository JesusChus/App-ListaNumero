package com.chusdevil.applistanumeros

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ElementoViewHolder(private val view: View) : ViewHolder(view) {

    private val texto = view.findViewById<TextView>(R.id.tvElemento)

    fun datos(valor: String) {
        texto.text = valor
    }
}