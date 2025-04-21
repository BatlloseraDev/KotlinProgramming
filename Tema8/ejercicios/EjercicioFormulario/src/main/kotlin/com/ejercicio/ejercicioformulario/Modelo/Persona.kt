package com.ejercicio.ejercicioformulario.Modelo

data class Persona(val nombre:String, val edad:Int, val curso:String, val asignaturas:ArrayList<String>, val dual:Boolean){

    override fun toString(): String {
        return "Persona($nombre, $edad, $curso, $dual,asignaturas=${asignaturas.joinToString(", ")})"
    }
}
