class GalletaRellenaEspecial: GalletaRellena {
    var saboresEspecial= ArrayList<Sabor>()
    var animal= false

    companion object
    {
        var numeroGalletaRellenaEspecial= 0
    }


    constructor( animal: Boolean,saboresEspecial: ArrayList<Sabor>)
    {
        this.animal = animal
        this.saboresEspecial = saboresEspecial

        numeroGalletaRellenaEspecial++
    }
    constructor()
    {

        numeroGalletaRellenaEspecial++
    }

    fun cambiarConsumoAnimal(t: Boolean)
    {
        animal=t
    }

    fun addSaboresEsp(s:Sabor)
    {
        saboresEspecial.add(s)
    }

    override fun toString(): String {
        return "Esta galleta es una galleta Especial Rellena \n\tSabor Relleno: $saborRelleno\n\tCantidad Relleno: $cantidadRelleno \n\tPeso: $peso\n\t  \n\n\tY las galletas base:\n\t"+
                ingredientes.mapIndexed{index, ElementoElaboracion-> "${index +1}. $ElementoElaboracion" }.joinToString( "\n\t\t" ) +
                "\n\n\t y los sabores especiales" +
                saboresEspecial.mapIndexed{index, Sabor-> "${index +1}. $Sabor" }.joinToString( "\n\t\t" )
    }

}