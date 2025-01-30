import kotlin.random.Random

class Marciano {
    var nombre =""
    var vida: Int = Random.nextInt(0,101)
    var potencia: Int =0
    companion object{
        var morirTodos = false
    }
    constructor(nombre:String){
        this.nombre = nombre
        this.potencia = (15..20).random()
    }
    constructor(nombre:String,vida:Int,potencia:Int){
        this.nombre = nombre
        this.potencia = potencia
        this.vida = vida

    }
    constructor(){}

    fun pelea(enemigo:Marciano){
        if (this.potencia > enemigo.potencia){
            enemigo.vida = enemigo.vida - this.potencia
        }else{
            //si tienen la misma potencia pierde el de casa
            if (this.potencia == enemigo.potencia){
                enemigo.vida = enemigo.vida - this.potencia
                this.vida = this.vida - enemigo.potencia
            }else{
                this.vida = this.vida - enemigo.potencia
            }

        }

    }

    override fun toString(): String {
        return "[nombre='$nombre', vida=$vida, potencia=$potencia]"
    }

}