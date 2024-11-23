class Jugador {
    var nombre:String = ""
    var intentos:Int=0
    var posicion:Array<Int> =Array(2){-1}
    var fila:Int=0
    var columna:Int=0

    constructor(n:String){
        this.nombre = n
    }

    fun elegirPosicion(){
        var f:Int?=0
        var c:Int?=0
        do{
            println("Dame la Fila:")
            f = readln().toIntOrNull()
        }while(f ==null || f<=0 || f>fila)
        posicion[0] =f-1
        do{
            println("Dame la Columna:")
            c = readln().toIntOrNull()
        }while(c ==null || c<=0 || c>columna)
        posicion[1] =c-1
    }
    fun pedirTamanioTablero(){
        var f:Int?=0
        var c:Int?=0
        do{
            println("Dame el número de Filas:")
            f = readln().toIntOrNull()
        }while(f ==null || f<0)
        fila =f
        do{
            println("Dame el numero de Columna:")
            c = readln().toIntOrNull()
        }while(c ==null || c<0)
        columna =c
    }
    fun pedirIntentos(){
        var i:Int?=0
        do{
            println("Dame el número de Intentos:")
            i = readln().toIntOrNull()
        }while(i ==null || i<0)
        intentos =i

    }
}









