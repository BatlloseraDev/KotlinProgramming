//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Ejercicio23

    println("Dame un numero entero para saber su factorial")
    var n = readln().toInt()
    var nAux= n
    var fact:Long = 1
    while (n>0)
    {
        fact*=n;
        n--
    }
    println("El factorial de $nAux es $fact")



}