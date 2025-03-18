package org.example.Modelo

import kotlin.random.Random

object Factoria {

    fun pedirPelicula(): Peli {
        println("\n🎬 📌 Añadir una nueva película:")
        print("🎥 Título: ")
        val titulo = readln()
        print("🎬 Director: ")
        val director = readln()
        print("⏳ Duración (minutos): ")
        val duracion = readln().toIntOrNull() ?: 0
        print("📅 Año de estreno: ")
        val anio = readln().toIntOrNull() ?: 0

        return Peli(director,titulo,duracion, anio)
    }

    fun generarPelicula(): Peli {
        var titulos= arrayListOf("Un título ","Otro título ","La venganza ","El retorno ")
        var director= arrayListOf("Director ","Directora ","Directores varios ")
        var anio = Random.nextInt(1920,2025)
        val duracion = Random.nextInt(90,250)
        return Peli(titulos.random() + Random.nextInt(10).toString(),director.random() + Random.nextInt(10), duracion, anio)
    }

}