package com.example.andreavillacis.examenib

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button_listar.setOnClickListener { view: View ->
            irActividad_Conductor()
        }

        button_crear.setOnClickListener{ view :View ->
            irActividad_crear_conductor()
        }
    }

        fun irActividad_Conductor() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            val intent = Intent(this, ListarActivity::class.java)
            startActivity(intent)
        }
    fun irActividad_crear_conductor(){
        val intent = Intent(this, CrearActivity::class.java)
        startActivity(intent)
    }
}





