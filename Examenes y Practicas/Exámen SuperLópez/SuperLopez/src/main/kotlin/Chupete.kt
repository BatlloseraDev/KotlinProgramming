open class Chupete:Monigotes {
    var color:Color = Color.entries.toTypedArray().random()
    open var numeroOrden = 0

    companion object{
        private var contador=2
    }
    constructor(){
        numeroOrden = contador
        contador ++
    }
}