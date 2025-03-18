package org.example.Modelo

data class Peli(val titulo: String, val director: String, val duracion: Int, val anio: Int){
    override fun toString(): String {
        return "$titulo, $director, $duracion, $anio"
    }
}

