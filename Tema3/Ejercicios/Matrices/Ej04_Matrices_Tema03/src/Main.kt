const val N=4
const val M=5

fun main() {
    var tablero = Array<IntArray>(N){IntArray(M){0} }
    imprimirTablero(tablero)
}


fun imprimirTablero(m:Array<IntArray>)
{
    for(i in m.indices)
    {
        for(j in m[i].indices){
            print("|${m[i][j]}|")
        }
        println()
    }
}