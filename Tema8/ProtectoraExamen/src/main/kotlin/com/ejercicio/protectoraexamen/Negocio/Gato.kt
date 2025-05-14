package com.ejercicio.protectoraexamen.Negocio

import com.ejercicio.protectoraexamen.Utilidades.CONSTANTES.PRECIO_CELO

class Gato:Animal {

    val esterilizado: Boolean


    constructor(ID:Int,nombre:String, sexo:Boolean, edad:Int, sociable:Boolean, apadrinado:Boolean,esterilizado:Boolean)
            :super(ID, nombre, TipoAnimal.GATO , sexo, edad, sociable, apadrinado)
    {
        this.esterilizado= esterilizado
    }


    override fun gastoAnual(): Double {
        var calculo= 0.0
        if(!apadrinado ){
            if(!esterilizado) calculo = PRECIO_CELO
        }
        return calculo
    }

}