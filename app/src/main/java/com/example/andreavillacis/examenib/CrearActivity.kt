package com.example.andreavillacis.examenib

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_crear.*
import kotlinx.android.synthetic.main.activity_main.*

class CrearActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear)

        button_crear.setOnClickListener{view: View -> Crear_conductor_auto()}
    }

    fun Crear_conductor_auto(){
        val nombres = text_nombre_edit.text.toString()
        val apellidos = text_apellido_edit.text.toString()
        val fechanacimiento = text_fechaNaci_edit.text.toString()
        val numeroautos = text_nombre_edit.text.toString()
        val licencia = text_nombre_edit.text.toString()
    }


}
