//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Ejercicio24
    println("Ingresa cuantos numeros quieres calcular la media")
    var n = readln().toInt()
    var i = 0
    var sum = 0f
    while (i<n)
    {
        println("Introduce el numero ${i+1}")
        sum += readln().toInt()
        i++
    }
    println("El resultado es ${sum/n}")

}