class GalletaEspecial: Galleta{
    var forma=Forma()
    var cantidadBasicaGalletas = ArrayList<Galleta>()

    companion object{
        var cantidadTotalEspecial: Int = 0
    }

    constructor(){
        cantidadTotalEspecial++
    }

    fun cambiarForma(f:Forma){
        this.forma = f
    }
    fun aniadirGalleta(g:Galleta){
        cantidadBasicaGalletas.add(g)
    }
}