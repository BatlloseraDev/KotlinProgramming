package com.ejercicio.protectoraexamen.AccesoDatos

import com.ejercicio.protectoraexamen.Negocio.GastoFecha
import com.ejercicio.protectoraexamen.Utilidades.ConexionBD
import com.ejercicio.protectoraexamen.Utilidades.SQL_GastoFecha

class GastoFechaDAOImpl: GastoFechaDAO {

    private val conexion = ConexionBD()


    override fun aniadirGasto(gasto: GastoFecha): Boolean {
        conexion.conectar()


        val ps= conexion.getPreparedStatement(SQL_GastoFecha.INSERT_GASTO)
        ps?.setString(1,gasto.fecha)
        ps?.setDouble(2,gasto.gasto)

        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result==1
    }


}