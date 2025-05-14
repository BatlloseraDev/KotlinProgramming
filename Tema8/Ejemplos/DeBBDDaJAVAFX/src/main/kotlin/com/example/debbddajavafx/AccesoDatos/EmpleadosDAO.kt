package com.example.debbddajavafx.AccesoDatos
import com.example.debbddajavafx.Negocio.*

interface EmpleadosDAO {
    fun getEmpleadoPorDNI(dni: Int):Empleado?
    fun getAllEmpleados(): List<Empleado>
    fun insertEmpleado(empleado: Empleado):Boolean
    fun deleteEmpleado(dni: Int): Boolean
    fun updateEmpleado(empleado: Empleado) : Boolean
}