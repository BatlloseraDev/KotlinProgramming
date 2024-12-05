import kotlin.random.Random

const val NSOLDADOS= 100
const val MAXPOTENCIA = 10
const val MINPOTENCIA = 1
const val MAXRANDOM = 100
const val CAMPO = 5
const val POSVACIO= 0



fun main() {

    var ejercito1 = crearSoldados()
    var ejercito2 = crearSoldados()
    var contadorPeleas= 0

    var campoBatalla = Array(CAMPO){IntArray(CAMPO){POSVACIO} }

    printCampo(campoBatalla)

    println(ejercito1[1][0])

/*
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

    println("Peleas: $contadorPeleas")*/
}

fun crearSoldados(): Array<IntArray>
{
    var m = Array(3){IntArray(NSOLDADOS){-1} }

    for(i in m[0].indices){
        m[0][i]= Random.nextInt(MINPOTENCIA,MAXPOTENCIA+1)
    }


    return m

}





fun printCampo(m:Array<IntArray>){

    for (i in m.indices)
    {
        for (j in m[i].indices)
        {
            print("|${m[i][j]}|")
        }
        println()
    }

}




fun quedanSoldados(ej: Array<Int>):Boolean
{
    var quedan= false

    for(i in ej.indices)
    {
        if(ej[i]!=0)
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

fun printEjercito(ej: Array<IntArray>)
{
    for(i in ej[0].indices)
    {
        print("|${ej[0][i]}|")
    }
    println()
}