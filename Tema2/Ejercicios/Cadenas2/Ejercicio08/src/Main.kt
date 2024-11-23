import kotlin.random.Random

fun main() {
    val TAMANIO = 3
    var matriz = rellenarMatrizCuadrada2(TAMANIO)
    dibujarMatriz(matriz)
    var columnas = sumarColumnasoFilas(matriz,true)
    var filas = sumarColumnasoFilas(matriz,false)
    dibujarVector(columnas)
    dibujarVector(filas)
}



fun dibujarVector(v:Array<Int>)
{
    println()
    for(i in v.indices)
    {
        print("${v[i]} ")
    }
}


fun sumarColumnasoFilas(m: Array<IntArray>, columna: Boolean): Array<Int>
{
    var vec= Array(m.size) {0}
    var sumatorio = 0

    for(i in vec.indices)
    {
        sumatorio = 0

        for(j in m.indices)
        {
            if(columna) sumatorio+= m[j][i]
            else sumatorio+= m[i][j]
        }
        vec[i] = sumatorio
    }
    return vec
}



fun dibujarMatriz(array: Array<IntArray>)
{

    for(x in array.indices)
    {
       for(y in array[x].indices)
       {
           print("${array[x][y]} ")
       }
        println()
    }
    /*
    var i= 0
    var j= 0
    while(i < array.size)
    {
        j= 0
        while (j<array[i].size)
        {
            print("${array[i][j]} ")
            j++
        }
        println()
        i++
    }*/

}

fun rellenarMatrizCuadrada2(tamanio : Int) :Array<IntArray>
{
    var m = Array(tamanio){IntArray(tamanio){0} }
    var i= 0
    var j =0


    while (j<m.size)
    {
        if(j>=m.size-1)
        {
            println("hola")
            i++
            j=0
        }
        m[i][j] = Random.nextInt(0,10)
        j++

    }


    return m
}


fun rellenarMatrizCuadrada(tamanio : Int) :Array<IntArray>
{
    var m = Array(tamanio){IntArray(tamanio){0} }
    var i= 0
    var j =0

    while(i<m.size)
    {
        j=0
        while (j<m.size)
        {
            m[i][j] = Random.nextInt(0,10)
            j++

        }
        i++
    }
    return m
}