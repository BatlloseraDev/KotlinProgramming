//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

  println("Necesitamos tus datos personales")
    println("Por favor, introduzca su nombre")
    var nombre:String = readln()+ " "
    println("Ahora introduzca su primer apellido")
    var apellido1:String= readln()
    println("Y por ultimo introduzca su segundo apellido")
    var apellido2:String = readln()

    println("Los datos que nos has dado son los siguientes: \n" +
            "$nombre ${apellido1} ${apellido2}")






}