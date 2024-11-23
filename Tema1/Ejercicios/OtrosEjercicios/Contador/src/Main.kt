//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Ingresa hasta el numero que quieres que cuente")
    var numeroObjetivo = readln().toInt();
    var contador = 0
    while(contador<=numeroObjetivo)
    {
        println("El numero: $contador")
        contador++
    }


}