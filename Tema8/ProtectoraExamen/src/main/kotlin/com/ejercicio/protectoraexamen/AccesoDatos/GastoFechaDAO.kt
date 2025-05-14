package com.ejercicio.protectoraexamen.AccesoDatos

import com.ejercicio.protectoraexamen.Negocio.GastoFecha

interface GastoFechaDAO {

    fun aniadirGasto(gasto: GastoFecha):Boolean

}