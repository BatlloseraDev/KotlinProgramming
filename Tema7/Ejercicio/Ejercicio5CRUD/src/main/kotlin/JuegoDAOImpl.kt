class JuegoDAOImpl:JuegoDAO {
    private val conexion = ConexionBD()

    override fun existeJuegoPorIdUsuario(userId: Int): Boolean {
        conexion.conectar()
        val query = "SELECT COUNT(*) FROM estadisticasjuego WHERE userId = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, userId)
        val rs = ps?.executeQuery()

        var count = 0
        if (rs?.next() == true) {
            count = rs.getInt(1)
        }

        ps?.close()
        conexion.desconectar()

        return count > 0
    }
    override fun actualizarGanado(userId: Int) {
        conexion.conectar()
        val query= "UPDATE estadisticasjuego SET partidasJugadas = partidasJugadas + 1, partidasGanadas = partidasGanadas + 1 WHERE userId = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, userId)
        ps?.executeUpdate()

        conexion.desconectar()
    }
    override fun actualizarPerdido(userId: Int) {
        conexion.conectar()

        val query=  "UPDATE estadisticasjuego SET partidasJugadas = partidasJugadas + 1 WHERE userId = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, userId)
        ps?.executeUpdate()

        conexion.desconectar()
    }

    override fun insertarEstadisticasJuego(userId: Int,partidas:Int, ganadas:Int) {
        conexion.conectar()

        val query = "INSERT INTO estadisticasjuego (userId, partidasJugadas, partidasGanadas) VALUES (?, ?, ?)"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, userId)
        ps?.setInt(2, partidas)
        ps?.setInt(3, ganadas)
        ps?.executeUpdate()

        conexion.desconectar()
    }
}