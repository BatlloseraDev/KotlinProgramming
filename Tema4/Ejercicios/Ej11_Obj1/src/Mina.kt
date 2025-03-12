class Mina {

    var tipoMina: TipoMina
    var trabajadores= ArrayList<Aldeano>()
    var cantidad= 500

    constructor(tipoMina: TipoMina, cantidad: Int)
    {
        this.tipoMina = tipoMina
        this.cantidad = cantidad
    }


    fun addTrabajador(aldeano: Aldeano)
    {
        trabajadores.add(aldeano);
    }

    fun restarItem()
    {
        if(cantidad>0) cantidad-=1
        else println("No quedan más ${tipoMina.name} en la mina")
    }

    fun esTrabajada()
    {
        for(trabajador in trabajadores)
        {
            var nombreMina = Constantes.NOMBREMINAS.indexOf(tipoMina.name)
            trabajador.trabaja(nombreMina)
            restarItem()
        }
    }

    fun getArrayTrabajadores(): ArrayList<Aldeano>
    {
        return trabajadores
    }
}