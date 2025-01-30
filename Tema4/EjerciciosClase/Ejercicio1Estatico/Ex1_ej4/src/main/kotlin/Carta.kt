class Carta {
    var tipo: TipoCarta = TipoCarta.DRAGONES
    var indiceVida: Int = (5..100).random()
    var poder: Int = (10..20).random()
    var dado = Dado((6..12).random())

    fun puedeJugar(): Boolean {
        return indiceVida > 0
    }

    fun enfrentar(cartaContrincante: Carta): Boolean {
       return poder +  dado.lanzar() > cartaContrincante.poder + cartaContrincante.dado.lanzar()
    }
}