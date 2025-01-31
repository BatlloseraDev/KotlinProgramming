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
    override fun toString(): String {
        return "Esta galleta es una galleta Rellena \n\tSabor: $sabor \n\tSabor Relleno: $saborRelleno\n\tCantidad Relleno: $cantidadRelleno \n\tPeso: $peso\n\t  \n\tY las galletas base:\n\t\t"+
                ingredientes.mapIndexed{index, ElementoElaboracion-> "${index +1}. $ElementoElaboracion" }.joinToString( "\n\t\t" )
    }

}