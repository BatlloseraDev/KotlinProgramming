fun main(args: Array<String>) {
    var horas:Int =0
    var esDomingo: Boolean
    var turno:Int =0
    do{
        horas = pedirHoras()
        esDomingo = esDomingo()
        turno = pedirTurno()
        println("Tu salario es : ${calcularSalario(horas,esDomingo,turno)}")

    }while (seguir())
}
fun seguir():Boolean{
    println("Quieres calcular más:")
    println("1.- Seguir calculando")
    println("2.- Salir")
    var seguir=true
    var n= readln().toInt()
    if (n!= 1){
        seguir = false
    }
    return seguir
}
fun calcularSalario(h:Int,d:Boolean,t:Int):Int{
    var salario=0
    //
    return salario
}
fun pedirTurno():Int{
    println("si es diurno escribe 1, cualquier otra cosa no es nocturno")
    var d= readln().toInt()
    var respuesta:Int = 2
    if (d == 1){
        respuesta = 1
    }
    return respuesta
}
fun esDomingo():Boolean{
    println("si es domingo escribe 1, cualquier otra cosa no es domingo")
    var d= readln().toInt()
    var respuesta:Boolean = false
    if (d == 1){
        respuesta = true
    }//else{
       // respuesta = false
    //}
    return respuesta
}

fun pedirHoras():Int{
    println("Dame las Horas")
    // var h= readln().toInt()
    // return h
    return (readln().toInt())

}