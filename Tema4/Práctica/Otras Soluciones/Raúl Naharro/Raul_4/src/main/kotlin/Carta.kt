class Carta {
    var dado = Factoria.crearDado()
    private var tipo : TipoCarta
    var poder : Int
    var vida : Int

    constructor(tipo : TipoCarta, poder : Int, vida : Int){
        this.tipo = tipo
        this.poder = poder
        this.vida = vida
    }

    fun herir(objetivo : Carta, danio : Int){
        objetivo.vida -= danio
        if(objetivo.vida < 0) objetivo.vida = 0
    }

    fun enfrentar(enemigo : Carta) {
        var valorDado = dado.lanzarDado()
        var valorDadoEnemigo = enemigo.dado.lanzarDado()
        if(valorDado > valorDadoEnemigo) herir(enemigo, poder+valorDado)
        else if(valorDado < valorDadoEnemigo) herir(this, enemigo.poder+valorDadoEnemigo)
        else println("Ha habido un empate. Ninguna de las cartas recibe daño")
    }

    fun puedeUsarse() : Boolean {
        return (vida > 0)
    }

    override fun toString(): String {
        return "tipo:$tipo || poder:$poder || vida:$vida"
    }
}