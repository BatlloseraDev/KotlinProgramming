open class GalletaRellena: Galleta {
    var saborRelleno= Sabor()
    var cantidadRelleno: Int =0
    var consumoAnimal = false

    companion object{
        var cantidadTotalRellena: Int = 0
    }
    constructor(){
        cantidadTotalRellena++
    }
    constructor(s:Sabor, c:Int){
        this.saborRelleno = s
        this.cantidadRelleno = c
        cantidadTotalRellena++
    }
}