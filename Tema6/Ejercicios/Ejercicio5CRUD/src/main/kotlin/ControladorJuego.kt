class ControladorJuego {

    private val MAX_INTENTOS = 5
    var intentos=0
    var estado = EstadoJuego.EN_PROGRESO
    var numeroSecreto = (1..10).random()
    var jugador:Int?


    constructor(email:String){
        val usuarioDAO = UsuarioDAOImpl()
        this.jugador = usuarioDAO.getIdByEmail(email)
    }

    fun jugar(respuesta: Int): EstadoJuego {
        intentos++
        if (respuesta == numeroSecreto) {
            estado = EstadoJuego.GANADO
            aniadirGanador()
        } else if (intentos == MAX_INTENTOS) {
            estado = EstadoJuego.PERDIDO
            aniadirPerdedor()
        }
        return estado
    }
    fun aniadirGanador(){
        var juegoDAO = JuegoDAOImpl()
        if (juegoDAO.existeJuegoPorIdUsuario(jugador!!)){
            juegoDAO.actualizarGanado(jugador!!)
        }else{
                juegoDAO.insertarEstadisticasJuego(jugador!!,1,1)
        }
    }
    fun aniadirPerdedor(){
        var juegoDAO = JuegoDAOImpl()
       if (juegoDAO.existeJuegoPorIdUsuario(jugador!!)){
           juegoDAO.actualizarPerdido(jugador!!)
        }else{
           juegoDAO.insertarEstadisticasJuego(jugador!!,1,0)
        }
    }
}
