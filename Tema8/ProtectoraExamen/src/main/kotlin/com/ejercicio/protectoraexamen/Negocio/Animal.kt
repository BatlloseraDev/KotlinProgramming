package com.ejercicio.protectoraexamen.Negocio

import com.ejercicio.protectoraexamen.Utilidades.CONSTANTES
import com.ejercicio.protectoraexamen.Utilidades.CONSTANTES.MAX_SOL

open class Animal(val ID:Int, val nombre:String, val tipo: TipoAnimal, val sexo: Boolean, val edad: Int, val sociable:Boolean, val apadrinado: Boolean ) {

    var solicitudes= ArrayList<Solicitud>()

    //sexo: false es hembra, true es macho


    fun aniadirSolicitud(solicitud:Solicitud){

        if(solicitudes.size<MAX_SOL){
            solicitudes.add(solicitud)
        }

    }

    fun get_Acogido(): Boolean {
        var acogido = false;
        for(solicitud in solicitudes){
            if(solicitud.tIpoSolicitud == TIpoSolicitud.ACOGIDA) acogido = true
        }
        return acogido;
    }

    fun get_SizeSolicitudes():Int{
        return solicitudes.size
    }

    open fun gastoAnual():Double
    {
        return 0.0
    }

    open fun gastoComida():Double{
        return 0.0
    }

    override fun toString(): String {
        return "Animal $ID, Nombre: $nombre, tipo: $tipo, Disponible: ${if(get_SizeSolicitudes()>=CONSTANTES.MAX_SOL) "NO" else "SI" }"
    }
}