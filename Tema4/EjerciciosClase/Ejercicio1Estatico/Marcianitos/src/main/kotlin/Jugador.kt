import kotlin.random.Random

class Jugador {
    var m1 : Marciano=Marciano()
    var m2 : Marciano=Marciano("m2")
    var m3 : Marciano=Marciano()
    var nombre:String = ""


    constructor(m1:Marciano,m2:Marciano,m3:Marciano){
        this.m1 = m1
        this.m2 = m2
        this.m3 = m3
    }

    fun seguirJuego():Boolean{
        var seguir = false
        if (m1.vida >0 || m2.vida >0 || m3.vida >0){
            seguir = true
        }
        return seguir
    }

    fun elegirLuchador():Marciano{
        var n= 0
        var m= Marciano()
        do {
            n= Random.nextInt(1,4)
            when (n) {
                1 -> {
                    m = this.m1
                }
                2 -> {
                    m = this.m2
                }
                3 -> {
                    m = this.m3
                }
            }
        }while (m.vida<=0)

        return m
    }

    override fun toString(): String {
        return "Jugador:$nombre:\n$m1\n$m2\n$m3"
    }

}