package com.ejercicio.ejercicioformulario.GestorFicheros

import com.ejercicio.ejercicioformulario.Modelo.Persona
import java.io.File
import java.io.BufferedReader

class AlumnoDAOFicheros : AlumnoDAO {

    var nombreFichero = "src/main/kotlin/com/ejercicio/ejercicioformulario/alumnos.txt"//"src/main/kotlin/alumnos.txt"
    var file= crearFichero(nombreFichero)

    fun crearFichero(ruta: String): File
    {
        var file= File(ruta)
        if(!file.exists()){
            file.createNewFile()
        }
        return file
    }

    override fun insertAlumno(alumno: Persona): Boolean {
        var conseguido= false
        var f=file
        var linea: String=""

        try{
            linea=alumno.toString()
            f.appendText(linea+System.lineSeparator())
            conseguido = true
        }catch(e:Exception){
            println(e)
        }

        return conseguido
    }

}