package com.example.andreavillacis.examenib

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.util.*

class ListarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listar)
    }
}



class ConductorAdaptador(private val listaConductor :List<CrearActivity.Conductor_persona>): RecyclerView.Adapter<ConductorAdaptador.MyViewHolder>(){
    inner  class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        lateinit var nombre: TextView
        lateinit var apellido: TextView
        var

    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



}
