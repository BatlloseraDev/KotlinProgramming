class ChupeteUnico: Chupete {

    var chupetesBasicos = ArrayList<Chupete>()
    var chupeteNegros = ArrayList<ChupeteNegro>()
    var cantidadChuetesNegros = 0
    var cantidadChuetesBásico = 0
    companion object{
       var creado = false
    }
    override var numeroOrden: Int = 1



    constructor(cantidadChuetesBásico:Int,cantidadChupetesNegros:Int){
        this.cantidadChuetesNegros = cantidadChupetesNegros
        this.cantidadChuetesBásico = cantidadChuetesBásico
    }

    fun crearChupeteBasico():Chupete{
        var chu = Chupete()
        if (chupetesBasicos.size<cantidadChuetesBásico) {
            chupetesBasicos.add(chu)
        }
        return chu
    }

    fun crearChupeteNegro():Chupete{
        var chu:Chupete
        if (ChupeteNegro.chupetesNegrosCreados < cantidadChuetesNegros){
            chu = ChupeteNegro()
            chupeteNegros.add(chu)
        }else{
            chu = Chupete()
            if (chupetesBasicos.size<cantidadChuetesBásico) {
                chupetesBasicos.add(chu)
            }
        }
        return chu
    }
}