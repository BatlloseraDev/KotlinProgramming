package com.example.debbddajavafx.Negocio

class Producto(val cod_prod:Int, var cod_cat :Int, var nombre:String, var cantidad:Int,var precio: Int) {
    override fun toString(): String {
        return "Producto [codigo producto: $cod_prod, codigo categoria: $cod_cat, nombre: $nombre, cantidad:$cantidad, precio: $precio]"
    }
}