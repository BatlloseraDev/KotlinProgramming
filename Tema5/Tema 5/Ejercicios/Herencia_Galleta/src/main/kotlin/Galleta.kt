open class Galleta {
    var sabor= Sabor()
    var peso: Double = 0.0
    var ingredientes = ArrayList<Elemento>()
    companion object{
        var cantidadTotal: Int = 0
    }

    constructor(s:Sabor, p:Double, i:Elemento){
        cantidadTotal++
        this.sabor = s
        this.peso=p
        this.ingredientes.add(i)
    }

    constructor(){
        cantidadTotal++
    }

    fun aniadirIngrediente(e:Elemento){
        ingredientes.add(e)
    }
}