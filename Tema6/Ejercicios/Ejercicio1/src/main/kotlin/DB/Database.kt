package org.example.DB

import org.example.Modelo.Peli
import java.io.File

object Database {
    const val ARCHIVO = "./src/main/peliculas.txt"
    var listaPeliculas = ArrayList<Peli>()

    //📌 Función para cargar las películas desde el archivo
    fun cargarPeliculas(): ArrayList<Peli> {

        val archivo = File(ARCHIVO)

        if (archivo.exists()) {
            archivo.forEachLine { linea ->
                val datos = linea.split(",")
                if (datos.size == 4) {
                    val pelicula = Peli(datos[0].trim(), datos[1].trim(), datos[2].trim().toInt(), datos[3].trim().toInt())
                    listaPeliculas.add(pelicula)
                }
            }
        }
        return listaPeliculas
    }

    //📦 Función para guardar las películas en el archivo
    fun guardarPeliculas() {
        val archivo = File(ARCHIVO)

        //Vaciar el archivo antes de escribir
        archivo.writeText("")

        //Escribir cada película en el archivo
        listaPeliculas.forEach { peli ->
            archivo.appendText("${peli.titulo}, ${peli.director}, ${peli.duracion}, ${peli.anio}\n")
        }

        //Otra opción, en una sola línea:
        //File(ARCHIVO).writeText(lista.joinToString("\n") { "${it.titulo},${it.director},${it.duracion},${it.anio}" })
    }

    fun addPeli(peli: Peli) {
        listaPeliculas.add(peli)
    }

    fun removePeli(pos: Int): Boolean {
        var borrado = true
        try {
            listaPeliculas.removeAt(pos)
        } catch (e:Exception) {
            borrado = false
        }
        return borrado
    }

    fun buscarPeli(palabras: String): List<Peli> {
        return listaPeliculas.filter { it.titulo.contains(palabras, ignoreCase = true) }
    }

}