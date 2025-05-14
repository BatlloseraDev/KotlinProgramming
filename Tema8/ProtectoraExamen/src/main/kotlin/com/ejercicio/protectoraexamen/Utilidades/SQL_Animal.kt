package com.ejercicio.protectoraexamen.Utilidades

object SQL_Animal {


    const val SELECT_BY_ID = "SELECT * FROM animales WHERE id=?"
    const val  SELECT_BY_NOMBRE = "SELECT * FROM animales WHERE nombre=?"
    const val SELECT_ALL = "SELECT * FROM animales ORDER BY id"

}