package com.example.andreavillacis.examenib

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_listar.*
import org.w3c.dom.Text
import java.util.*

class ListarActivity : AppCompatActivity() {

    var array_conductor=ArrayList<CrearActivity.Conductor_persona>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listar)
        val layautManager =LinearLayoutManager(this)
        array_conductor=CrearActivity.companion.conductor
        val adaptador = ConductorAdaptador(array_conductor)
        recycler_view.layoutManager = layautManager
        recycler_view.itemAnimator = DefaultItemAnimator()
        recycler_view.adapter = adaptador
        adaptador.notifyDataSetChanged()
    }
}



class ConductorAdaptador(private val listaConductor :List<CrearActivity.Conductor_persona>): RecyclerView.Adapter<ConductorAdaptador.MyViewHolder>(){
    inner  class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        var nombre: TextView
        var apellido: TextView
        var numeroAuto:TextView
        var detalle: Button

        init {
            nombre = view.findViewById(R.id.text_nombre) as TextView
            apellido= view.findViewById(R.id.text_apellido) as TextView
            numeroAuto= view.findViewById(R.id.text_fechanac) as TextView
            detalle= view.findViewById(R.id.button_detalle) as Button

            val layout = view.findViewById(R.id.relative_layout) as RelativeLayout
            layout.setOnClickListener({view -> val nombre_conductor= view.findViewById(R.id.text_nombre) as TextView

            })
        }


    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val conductor =listaConductor[position]
        holder.nombre.setText(conductor.nombre)
        holder.apellido.setText(conductor.apellido)
        holder.numeroAuto.setText(conductor.numeroAutos)

        holder.detalle.setOnClickListener{view ->
            val intent = Intent(view.context, DetalleActivity::class.java)
            startActivity(view.context,intent,null)
        }
    }


    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return listaConductor.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.activity_lista_conductor,parent,false)
        return MyViewHolder(itemView)
    }



}
