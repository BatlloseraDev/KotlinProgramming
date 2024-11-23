//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Ejercicio 16
    println("Ingrese la distancia y el numero de dias de duracion del tren para saber el precio del billete" +
            "\nIngrese la distancia:")
    var dist= readln().toInt()
    println("Ingrese el numero de dias:")
    var dias= readln().toInt()

    var calculo = dist*2.5

    if (dias>7 && dist>800)
    {
        calculo -= (calculo*0.3);
    }

    println("El precio final del trayecto es de $calculo €")

}