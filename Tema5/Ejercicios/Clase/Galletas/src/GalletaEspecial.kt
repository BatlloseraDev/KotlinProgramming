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
}

