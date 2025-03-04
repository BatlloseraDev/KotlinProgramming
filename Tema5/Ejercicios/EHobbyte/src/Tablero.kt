import kotlin.random.Random

class Tablero {

    var longitud= 20
    var quests= ArrayList<Quest>()

    companion object
    {

    }

    constructor()
    {
    }

    constructor(longitud: Int)
    {
        this.longitud= longitud
    }


    fun addQuest(q:Quest)
    {
        quests.add(q)
    }

    fun mostrarTablero()
    {
        for(i in quests.indices)
        {
            if(quests[i].completada)
            {
                print("|x|")
            }
            else
            {
                print("|${i+1}|")
            }

        }
        println()
    }
    fun pelear(n:Int, p:ArrayList<Personaje>):Boolean
    {
        println(quests[n])
        var prueba= quests[n]
        var tipoPrueba= prueba.tipoPrueba
        var personaje: Personaje?=null
        var pasada=false
        for(per in p){
            if(per.tipo == tipoPrueba &&per.capacidad!=0) //compruebo de que el personaje que hay aun le queda capacidad
            {
                personaje=per
            }
        }
        if(personaje!=null)//compruebo si he conseguido coger personaje
        {
            //empiezo las probabilidades
            var prob= Random.nextFloat()
            if(personaje.capacidad>prueba.esfuerzo) //mas capacidad que esfuerzo
            {
                if(prob<=Constantes.PROBMAYORCAPACIDAD)
                {
                    personaje.perderCapacidad(prueba.esfuerzo)
                    pasada=true
                }
                else
                {
                    personaje.incapacitar()

                }
            }
            else if(personaje.capacidad==prueba.esfuerzo) //igualados
            {
                if(prob<=Constantes.PROBIGUALCAPACIDAD)
                {
                    personaje.perderCapacidad(prueba.esfuerzo)
                    pasada=true
                }
                else
                {
                    personaje.incapacitar()
                }
            }
            else //menor
            {
                if(prob<=Constantes.PROBMENORCAPACIDAD)
                {
                    personaje.perderCapacidad(prueba.esfuerzo)
                    pasada=true
                }
                else{
                    personaje.incapacitar()
                }
            }
            personaje.addQuest(prueba)
            if(pasada)
            {
                println("El personaje ${personaje.nombre} pasó la prueba de numero ${n+1} dejandolo con una capacidad de ${personaje.capacidad}")

            }
            else{
                println("El personaje ${personaje.nombre} no pasó la prueba: ${n+1}, dejandolo incapacitado")
            }
        }
        else
        {
            println("Ningún personaje pudo hacer la prueba por lo que automaticamente fue perdida.")
        }
        return pasada
    }

    fun pruebaPasada(n:Int)
    {
        quests[n].completar()
    }

    fun comprobarMisiones():Boolean
    {
        var contador= 0
        var completado= false
        for(q in quests)
        {
            if(q.completada)
            {
                contador++
            }
        }
        if(contador>=(quests.size/2))
        {
            completado=true
        }
        return completado
    }

    fun checkMisionTapada(n:Int):Boolean
    {
        return quests[n].completada
    }

}