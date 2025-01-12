import kotlin.random.Random

class Serpiente {
    var edad=0
    var cuerpo = ArrayList<Char>()
    var viva= true

    init {
        cuerpo.add(generarColor())
    }

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

    fun vivirUnAnio()
    {
        var probabilidad= Random.nextDouble(0.0 ,1.0)
        if(viva)
        {
            if(edad<10)
            {
                if(probabilidad<.8) crecer()
                else mudar()
            }
            else{
                if(probabilidad<.9) decrecer()
                else mudar()
            }
            if(probabilidad<.1)
            {
                println("Una serpiente murio por mangosta al pasar de año")
                viva=false
            }
            edad++
        }
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