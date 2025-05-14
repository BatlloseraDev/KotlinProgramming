package com.ejercicio.protectoraexamen.Negocio

class GastoFecha {
    var id: Int? = null
    var fecha:String
    var gasto:Double

    constructor(id: Int, fecha: String, gasto: Double) {
        this.id = id
        this.fecha = fecha
        this.gasto = gasto
    }


    constructor(fecha: String, gasto: Double) {
        this.fecha= fecha
        this.gasto= gasto

    }

}