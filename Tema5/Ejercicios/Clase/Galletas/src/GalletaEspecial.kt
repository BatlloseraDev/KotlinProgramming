class GalletaEspecial :GalletaBase {

    var formaGalleta: Forma = Forma.PEZ
    var galletasBase= ArrayList<GalletaBase>()

    companion object
    {
        var numeroGalletasEspeciales= 0
    }


    constructor( formaGalleta:Forma, galletasBase: ArrayList<GalletaBase>)
    {
        this.formaGalleta=formaGalleta
        this.galletasBase=galletasBase
        numeroGalletas++
        numeroGalletasEspeciales++
    }

    constructor()
    {
        numeroGalletas++
        numeroGalletasEspeciales++
    }

    fun formaGalletaCambiar(f:Forma)//setter
    {
        this.formaGalleta= f
    }

    fun addGalletaBase(g:GalletaBase)
    {
        galletasBase.add(g)
    }

    override fun toString(): String {
        return "Esta galleta es una galleta Especial \n\tSabor: $sabor\n\tPeso: $peso\n\t Forma: ${formaGalleta}  \n\tY las galletas base:\n\t"+
                galletasBase.mapIndexed{index, GalletaBase-> "${index +1}. $GalletaBase" }.joinToString( "\n\t\t" )
    }
}

