package com.example.debbddajavafx.AccesoDatos
import com.example.debbddajavafx.Negocio.*

interface ProductoDAO {
    fun getProductoPorCodigo(codigo: Int):Producto?
    fun getAllProductos(): List<Producto>
    fun insertProducto(producto: Producto): Boolean
    fun deleteProducto(codigo: Int): Boolean
    fun updateProducto(producto: Producto): Boolean
    fun getCategoriaNombre(cod_grupo: Int):String?

}