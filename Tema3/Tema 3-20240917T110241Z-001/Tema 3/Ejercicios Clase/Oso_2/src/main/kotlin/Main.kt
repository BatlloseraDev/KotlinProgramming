fun main(args: Array<String>) {
    val N=5
    var p=0
    val TURNOS = N*N
    var contadorTurnos = 1
    var m= Array(N){Array(N){"_"}}
    var puntuacionPC=0
    var puntuacionHU=0
    imprimirTablero(m)
    var posiciones=Array(2){0}
    do {
        do {
            posiciones = pedirPosicion(m.size)
        }while(comprobarPosicion(m,posiciones))
        m[posiciones[0]][posiciones[1]]= pedirLetra() //m[1][1]--> posiciones[0]
        contadorTurnos++
        imprimirTablero(m)
        p = puntuacion(m,posiciones[0],posiciones[1])
        puntuacionHU = puntuacionHU + p
        println(" Ronda: $contadorTurnos Puntuacion: $p Total: $puntuacionHU")

        if (contadorTurnos<TURNOS) {
            do {
                posiciones = pedirPosicionPC(m.size)
            }while(comprobarPosicion(m,posiciones))
            m[posiciones[0]][posiciones[1]]= "OS".random().toString()
            contadorTurnos++
            imprimirTablero(m)
            p = puntuacion(m,posiciones[0],posiciones[1])
            puntuacionPC = puntuacionPC + p
            println(" Ronda: $contadorTurnos Puntuacion: $p Total: $puntuacionPC")

        }

    }while(contadorTurnos<=TURNOS)
}
fun pedirPosicionPC(tamanio:Int):Array<Int>{
    var posiciones=Array(2){0}
    posiciones[0]=(0..<tamanio).random()
    posiciones[1]=(0..<tamanio).random()
    return posiciones
}
fun movimientoPC(m:Array<Array<String>>){
    var f:Int =0
    var c: Int = 0
    var l:String=""
    do {
        f= m.indices.random()
        c=(0..<m.size).random()
        l= "OS".random().toString()
    }while(m[f][c]!="_")
    m[f][c]=l
    puntuacion(m,f,c);
}
fun pedirLetra():String{
    var l:String=""
    do {
        print("Dame la letra (O / S): ")
        l = readln().uppercase()
    } while (!(l=="O" || l=="S")) // (l!="O" && l!="S")
   return l
}
fun puntuacion (m:Array<Array<String>>, f:Int, c:Int):Int{
    var contar=0
    if (m[f][c]=="S"){
        var auxF = f-1
        var auxC = c-1
        var auxF1 = f+1
        var auxC1 = c+1
        if (auxF>=0 && auxC>=0 && auxF1< m.size && auxC1 < m.size ){
            if (m[auxF][auxC]=="O" && m[f+1][c+1]=="O") contar++
        }
        auxF = f+1
        auxC = c-1
        auxF1 = f-1
        auxC1 = c+1
        if (auxF<m.size && auxC>=0 && auxF1>=0 && auxC1 < m.size ) {
            if (m[f + 1][c - 1] == "O" && m[f - 1][c + 1] == "O") contar ++
        }
    }
    return contar
}
fun imprimirTablero(m:Array<Array<String>>){
    print("   ")
    for (i in 1..m.size){
        print(" $i ")
    }
    println()
    var n=1
    for (i in m){
        print(" $n ")
        for (j in i){
            print("[$j]")
        }
        n++
        println()
    }
}
fun comprobarPosicion(m:Array<Array<String>>, p:Array<Int>):Boolean{
    return m[p[0]][p[1]]!="_"
}
fun pedirPosicion(tamanio:Int):Array<Int>{
    var f:Int? =0
    var c: Int? = 0
    var posiciones=Array(2){0}
    do {
        print("Dime la Fila: ")
        f = readln().toIntOrNull()
    } while (f == null || f !in 1..tamanio)
    posiciones[0]=f-1
    do {
        print("Dime la Columna: ")
        c = readln().toIntOrNull()
    } while (c == null || c < 1 || c > tamanio)
    posiciones[1]=c-1
    return posiciones
}