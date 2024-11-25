import kotlin.random.Random

fun main() {

    val TAMANIO= 5
    var tablero: Array<CharArray> = Array(TAMANIO){CharArray(TAMANIO){' '}}
    imprimirTablero(tablero)
    var turno= 0
    var puntuacion= Array(2){0}
    var continuar= true
    var letra = ' '
    var pos = Array(2){-1}
    while(continuar){

        //
        if(turno%2==0) letra='S'
        else letra = 'O'

        if(comprobarHuecos(tablero))
        {
            pos= EscribirEnPos(letra,tablero)//Maquina
            println("la maquina ha elegido esta posicion")
            imprimirTablero(tablero)
            if(letra=='S' && comprobarPunto(pos,tablero))
            {
                puntuacion[0] += 1
                println("¡la consola ha conseguido un punto!\npuntos hasta el momento: ${puntuacion[0]}")
            }

        }
        else{
            continuar=false
        }

        //comprobar

        if(comprobarHuecos(tablero))
        {
            pos= EscribirEnPos(letra,tablero,"Elige posicion para la letra $letra en")//jugador
            println("has elegido esta posicion")
            imprimirTablero(tablero)
            if(letra=='S' && comprobarPunto(pos,tablero))
            {
                puntuacion[0] += 1
                println("¡Has conseguido un punto!\npuntos hasta el momento: ${puntuacion[0]}")
            }
        }
        else{
            continuar=false

        }



        turno++
    }



}

fun comprobarHuecos(m:Array<CharArray>):Boolean
{
    var hueco = false
    for(i in m.indices)
    {
        for(j in m[i].indices)
        {
            if(m[i][j]==' ')
                hueco=true
        }
    }
    return hueco
}


fun comprobarPunto(ar:Array<Int>, m: Array<CharArray>):Boolean
{
    var punto=false
   if(ar[0]>0 && ar[0]<m.size-1  && ar[1]>0  && ar[1]<m.size-1 )
   {
       if(m[ar[0]-1][ar[1]-1]=='O' && m[ar[0]+1][ar[1]+1]=='O'){
           punto=true
       }
       else if(m[ar[0]-1][ar[1]+1]=='O' && m[ar[0]+1][ar[1]-1]=='O')
       {
           punto=true
       }
   }
    return punto
}



fun EscribirEnPos(letra:Char, m:Array<CharArray>):Array<Int>
{

    var continuar= true
    var arr = Array(2){-1}
    while(continuar)
    {
        var x = Random.nextInt(0,m.size)
        var y= Random.nextInt(0,m.size)
        if(m[x][y]==' '){
            m[x][y]=letra
            arr[0]=x
            arr[1]=y
            continuar=false
        }

    }
return arr
}


fun EscribirEnPos(letra:Char, m:Array<CharArray>,texto:String):Array<Int>
{
    var arr= Array(2){-1}
    var contador= 0
    var salir = false
    while(!salir)
    {
        if(contador==0) println(texto+" x" )
        else println(texto+" y")
        var n= readln()?.toIntOrNull()?:-1
        if(n>=0 &&n<m.size){
            arr[contador]= n
            contador++
        }else println("Posicion erronea")

        if(contador==2){
            if(m[arr[0]][arr[1]]!=' '){
                println("Posicion ya escrita, error, vuelve a intentarlo")
                contador=0
            }
            else{
                salir=true
            }
        }
    }

    m[arr[0]][arr[1]]= letra

    return arr
}




fun imprimirTablero(m:Array<CharArray>){
    for(i in m.indices){
        for(j in m[i].indices){
            print("[${m[i][j]}]")
        }
        println()
    }


}


