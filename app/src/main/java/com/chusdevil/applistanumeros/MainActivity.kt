package com.chusdevil.applistanumeros

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    private lateinit var boton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        boton = findViewById(R.id.boton)
        iniciar()

    }

    private fun iniciar() {

        val editText: EditText = findViewById(R.id.etNumero)
        boton.setOnClickListener {
            val numero = editText.text.toString().toInt()
            val intent = Intent(this, SegundaPagina::class.java)
            intent.putExtra("key_numero", numero)
            startActivity(intent)
        }
    }
}


