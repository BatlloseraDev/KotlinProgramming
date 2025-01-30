open class GalletaRellena: GalletaBase {
    var saborRelleno=  Sabor()
    var cantidadRelleno: Double= 0.0 //es public por ende tiene getter y setter

    companion object
    {
        var numeroGalletaRellena= 0
    }

    constructor(saborRelleno: Sabor, cantidadRelleno: Double)
    {
        this.saborRelleno = saborRelleno
        this.cantidadRelleno=cantidadRelleno
        numeroGalletaRellena++
    }
    constructor()
    {
        numeroGalletaRellena++
    }

    fun saberCantidadRelleno():Double
    {
        return cantidadRelleno
    }


}