import kotlin.random.Random


/*
.- Crear varias funciones de conversión. La primera realizará el módulo de dos variables enteras
 y devuelva un tipo lógico, verdadero si el primer número es divisible por el segundo y falso, al
  contrario, si no es divisible, la función se debe llamar divisible. Otra función deberá devolver
  un número aleatorio, los argumentos de entrada serán el valor máximo y el valor mínimo de
  los cuales debe sacar el numero aleatorio, el valor mínimo no esta incluido en la selección
   y el máximo si estaría incluido en la selección, esta función se llamará aleatorio.
    Una tercera función donde se le pasen dos números y sea capaz de contar desde el
     menor al mayor, esta función se llamará contar.
     El programa main generará dos números aleatorios entre 1 y 100, y después
     deberá comprobar si el primero es divisible por el segundo. Estos dos números
      se utilizarán para la función contar. El programa main debe de utilizar de forma coherente las funciones anteriores.
 */


fun main(args: Array<String>) {
    var a = aleatorio(0,100)
    var b = aleatorio(0,100)

    if (divisible(a,b)){
        println("Es divisible")
    }else{
        println("No es divisible")
    }
    contar(a,b)

}

fun divisible(a:Int, b:Int):Boolean{
    return (a%b == 0)
}

fun aleatorio(a:Int, b:Int):Int{
    return Random.nextInt(a+1,b+1)
    //return (a..b).random()
}
fun contar(a:Int, b:Int){
    var mayor = a
    var min=b
    if (min > mayor){
        mayor = min
        min = a
    }
    while (min<=mayor){
        print( " " + min )
        min++
    }
}