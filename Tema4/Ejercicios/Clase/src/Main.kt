fun main()
{
    //var miata= Coche(4, "1990AA", 120, 500)
 /*   val persona = Persona("Juan",30)
    println(persona.toString())
    println(persona)*/
   /* var seguir= true


    var diaActual=DiaSemana.MIERCOLES

    val DIASSEMANA= DiaSemana.values()
    for(dia in DIASSEMANA)
    {
        println("Día: $dia")
    }

    when(diaActual)
    {
        DiaSemana.LUNES-> println("Es lunes animo")
        DiaSemana.VIERNES-> println("Es viernes, no te emborraches")
        else-> println("Es un dia cualquiera")
    }

    while (seguir)
    {
        println("¿Que quieres hacer?\n" +
                "1.Pasar dia\n" +
                "2.Salir")
        var accion= readln().toInt()
        when(accion)
        {
            1-> {
                println(DIASSEMANA.indexOf(diaActual))
                var diaNum = DIASSEMANA.indexOf(diaActual)
                diaNum++
                if(diaNum>=DIASSEMANA.size)
                {
                    diaNum=0
                }
                diaActual = DIASSEMANA[diaNum]

                println("Ha pasado un dia ahora es ${diaActual}")
            }
            2->{
                println("Saliendo")
                seguir= false
            }
            else-> println("error, accion no valida")
        }
    }*/


}

enum class DiaSemana{
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO
}


/*
class Circulo()
{

    var centro:Punto = Punto(0,0)
    var radio:Int= 0

    fun superficie():Float
    {
        return (3.14*radio*radio).toFloat()
    }
}*/


class Persona(val nombre:String, val edad:Int)
{
    override fun toString():String
    {
        return "Nombre: $nombre, Edad:$edad"
    }
}

class Circulo
{
    var centro: Punto
    var radio:Int
    constructor(centro:Punto,radio:Int)
    {
        this.centro=centro
        this.radio=radio
    }
    fun elMayor(c:Circulo):Circulo
    {
        if(radio>c.radio) return this
        else return c
    }
}


class Person(var name:String, var age:Int)
{
    constructor(name:String):this(name,0)
    {

    }
}
/*

class Coche
{
    var numRuedas:Int = 0
    var matricula:String = "abc000"
    var velocidadMax:Int = 0
    var peso:Int = 0
    constructor()
    {
        this.numRuedas = 0
        this.matricula= "000aaa"
        this.velocidadMax = 0
        this.peso = 0
    }
    constructor(numeroRuedas:Int, matr:String)
    {
        numRuedas=numeroRuedas
        matricula=matr
    }
    constructor(numeroRuedas: Int, matricula: String, vMax:Int,peso:Int)
    {
        numRuedas=numeroRuedas
        this.matricula=matricula
        velocidadMax = vMax
        this.peso= peso
    }
}
*/






class Punto
{
    var x:Int
    var y:Int
    companion object
    {
        var numPuntos:Int = 0
    }
    constructor(a:Int, b:Int)
    {
        x=a
        y=b
        numPuntos++
    }

    fun getNumPuntos():Int
    {
        return numPuntos;
    }
}


/*class Punto
{
    var x:Int
    var y:Int
    constructor(a:Int, b:Int)
    {
        x=a
        y=b
    }

}*/
/*
class Punto()
{
    var x:Int = 0
    var y:Int = 0


}*/
