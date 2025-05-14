package com.example.debbddajavafx.Negocio

class Empleado(val dni:Int, var nombre:String, var puesto: Int) {
    override fun toString(): String {
        return "Empleado [DNI: $dni, nombre: $nombre, puesto: $puesto]"
    }

}