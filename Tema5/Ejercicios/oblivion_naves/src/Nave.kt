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
}