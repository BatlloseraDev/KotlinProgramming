import kotlin.random.Random
import kotlin.random.nextInt

const val N =3
const val M=3
const val MAX= 10

fun main() {

    var matrix = Array(N){IntArray(M){Random.nextInt(0.. MAX+1)} }
    var valores= IntArray(3){0}
    calcularValores(matrix, valores)

    imprimirMatriz(matrix)

    for(i in valores.indices)
    {
        println("El valor para el caso ${i+1} es ${valores[i]}")
    }
}

fun imprimirMatriz(m: Array<IntArray>)
{
    for(i in m.indices)
    {
        for(j in m[i].indices)
        {
            print("[${m[i][j]}]")
        }
        println()
    }
    println()
}



fun calcularValores(m: Array<IntArray>, v:IntArray)
{
    var min = m[0][0]
    var max = m[0][0]
    var media = m[0][0]

    for(i in m.indices)
    {
        for(j in m[i].indices)
        {
            if(m[i][j]<min)
            {
                min= m[i][j]
            }
            if(m[i][j]>max)
            {
                max=m[i][j]
            }
            media+=m[i][j]
        }

    }

    v[0]= min
    v[1]= max
    v[2]= (media/(N*M))
}