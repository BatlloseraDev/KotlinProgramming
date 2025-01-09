import kotlin.random.Random

class Dado {
    var caras: Int =0
    constructor(c:Int){
        if ((c>12) || (c<6)) this.caras = 6
        else this.caras = c
    }
    fun lanzar(): Int {
        return Random.nextInt(1, caras + 1)
    }
}