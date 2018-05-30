package com.example.andreavillacis.examenib

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import java.util.*

class conductor_Activity (var nombre:String,
                          var apellido: String,
                          var fecha_nacimiento:Date?,
                          var numero_autos:Int,
                          var licencia_valida: Boolean):Parcelable{


    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readDate(),
            parcel.readInt(),
            parcel.readByte() != 0.toByte()) {
    }


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeString(apellido)
        parcel.writeInt(numero_autos)
        parcel.writeDate(fecha_nacimiento)
        parcel.writeByte((if (licencia_valida) 1 else 0).toByte())
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<conductor_Activity> {
        override fun createFromParcel(parcel: Parcel): conductor_Activity {
            return conductor_Activity(parcel)
        }

        override fun newArray(size: Int): Array<conductor_Activity?> {
            return arrayOfNulls(size)
        }
    }
}


fun Parcel.writeDate (date:Date?){
    writeLong(date?.time ?:-1)
}

fun Parcel.readDate(): Date? {
    val long = readLong()
    return if (long != -1L) Date(long) else null
}
