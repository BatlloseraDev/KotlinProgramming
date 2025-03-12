class Aldeano {

    var vida:Int= 0
    var nacion:Nacion


    constructor(vida:Int,nacion:Nacion)
    {
        this.vida = vida
        this.nacion = nacion
    }

    fun trabaja(tipoMina: Int)
    {

        nacion.addItem(tipoMina)
    }


    fun getNombreNacion(): String
    {
        return nacion.nombre
    }

    fun cambiarNacion(nacion: Nacion){
        this.nacion = nacion
    }

}