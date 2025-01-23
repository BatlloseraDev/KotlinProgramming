import kotlin.random.Random

class Serpiente {
    var edad=0
    var cuerpo = ArrayList<Char>()
    var viva= true

    constructor()
    {
        cuerpo.add(generarColor())
    }


  /*  init {
        cuerpo.add(generarColor())
    }*/

    fun generarColor():Char
    {
        var colores = listOf('r','v','a')
        return colores.random()
    }
    fun crecer()
    {
        cuerpo.add(generarColor())
    }
    fun mudar()
    {
        for(a in cuerpo.indices)
        {
            cuerpo[a] =  generarColor()
        }
    }
    fun decrecer()
    {
        cuerpo.removeLast()
        if(cuerpo.isEmpty()) viva= false
    }



    override fun toString(): String {
        return if (viva)"Serpiente(edad=$edad,cuerpo=${getColores()})" else "serpierte muerta"
    }

    private fun getColores():String
    {
        var colores= ""
        for(a in cuerpo.indices)
        {
            colores+=cuerpo[a]
        }
        return colores
    }
}