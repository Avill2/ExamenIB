package com.example.andreavillacis.examenib

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_crear.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class CrearActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear)

        button_crear.setOnClickListener{view: View -> Crear_conductor_auto()}
    }

    class Conductor_persona (var nombre:String,
                     var apellido: String,
                     var fecha_nacimiento: Date,
                     var numeroAutos:Int,
                     var licenciaValida:Boolean){
    }

    fun Crear_conductor_auto(){
        val nombres = editText_nombres.text.toString()
        val apellidos = editText_apellidos.text.toString()
        val fechanacimiento = editText_fechanac.text.toString()
        val numeroautos = editText_numeroautos.text.toString()
        val licencia = editText_licencia.text.toString()
        irActividadListar()
    }
    fun irActividadListar(){
        val intent = Intent(this, ListarActivity::class.java)
        startActivity(intent)
    }

    class companion{
        companion object {
            var conductor: ArrayList<Conductor_persona> = ArrayList()

            init {
                conductor.add(Conductor_persona("Algo1" , "algo2", Date() , 3, true ))
                conductor.add(Conductor_persona("Algo3" , "algo4", Date() , 1, false ))
                conductor.add(Conductor_persona("Algo5" , "algo6", Date() , 5, true ))
            }

        }
    }

}
