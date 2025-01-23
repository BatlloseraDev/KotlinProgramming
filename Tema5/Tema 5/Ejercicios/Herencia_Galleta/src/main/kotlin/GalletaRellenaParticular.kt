class GalletaRellenaParticular: GalletaRellena {

    var sabores=ArrayList<Sabor>()

    companion object{
        var cantidadTotalRellenaParticular: Int = 0
    }
    constructor(){
        cantidadTotalRellenaParticular++
    }

}