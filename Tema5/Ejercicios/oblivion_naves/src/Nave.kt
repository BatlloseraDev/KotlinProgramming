class Nave {

    var id:Int= 0
    var operativo:Boolean=true


    companion object{
        private var contador= 0
    }

    constructor()
    {
        id= contador
        contador++
    }

    fun cambiarEstado(e:Boolean)
    {
        operativo=e
    }

    override fun toString(): String {
        return "Nave id: $id\n\t\tOperativa:$operativo"
    }
}