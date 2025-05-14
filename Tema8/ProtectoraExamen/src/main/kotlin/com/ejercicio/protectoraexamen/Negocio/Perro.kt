package com.ejercicio.protectoraexamen.Negocio

import com.ejercicio.protectoraexamen.Utilidades.CONSTANTES

class Perro: Animal {

    val raza: String
    val ppp: Boolean
    val leishmania: Boolean
    val tamanio: Double

    constructor(ID:Int,nombre:String ,raza:String, sexo:Boolean, edad:Int, sociable:Boolean, apadrinado:Boolean,ppp:Boolean, leishmania:Boolean, tamanio: Double)
            :super(ID, nombre, TipoAnimal.PERRO, sexo, edad, sociable, apadrinado){
        this.raza= raza
        this.ppp = ppp
        this.leishmania = leishmania
        this.tamanio = tamanio


    }


    override fun gastoAnual(): Double {

        var calculo= 0.0

        if(!apadrinado){
            if(leishmania){
                calculo+= (CONSTANTES.PRECIO_LEISHMANIA*12)
            }
            if(ppp){
                calculo+= CONSTANTES.PRECIO_SEDACION
            }
            calculo += CONSTANTES.PRECIO_RABIA
        }

        return calculo
    }

    override fun gastoComida(): Double {

        var calculo = 0.0
        if(edad>=2){
            when(true){
                (tamanio<=15.0) ->{
                    calculo =200.0
                }
                (tamanio>15.0 && tamanio<=25.0) ->{
                    calculo = 300.0
                }
                (tamanio>25.0)->{
                    calculo = tamanio*0.015*1000
                }
                else->{
                    println("Error")
                }
            }
        }
        return calculo
    }


    override fun toString(): String {
        return super.toString() +" raza: $raza"
    }
}