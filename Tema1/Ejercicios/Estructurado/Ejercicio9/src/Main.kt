//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Ingresa el primer valor")
    var a= readln().toInt()
    println("Ingresa el segundo valor")
    var b= readln().toInt()

    if(a>b)
    {
        println("El primero es mayor y la resta es ${a-b}")
    }
    else if(a<b)
    {
        println("El segundo es mayor y la resta es ${b-a}")
    }
    else
    {
        println("Los dos valores son iguales por lo que el resultado es 0")
    }
}