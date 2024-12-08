import kotlin.math.abs


const val DIMENSION= 8
const val TOASCII= 96

fun main() {


    var tablero = Array(DIMENSION){Array(DIMENSION){"  "}}
    printMatriz(tablero)
    var letraFig = elegirFigura("Elige la figura que vas a utilizar\n" +
            "(1) Para torre\n" +
            "(2) Para Alfil\n" +
            "(3) Para Dama\n" +
            "(4) Para caballo")
    var pos = elegirPosicion("Elige la posicion (numero) para fila (letra) para columna")
    tablero[pos[0]][pos[1]] = "${letraFig} "
    printMatriz(tablero)
    interpretarMovimientos(pos, letraFig,tablero)
    println()
    printMatriz(tablero)
}

fun interpretarMovimientos(pos:IntArray, fig: Char, m:Array<Array<String>>)
{
    when(fig)
    {
        'T'->
            {
                moverEnLinea(pos,m,1,0, fig)
                moverEnLinea(pos,m,-1,0, fig)
                moverEnLinea(pos,m,0,1, fig)
                moverEnLinea(pos,m,0,-1, fig)

            }
        'A'->
            {
                moverEnLinea(pos,m, 1,1, fig)
                moverEnLinea(pos,m, 1,-1, fig)
                moverEnLinea(pos,m, -1,1, fig)
                moverEnLinea(pos,m, -1,-1, fig)
            }
        'D'->
            {
                moverEnLinea(pos,m,1,0, fig)
                moverEnLinea(pos,m,-1,0, fig)
                moverEnLinea(pos,m,0,1, fig)
                moverEnLinea(pos,m,0,-1, fig)
                moverEnLinea(pos,m, 1,1, fig)
                moverEnLinea(pos,m, 1,-1, fig)
                moverEnLinea(pos,m, -1,1, fig)
                moverEnLinea(pos,m, -1,-1, fig)}
        'C'->
            {
                moverCaballo(pos,m)
            }
        else-> println("No debería de llegar aquí")
    }
}



fun moverCaballo(pos:IntArray, m: Array<Array<String>>)
{
    val x= pos[0]
    val y= pos[0]

    for(i in 0 until DIMENSION)
    {
        for(j in 0 until DIMENSION )
        {
            val deltaX= abs(i-x)
            val deltaY= abs(j- y)

            if(deltaX+deltaY == 3 && deltaX!=0 && deltaY!=0)
            {
                if(m[i][j]== "  ")
                {
                    m[i][j]= "x "
                }
            }
        }
    }
}




fun moverEnLinea(pos:IntArray, m: Array<Array<String>>, deltaX:Int, deltaY:Int, fig: Char)
{
    var x= pos[0]
    var y= pos[1]
    var salir= false
    while(x in 0 until DIMENSION && y in 0 until DIMENSION && !salir)
    {
        x+=deltaX
        y+=deltaY
        if(x !in 0 until DIMENSION || y !in 0 until DIMENSION)
        {
            salir=true
        }
        else
        {
            if(m[x][y] == "  ")
            {
                m[x][y] = "x "
            }
            else if(m[x][y]!= "$fig ")
            {
                salir= true
            }
        }
    }
}

fun elegirPosicion(texto: String):IntArray
{
    var pos= IntArray(2){-1}
    while(pos[0]<0 || pos[0]>= DIMENSION)
    {
        println(texto+" [INSERTA FILA]")
        pos[0]= readln().toIntOrNull()?:-1

    }
    pos[0]= DIMENSION-pos[0]
    while(pos[1]<0 || pos[1]>=DIMENSION)
    {
        println(texto+" [INSETA COLUMNA]")
        pos[1]= devolverNum(readln().lowercase()[0])-1
    }
    return pos
}



fun elegirFigura(texto: String):Char
{

    var figuraElegida=-1 //1 para torre 2 para alfil 3 para dama 4 para caballo
    var figura=' '
    while(figuraElegida<=0||figuraElegida>=5)
    {
        println(texto)
        figuraElegida= readln().toIntOrNull()?:-1
        when(figuraElegida)
        {
            1-> figura= 'T'
            2-> figura='A'
            3-> figura = 'D'
            4-> figura = 'C'
            else -> println("numero incorrecto")
        }
    }

    return figura
}




fun printMatriz(m: Array<Array<String>>){
    for(i in m.indices)
    {
        for(j in m[i].indices)
        {
            if(j== 0)
            {
                print("${DIMENSION-i}")
            }
            print("|${m[i][j]}|")
        }
        println()
    }

    print(" ")

    for( i in 1..DIMENSION)
    {

        print("|${devolverLetra(i)} |")

    }
    println()
}


fun devolverLetra(num:Int):Char
{
    var letra= ' '
    var numero = num+TOASCII
    letra = numero.toChar()
    return letra
}
fun devolverNum(letra:Char):Int
{
    var num= letra.code
    num -= TOASCII

    return num
}
