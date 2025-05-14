package com.example.debbddajavafx.AccesoDatos

import com.example.debbddajavafx.utilidades.*
import com.example.debbddajavafx.Negocio.*


class ProductoDAOImpl: ProductoDAO {

    private val conexion = ConexionBD()

    override fun getProductoPorCodigo(codigo: Int): Producto? {
        conexion.conectar()
        val ps = conexion.getPreparedStatement(SQL_Categorias.SELECT_PRODUCTO_BY_CODIGO)
        ps?.setInt(1, codigo)
        val rs = ps?.executeQuery()
        var producto: Producto? = null
        if (rs?.next()==true){
            producto = Producto(rs.getInt("cod_prod"),
                rs.getInt("cod_cat"),
                rs.getString("nombre"),
                rs.getInt("cant"),
                rs.getInt("precio"))
        }
        ps?.close()
        conexion.desconectar()
        return producto
    }

    override fun getAllProductos(): List<Producto> {
        conexion.conectar()
        val st= conexion.getStatement()
        val rs = st?.executeQuery(SQL_Categorias.SELECT_ALL_PRODUCTOS)
        val productos = mutableListOf<Producto>()
        while (rs?.next() == true){
            val producto = Producto(rs.getInt("cod_prod"),
                rs.getInt("cod_cat"),
                rs.getString("nombre"),
                rs.getInt("cant"),
                rs.getInt("precio"))
            productos.add(producto)
        }
        st?.close()
        conexion.desconectar()
        return productos
    }

    override fun insertProducto(producto: Producto): Boolean {
        conexion.conectar()

        val ps = conexion.getPreparedStatement(SQL_Categorias.INSERT_PRODUCTO)
        ps?.setInt(1,producto.cod_prod)
        ps?.setInt(2,producto.cod_cat)
        ps?.setString(3,producto.nombre)
        ps?.setInt(4,producto.cantidad)
        ps?.setInt(5,producto.precio)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result==1

    }

    override fun deleteProducto(codigo: Int): Boolean {
        conexion.conectar()
        val ps= conexion.getPreparedStatement(SQL_Categorias.DELETE_PRODUCTO)
        ps?.setInt(1,codigo)
        val resuslt = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return resuslt == 1
    }

    override fun updateProducto(producto: Producto): Boolean {
        conexion.conectar()
        val ps= conexion.getPreparedStatement(SQL_Categorias.UPDATE_PRODUCTO)
        ps?.setInt(5,producto.cod_prod)
        ps?.setInt(1,producto.cod_cat)
        ps?.setString(2,producto.nombre)
        ps?.setInt(3,producto.cantidad)
        ps?.setInt(4,producto.precio)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result==1
    }

    override fun getCategoriaNombre(cod_grupo: Int): String? {
        conexion.conectar()
        val ps = conexion.getPreparedStatement(SQL_Categorias.SELECT_NAME)
        ps?.setInt(1,cod_grupo)
        val rs = ps?.executeQuery()
        var nombre: String? = null
        if (rs?.next() == true){
            nombre = rs.getString("descripcion")
        }
        ps?.close()
        conexion.desconectar()
        return nombre
    }
}