class EmpleadoDAOImpl: EmpleadosDAO {

    private val conexion = ConexionBD()

    override fun getEmpleadoPorDNI(dni: Int): Empleado? {
        conexion.conectar()
        val query= "select * from empleados WHERE dni = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, dni)
        val rs = ps?.executeQuery()
        var empleado: Empleado? = null
        if(rs?.next() == true){
            empleado = Empleado(rs.getInt("DNI"), rs.getString("nombre"),rs.getInt("puesto"))
        }
        ps?.close()
        conexion.desconectar()
        return empleado
    }

    override fun getAllEmpleados(): List<Empleado>{
        conexion.conectar()
        val query= "select * from empleados"
        val st= conexion.getStatement()
        val rs = st?.executeQuery(query)
        val empleados =mutableListOf<Empleado>()
        while(rs?.next()==true){
            val empleado= Empleado(rs.getInt("DNI"), rs.getString("nombre"),rs.getInt("puesto"))
            empleados.add(empleado)
        }
        st?.close()
        conexion.desconectar()
        return empleados
    }

    override fun insertEmpleado(empleado: Empleado):Boolean {
        conexion.conectar()
        val query = "INSERT INTO empleados(DNI, nombre, puesto) VALUES (?, ?, ?)"
        val ps=conexion.getPreparedStatement(query)
        ps?.setInt(1, empleado.dni)
        ps?.setString(2, empleado.nombre)
        ps?.setInt(3, empleado.puesto)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

    override fun updateEmpleado(empleado: Empleado):Boolean {
        conexion.conectar()
        val query = "UPDATE empleados SET nombre = ?, puesto = ? WHERE DNI = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(3, empleado.dni)
        ps?.setString(1, empleado.nombre)
        ps?.setInt(2, empleado.puesto)
        val result=ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

    override fun deleteEmpleado(dni: Int):Boolean {
        conexion.conectar()
        val query = "DELETE FROM empleados WHERE DNI = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, dni)
        val result=ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

}