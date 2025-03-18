package org.example.DB

import jdk.jfr.internal.consumer.FileAccess
import org.example.Helpers.PropertiesReader
import org.example.Modelo.Peli
import java.io.*

object Database {
    val ARCHIVO_BIN = PropertiesReader.getProperty("ARCHIVO_BIN")
    var listaPeliculas = ArrayList<Peli>()

    //📌 Función para cargar las películas desde el archivo

    fun cargarPeliculas():Boolean{
        var conseguido= true

        try {
            DataInputStream(FileInputStream(File(ARCHIVO_BIN))).use { input ->
                while (input.available() > 0) {
                    val nombre = input.readUTF()
                    val director = input.readUTF()
                    val duracion = input.readInt()
                    val anio = input.readInt()
                    listaPeliculas.add(Peli(nombre, director, duracion, anio))
                }
            }
        }catch ( e: IOException){
            conseguido= false
        }



        return conseguido
    }



    /* fun cargarPeliculas(): ArrayList<Peli> {

        val archivo = File(ARCHIVO_BIN)

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
*/

    fun guardarPeliculas():Boolean{
        val archive= File(ARCHIVO_BIN)
        var conseguido= true
        var limpiada = false

        listaPeliculas.forEach{
            try{
                DataOutputStream(FileOutputStream(archive,limpiada)).use {output->
                    output.writeUTF(it.titulo)
                    output.writeUTF(it.director)
                    output.writeInt(it.duracion)
                    output.writeInt(it.anio)
                    if(!limpiada) limpiada=true
                }
            } catch (e: IOException){
                conseguido=false
            }

        }
        return conseguido
    }

/*
    //📦 Función para guardar las películas en el archivo
    fun guardarPeliculas() {
        val archivo = File(ARCHIVO_BIN)

        //Vaciar el archivo antes de escribir
        archivo.writeText("")

        //Escribir cada película en el archivo
        listaPeliculas.forEach { peli ->
            archivo.appendText("${peli.titulo}, ${peli.director}, ${peli.duracion}, ${peli.anio}\n")
        }

        //Otra opción, en una sola línea:
        //File(ARCHIVO).writeText(lista.joinToString("\n") { "${it.titulo},${it.director},${it.duracion},${it.anio}" })
    }
*/

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