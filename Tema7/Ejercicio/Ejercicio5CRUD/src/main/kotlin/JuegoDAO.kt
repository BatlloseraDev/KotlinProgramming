interface JuegoDAO {
    fun existeJuegoPorIdUsuario(userId: Int): Boolean
    fun actualizarGanado(userId: Int)
    fun actualizarPerdido(userId: Int)
    fun insertarEstadisticasJuego(userId: Int,partidas:Int, ganadas:Int)
}