import kotlin.concurrent.thread
import kotlin.random.Random

val MAXTIME = 300
val MAXNUEVASSERPIENTES= 10

fun main() {

    var startTime = System.currentTimeMillis()

    update(startTime, MAXTIME.toLong())

}

fun update(startTime: Long, tMax: Long)
{
    var seguir= true
    var segundos:Long= 0
    var segAux:Int = 0

    var nido= Nido()

    while (seguir)
    {
        segundos= (calculoTiempo(startTime,System.currentTimeMillis())/1000)

        if(segAux!=segundos.toInt()) //aqui se puede realizar las acciones que queramos que ocurran cada segundo de nuestro sistema
        {
            //println(segundos)
            segAux++
            println("Segundo $segundos pasa lo siguiente: ")

            if(segAux%5 ==0)
            {
                var nuevasSerpientes = Random.nextInt(1,MAXNUEVASSERPIENTES)
                nido.addSerpientes(nuevasSerpientes)
                println("Han nacido $nuevasSerpientes nueva/s serpiente/s")
            }
            if(segAux%10 == 0)
            {
                nido.mangostaAtaca()
            }

            nido.vivirUnSegundo()

            println("$nido\n")


        }//la desventaja es que si tenemos codigo muy pesado no se actualizara cada segundo y puede que pasen 2 segundos entre iteracion

        if(segundos>=tMax)//aux para poder salir del bucle infinito.
        {
            seguir=false
        }

    }
}

fun calculoTiempo(tInicio:Long, tFinal:Long): Long
{

    return tFinal-tInicio
}