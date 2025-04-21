package com.ejercicio.ejercicioformulario.GestorFicheros

import com.ejercicio.ejercicioformulario.Modelo.Persona

interface AlumnoDAO {

    fun insertAlumno(alumno: Persona):Boolean
}