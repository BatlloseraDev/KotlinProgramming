class Pistolero {

    var nombre= "Willy"
    var armas= ArrayList<Pistola>()
    var vida = 100
    var partesCuerpo:Cuerpo =Cuerpo.CABEZA
    companion object
    {
        var cantidadPistoleros= 0
    }

    constructor()
    {
        cantidadPistoleros++
    }

    constructor(nombre: String, armas: ArrayList<Pistola>, vida: Int) {
        this.nombre = nombre
        this.armas = armas
        this.vida = vida
        cantidadPistoleros++
    }


    fun checkVida()
    {
        if(this.vida<=0)
        {
            cantidadPistoleros--
        }
    }

    fun pelea(pistolero: Pistolero)
    {
        if(!armas.isEmpty())
        {

            var parteCuerpo: Cuerpo= Cuerpo.values().random()
            var danio = this.armas[0].disparar() +parteCuerpo.valor
            println(parteCuerpo.valor)
            println(parteCuerpo.name)
        }

    }



}

