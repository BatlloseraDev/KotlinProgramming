import kotlin.random.Random

class Drones {
    var operativo:Boolean = true
    var asignadoX:Int=0
    var asignadoY:Int=0
    var numeroDron : Int  = 0
        get() = field

    companion object{
        var contar:Int =1
    }
    constructor(){
        numeroDron = contar
        contar ++
    }
    fun Chequeado(){
        var i = Random.nextInt(100)
        if (i<20){
            operativo=false
        }
    }

    override fun toString(): String {
        return "Drones(operativo=$operativo, asignadoX=$asignadoX, asignadoY=$asignadoY, numeroDron=$numeroDron)"
    }

}