import kotlin.random.Random

const val N=3
const val M=4

fun main() {

    var matriz1= Array(N){IntArray(M){ Random.nextInt(0,10) } }
    var matriz2= Array(N){IntArray(M){ Random.nextInt(0,10) } }
    var matriz3 = sumaDosMatrizes(matriz1,matriz2)

    imprimirMatiz(matriz3)
}

fun sumaDosMatrizes(m:Array<IntArray>,m2: Array<IntArray>):Array<IntArray>
{
    var m3= Array(N){IntArray(M){0} }

    for(i in m3.indices)
    {
        for(j in m3[i].indices)
        {
            m3[i][j] = m[i][j] + m2[i][j]
        }
    }


    return m3
}


fun imprimirMatiz(m: Array<IntArray>){

    for(i in m.indices)
    {
        for(j in m[i].indices)
        {
            print(" ${m[i][j]} ")
        }
        println()
    }

}