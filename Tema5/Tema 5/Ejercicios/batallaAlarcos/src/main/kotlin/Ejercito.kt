import kotlin.random.Random

class Ejercito {
    var jefe:String = ""
    var batallon = ArrayList<Soldado>()

    constructor(){}

    constructor(j:String){
        jefe = j
    }

    fun crearBatallon(c:Int, n:String) {
        for (i in 1..c) {
            var s = Soldado(n +"_" +i)
            batallon.add(s)
        }
    }

    fun anadirSoldado(s:Soldado){
        batallon.add(s)
    }
    fun morirSoldado(s:Soldado){
        batallon.remove(s)
    }

    fun quedanVivos():Boolean{
        return (batallon.size != 0)
    }
    fun soldadoParaPelear():Soldado{
           var n = Random.nextInt(0,batallon.size)
           return batallon[n]
    }
    fun cantidadSoldados():Int{
        return batallon.size
    }
}