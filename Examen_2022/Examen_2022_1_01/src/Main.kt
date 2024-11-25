import kotlin.random.Random

fun main() {

    var cola: Array<Int> = Array(30){0}
    var turno= 1

    rellenarCola(cola)
    printCola(cola)
    //rellenar cola
    while (turno<=25)
    {
        rellenarCola(cola)
        var nPersonas= Random.nextInt(1,4) // personas que se antienden en el turno
        println("Turno $turno")
        println("Cola esperando turno")
        printCola(cola)
        println("\t Personas atendidas en este turno: $nPersonas")
        avanzarCola(cola,nPersonas)
        println("\t Cola con los huecos generdos\n\t\t ")
        printCola(cola)
        turno++
    }


}

fun avanzarCola(v: Array<Int>, n:Int)
{

    var auxPersonas = Array(v.size){0}
    for(i in v.indices)
    {
        if(i+n>=v.size)
        {
            auxPersonas[i]= 0
        }
        else{
            auxPersonas[i]=v[i+n]
        }

    }
    for(i in v.indices){
        v[i]=auxPersonas[i]
    }
}


fun printCola(v: Array<Int>)
{
    for(i in v.indices)
    {
        print("[${v[i]}]")
    }
    println()
}


fun rellenarCola(v:Array<Int>){

    for(i in v.indices)
    {
        if(v[i]==0)
        v[i]= Random.nextInt(1,10)
    }
}