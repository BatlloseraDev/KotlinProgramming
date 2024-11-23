//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Ejercicio6
    println("Por favor ingresa un numero para calcular la raiz cuadrada")
    var n = readln().toDouble()
    if(n<0) println("La raiz cuadrada no se puede hacer")
    else println("El resultado es ${Math.sqrt(n)}")

}