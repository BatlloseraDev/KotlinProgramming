class Personaje {
    var nombre= ""
    var poder= 0
    var capacidad = 50
    var tipo= TipoHabilidad.MAGIA
    var historial = ArrayList<Quest>()
    var activo= true

    constructor(nombre:String,tipo:TipoHabilidad)
    {
        this.nombre= nombre
        this.tipo= tipo
        this.poder= (500..1000).random() //no entiendo para que pero ahí esta
    }


    fun addQuest(q:Quest)
    {
            historial.add(q)
    }

    fun perderCapacidad(c:Int)
    {
        capacidad-=c
        if(capacidad<=0)
        {
            activo=false
            capacidad=0
        }

    }
    fun incapacitar()
    {
        capacidad=0
        activo=false
    }

    override fun toString(): String {
        return "Personaje: $nombre, ha acabado con capacidad: $capacidad y haciendo las siguientes misiones:\n\t"+
                "${historial.joinToString("\n\t")}"
    }
}