class Pistola {

    var nombre=""
    var municion= ArrayList<Municion>()

    constructor(){}

    constructor(nombre: String, municion: ArrayList<Municion>) {
        this.nombre = nombre
        this.municion = municion
    }

    fun disparar():Int{

        var danio= 0
        if(this.municion.isNotEmpty())
        {
            println("disparo")
            danio = municion[0].cantidadDanio()
            municion.removeFirst()
            //
        }
        else{
            println("Recarga")
        }
        return danio
    }

}