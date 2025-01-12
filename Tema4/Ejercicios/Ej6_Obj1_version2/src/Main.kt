import kotlin.random.Random

val MAXTIME= 300 //5mins
val MAXNUEVASSERPIENTES = 3
fun main() {

    var nido= Nido()
    var segundos=0

    while (segundos<MAXTIME)
    {
        segundos++
        println("Segundo $segundos pasa lo siguiente: ")

        if(segundos%5 ==0)
        {
            var nuevasSerpientes = Random.nextInt(1,MAXNUEVASSERPIENTES)
            nido.addSerpientes(nuevasSerpientes)
            println("Han nacido $nuevasSerpientes nueva/s serpiente/s")
        }
        if(segundos%10 == 0)
        {
            nido.mangostaAtaca()
        }

        nido.vivirUnSegundo()

        println("$nido\n")
    }
}