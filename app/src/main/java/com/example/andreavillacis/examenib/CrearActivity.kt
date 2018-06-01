package com.example.andreavillacis.examenib

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_crear.*
import kotlinx.android.synthetic.main.activity_main.*

class CrearActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear)

        button_crear.setOnClickListener{view: View -> Crear_conductor_auto()}
    }

    fun Crear_conductor_auto(){
        val nombres = editText_nombres.text.toString()
        val apellidos = editText_apellidos.text.toString()
        val fechanacimiento = editText_fechanac.text.toString()
        val numeroautos = editText_numeroautos.text.toString()
        val licencia = editText_licencia.text.toString()
    }

}
