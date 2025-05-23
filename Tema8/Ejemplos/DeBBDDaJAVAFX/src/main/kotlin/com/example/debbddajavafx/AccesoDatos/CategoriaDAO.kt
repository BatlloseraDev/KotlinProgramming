package com.example.debbddajavafx.AccesoDatos

import com.example.debbddajavafx.Negocio.*

interface CategoriaDAO {
    fun getCategoriaByCodigo(codigo: Int): Categoria?
    fun getAllCategorias(): List<Categoria>
    fun insertCategoria(categoria: Categoria): Boolean
    fun updateCategoria(categoria: Categoria): Boolean
    fun deleteCategoria(codigo: Int): Boolean
}