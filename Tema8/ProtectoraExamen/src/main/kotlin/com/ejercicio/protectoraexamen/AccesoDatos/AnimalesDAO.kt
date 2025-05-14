package com.ejercicio.protectoraexamen.AccesoDatos

import com.ejercicio.protectoraexamen.Negocio.Animal

interface AnimalesDAO {

    fun getAnimalByID(id:Int): Animal?
    fun getAnimalByNombre(nombre:String):Animal?
    fun getAllAnimales():List<Animal>


    fun escribirSolicitudFichero(animal: Animal):Boolean

}