import kotlin.random.Random

fun main() {

    var matriz : Array<IntArray> = Array(5){
        intArrayOf(1,2,3,5,6) ;
        intArrayOf(1,2,3,5,6);
        intArrayOf(1,2,3,5,6);
        intArrayOf(1,2,3,5,6);
        intArrayOf(1,2,3,5,6);


    }
    var matriz2: Array<IntArray> = Array(5){ IntArray(5){ Random.nextInt(1,10) } }
    //ImprimirMatriz(matriz)
    ImprimirMatriz(matriz2)

     adyacente(matriz2,2,2,1)
    //adyacente(matriz,1,1)
}

fun adyacente(m:Array<IntArray>, x:Int,y:Int, nivelAdyacente:Int)
{

    var i = -nivelAdyacente
    var j = -nivelAdyacente
    var xCasilla= 0
    var yCasilla=0
    while (i<=nivelAdyacente)
    {
        j=-nivelAdyacente
        while (j<=nivelAdyacente)
        {
            if(Math.abs(i)+Math.abs(j) ==2 ) {


                xCasilla = i + x
                yCasilla = j + y


                //Comprobar restricciones
                if (i == 0 && j == 0 && xCasilla < m.size && xCasilla >= 0 && yCasilla < m.size && yCasilla >= 0) {
                    print("  ")
                } else if (xCasilla < 0 || yCasilla < 0 || xCasilla > m.size - 1 || yCasilla > m.size - 1) {
                    print("x ")
                } else {
                    print("${m[xCasilla][yCasilla]} ")
                }
            }else{
                print("  ")
            }
            j++
        }
        println()
        i++
    }


}



fun ImprimirMatriz(m:Array<IntArray>)
{
    for(i in m.indices)
    {
        for(j in m[i].indices)
        {
            print("${m[i][j]} ")
        }
        println()
    }
}