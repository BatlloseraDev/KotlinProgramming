import kotlin.random.Random

const val N=4
const val M=5



fun main() {
    var parejas= Array((N*M)/2){0} //2 que estan puestas las parejas, 3 las parejas ya estan encontradas
    var tablero = Array(N){IntArray(M){generarParejas(parejas)}}
    var contador =0
    while(parejasPorEncontrar(parejas))
    {
        var valores= Array(2){0}
        var pos1 = Array(2){-1}
        var pos2 = Array(2){-1}
        println("Este es el tablero hasta el momento\n")
        imprimirTablero(tablero,parejas)

        //seleccionar pos que quiere mirar
        pos1= pedirPos("Ingresa la posicion que quieres comprobar la carta", tablero, parejas)
        imprimirCartas(tablero,pos1,pos2,parejas)
        //Imprimir pos
        //Guardar valor
        valores[0]= tablero[pos1[0]][pos1[1]]
        //Seleccionar segundo
        pos2= pedirPos("Ingresa la posicion que quieres comprobar la carta", tablero, parejas)
        //Imprimir pos
        imprimirCartas(tablero,pos1,pos2, parejas)
        //Guardar valor
        valores[1] = tablero[pos2[0]][pos2[1]]

        checkIguales(valores,parejas)


        contador++
    }

    println("Felicidades lo has completado en $contador turnos ")
    //imprimirTablero(tablero)
}

fun checkIguales(valores: Array<Int>, parejas: Array<Int>)
{
    if(valores[0]==valores[1])
    {
        println("¡Has acertado una pareja!")
        for(i in parejas.indices)
        {
            if(i==(valores[0]-1))
            {
                parejas[i]+=1
            }
        }
    }
    else
    {
        println("no has acertado nada")
    }
}

fun pedirPos(texto: String, m:Array<IntArray>,parejas: Array<Int>): Array<Int>
{
    var posicion= Array(2){0}
    var contador= 0
    while(contador<2)
    {
        if(contador==0) println(texto + " para la fila")
        else println(texto + " para la columna")

        posicion[contador] = readln().toIntOrNull()?:-1

        if(contador== 0 &&( posicion[contador]<0 || posicion[contador]>= m.size))
        {
            println("Error en la poscion fila seleccionada vuelvelo a intentar")
        }
        else if (contador== 1 &&( posicion[contador]<0 || posicion[contador]>= m[posicion[0]].size))
        {
            println("Error en la poscion columna seleccionada vuelvelo a intentar")
        }
        else
        {
            if(contador==1)
            {
                if(parejas[(m[posicion[0]][posicion[1]]-1)]==3) println("Posicion ya descubierta vuelvelo a intentar")
                else
                {
                    contador++
                }
            }
            else contador++
        }

    }

    return posicion
}



fun parejasPorEncontrar(arrParejas: Array<Int>):Boolean
{
    var seguirJugando = false
    for(i in arrParejas){
        if(i!=3) seguirJugando= true
    }
    return seguirJugando
}

fun generarParejas(parejas: Array<Int>):Int{

    var buscarPareja= true
    var devolverNum=0
    while(buscarPareja)
    {
        var pos = Random.nextInt(0 ,parejas.size)
        if(parejas[pos]!=2)
        {
            devolverNum= (pos+1)
            parejas[pos]+= 1
            buscarPareja=false
        }
    }

    return devolverNum
}


fun imprimirTablero(m:Array<IntArray>, parejas:Array<Int>) //para saber las pos
{
    for(i in m.indices)
    {
        for(j in m[i].indices){

            if(parejas[(m[i][j]-1)]==3)
            {
                print("|${m[i][j]}|")
            }
            else
            {
                print("|0|")
            }

        }
        println()
    }
}


/*fun imprimirTablero(m:Array<IntArray>) //para saber las pos
{
    for(i in m.indices)
    {
        for(j in m[i].indices){

            print("|${m[i][j]}|")
        }
        println()
    }
}*/

fun imprimirCartas(m:Array<IntArray>, pos:Array<Int>, pos2:Array<Int>, parejas: Array<Int>)//devolver las cartas selecionadas
{
    for(i in m.indices)
    {
        for(j in m[i].indices){

            if(pos[0]!=-1 && pos2[0]==-1)
            {
                if(i==pos[0] && j==pos[1])print("|${m[i][j]}|")
                else {
                    if(parejas[(m[i][j]-1)]==3)
                    {
                        print("|${m[i][j]}|")
                    }
                    else
                    {
                        print("|0|")
                    }
                }
            }
            else if(pos[0]!=-1 && pos2[0]!=-1)
            {
                if(i==pos[0] && j==pos[1])print("|${m[i][j]}|")
                else if(i==pos2[0] && j==pos2[1])print("|${m[i][j]}|")
                else
                {
                    if(parejas[(m[i][j]-1)]==3)
                    {
                        print("|${m[i][j]}|")
                    }
                    else
                    {
                        print("|0|")
                    }
                }
            }
        }
        println()
    }
}

