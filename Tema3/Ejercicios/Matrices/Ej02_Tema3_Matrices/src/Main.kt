const val N=5
const val M=3

fun main() {


    var matriz= Array(N){IntArray(M){(0..10).random()} }
    var num= (0..10).random()
    var pos= ocurrenciaMatriz(matriz,num)
    if(pos[0]!= -1)
    {
        println("Ha ocurrido una ocurrencia en la posicion de la matriz x=${pos[0]} e y=${pos[1]}")
    }

}


fun ocurrenciaMatriz(m:Array<IntArray>,n:Int): Array<Int>
{
    var p= Array(2){-1}
    for(i in m.indices)
    {
        for(j in m[i].indices)
        {
            if(m[i][j]== n && p[0]==-1)
            {
                p[0]= i
                p[1]= j
            }
        }
    }

    return  p
}