package com.chusdevil.applistanumeros

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SegundaPagina : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_pagina)

        val numero = intent.extras!!.getInt("key_numero")
        val lista = findViewById<RecyclerView>(R.id.rvlista)
        val adapter = ListaAdapter(numero)

        lista.layoutManager = LinearLayoutManager(this)
        lista.adapter = adapter


    }
}