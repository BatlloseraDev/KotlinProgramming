class Mosca {
    var fila=0
    var columna=0
    var estaViva=true

    fun volar (t:Tablero){
        fila = (0..< t.m.size).random()
        columna = (0..< t.m[0].size).random()
        t.m[fila][columna] = "X"
    }
    fun comprobarGolpe(posicion:Array<Int>, t:Tablero){
        if (posicion[0]==fila && posicion[1]==columna){
            println("Muerta :(((")
            estaViva = false
        }else if (esAdyacente(posicion)){
            println("Casi...me voy :)))")
            volar(t)
        }else{
            println("No me has dado...")
        }
    }
    fun esAdyacente(posicion:Array<Int>):Boolean{
        var esAdy = false
        var x=-1
        var y=-1
        var auxFila=0
        var auxColumna=0
        while (x <=1 && !esAdy){
            while(y <= 1 && !esAdy){
                auxFila = posicion[0] + x
                auxColumna = posicion[1] + y
                if((auxFila == fila) && (auxColumna == columna)){
                    esAdy = true
                }
                y++
            }
            y=-1
            x++
        }
        return esAdy
    }
}