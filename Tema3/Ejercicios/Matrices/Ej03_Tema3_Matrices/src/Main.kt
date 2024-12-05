
const val N=5
const val M=3

fun main() {

    var matriz= Array(N){IntArray(M){(0..100).random()} }
    println(" hay ${imprimirPares(matriz)} pares en la matriz")

}


fun imprimirPares(m:Array<IntArray>):Int
{
    var contador= 0
    for(i in m.indices)
    {
        for(j in m[i].indices)
        {
            if(m[i][j]%2==0)
            {
               contador++
            }
        }
    }
    return contador
}

