package com.example.debbddajavafx.utilidades

object SQL_Categorias {

        const val SELECT_BY_CODIGO = "SELECT * FROM categorias WHERE cod_grupo = ?"
        const val SELECT_ALL = "SELECT * FROM categorias"
        const val INSERT = "INSERT INTO categorias (cod_grupo, descripcion) VALUES (?, ?)"
        const val UPDATE = "UPDATE categorias SET descripcion = ? WHERE cod_grupo = ?"
        const val DELETE = "DELETE FROM categorias WHERE cod_grupo = ?"

        const val SELECT_EMPLEADO_BY_DNI = "select * from empleados WHERE dni = ?"
        const val SELECT_ALL_EMPLEADOS= "select * from empleados"
        const val INSERT_EMPLEADO= "INSERT INTO empleados(DNI, nombre, puesto) VALUES (?, ?, ?)"
        const val UPDATE_EMPLEADO= "UPDATE empleados SET nombre = ?, puesto = ? WHERE DNI = ?"
        const val DELETE_EMPLEADO= "DELETE FROM empleados WHERE DNI = ?"


        const val SELECT_PRODUCTO_BY_CODIGO = "SELECT * FROM productos WHERE cod_prod = ?"
        const val SELECT_ALL_PRODUCTOS = "SELECT * FROM productos"
        const val INSERT_PRODUCTO = "INSERT INTO productos(cod_prod,cod_cat, nombre, cant, precio) VALUES (?, ?, ?, ?,?)"
        const val UPDATE_PRODUCTO = "UPDATE productos SET cod_cat = ? , nombre = ?, cant =?, precio = ? WHERE cod_prod = ?"
        const val DELETE_PRODUCTO = "DELETE FROM productos WHERE cod_prod = ?"
        const val SELECT_PRODUCTO_BY_CODIGO_PRO = "SELECT productos.*, categorias.* FROM productos WHERE cod_prod = ? JOIN categorias on productos.cod_cat = categorias.cod_grupo"
        const val SELECT_NAME= "SELECT descripcion FROM categorias WHERE cod_grupo = ?"

}