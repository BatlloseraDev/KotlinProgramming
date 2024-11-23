import kotlin.random.Random
const val MOSCA=1
fun main() {

    var tablero= inicializarTablero(5)
    var seguir= true
    var intento = 0
    var maxIntentos=10
    var ganar = false
    while (seguir && intento<maxIntentos)
    {
        //imprimo tablero
        imprimirTablero(tablero)
        //Pedir posicion
        var posTry = pedirCasilla(tablero.size, "Dame la posicion")
        if(checkTablero(tablero,posTry)==1){
            println("Felidiciades has matado a la mosca")
            ganar=true
            seguir=false
        }
        else{
            if(checkAdyacentes(tablero,posTry))
            {
                CambiarPos(tablero)
                println("Cambio de sitio")
            }
            else{
                println("No paso nada")
            }

        }
        intento++
    }
    if(ganar) println("Felicidades has ganado")
    else println("Has perdido ")
}

fun CambiarPos(t:Array<IntArray>)
{
    var sitioNuevo= false
    var x = -1
    var y =- 1
    while (!sitioNuevo){
         x = Random.nextInt(0,t.size)
         y = Random.nextInt(0,t.size)
        if(t[x][y]!=1){
            sitioNuevo= true
        }
    }

    for(i in t.indices)
    {
      for(j in t[i].indices)
      {
          if(i==x && j==y)
          {
              t[x][y]= 1
          }
          else
          {
              t[i][j]=0
          }
      }
    }
}

fun checkAdyacentes(tablero: Array<IntArray>, pos: Array<Int>):Boolean
{
    var adyacente = false
    var xCasilla = 0
    var yCasilla = 0
    for(i in -1 .. 1)
    {
        for(j in -1 .. 1)
        {
            xCasilla= pos[0]+i
            yCasilla = pos[1]+j
            if(xCasilla>=0 && xCasilla<tablero.size && yCasilla>=0 && yCasilla<tablero.size)
            {
                if(tablero[xCasilla][yCasilla]==1) adyacente=true
            }
        }
    }
    return adyacente
}

fun checkTablero(tablero: Array<IntArray>,x:Array<Int>): Int
{
    var valorPos= -1
    for (i in tablero.indices)
    {
        for(j in tablero[i].indices){

           if(i==x[0] && j==x[1])
           {
              print("${tablero[i][j]} ")
               valorPos= tablero[i][j]
           }
           else if(tablero[i][j]==1){
               print("1 ")//para comprobar
           }
           else print("x ")
        }
        println()
    }
    return valorPos
}

fun imprimirTablero(tablero: Array<IntArray>)
{
    for (i in tablero.indices)
    {
        for(j in tablero[i].indices){
            print("x ")
        }
        println()
    }
}

fun pedirCasilla(tamanio: Int, texto: String):Array<Int>
{
    var arr= Array(2){-1}
    var contador = 0
    while(contador<arr.size)
    {
        if(contador==0) println(texto+" x")
        else println(texto+" y")
        var placeholder = readln()?.toIntOrNull() ?: -1 // expresion elvis
        if(placeholder>=0 && placeholder<tamanio)
        {
            arr[contador]=placeholder
            contador++
        }
        else{
            println("Posicion erronea")
        }

    }


    return arr
}

fun inicializarTablero(tamanio: Int): Array<IntArray>
{
    var m: Array<IntArray> = Array(tamanio){ IntArray(tamanio){0} }
    var x = Random.nextInt(0,tamanio)
    var y = Random.nextInt(0,tamanio)
    m[x][y]=MOSCA

    return m
}