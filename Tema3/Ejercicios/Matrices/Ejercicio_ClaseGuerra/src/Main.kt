import kotlin.random.Random

const val NSOLDADOS= 100
const val MAXPOTENCIA = 10
const val MINPOTENCIA = 1
const val MAXRANDOM = 100



fun main() {

    var ejercito1 = Array(NSOLDADOS){Random.nextInt(MINPOTENCIA,MAXPOTENCIA+1)}
    var ejercito2 = Array(NSOLDADOS){Random.nextInt(MINPOTENCIA,MAXPOTENCIA+1)}

    var contadorPeleas= 0
    while(quedanSoldados(ejercito1) && quedanSoldados(ejercito2))
    {
        guerrear(ejercito1,ejercito2)
        contadorPeleas++
    }


    if(quedanSoldados(ejercito1))
    {
        println("Gano el ejercito 1")
    }
    else
    {
        println("Gano el ejercito 2")
    }

    println("El ejercito 1  resultante es")
    printEjercito(ejercito1)
    println("El ejercito 2 resultante es")
    printEjercito(ejercito2)

    println("Peleas: $contadorPeleas")
}

fun quedanSoldados(ej: Array<Int>):Boolean
{
    var quedan= false

    for(i in ej.indices)
    {
        if(ej[i]>=MINPOTENCIA)
        {
            quedan=true
        }
    }

    return quedan
}



fun guerrear(ej1:Array<Int>, ej2: Array<Int>)
{


    var posSol1 = devolverPosSOl(ej1)
    var posSol2 = devolverPosSOl(ej2)

    var soldado1= ej1[posSol1] + (MINPOTENCIA .. MAXRANDOM).random()
    var soldado2= ej2[posSol2] + (MINPOTENCIA .. MAXRANDOM).random()

    if(soldado1<soldado2)
    {
        ej1[posSol1]--
    }
    else if(soldado1>soldado2)
    {
        ej2[posSol2]--
    }
    else
    {
        var n = Random.nextBoolean()
        if(n)
        {
            ej1[posSol1]--
        }
        else
        {
            ej2[posSol2]--
        }
    }


}

fun devolverPosSOl(ej:Array<Int>):Int
{
    var pos= Random.nextInt(0, ej.size)
    var valor= ej[pos]
    while(valor==0)
    {
        pos++
        if(pos>=ej.size)
        {
            pos=0
        }
        valor= ej[pos]

    }

    return pos
}

fun printEjercito(ej: Array<Int>)
{
    for(i in ej.indices)
    {
        print("|${ej[i]}|")
    }
    println()
}