//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //version 2
    println("vamos a calcular cuantos alumnos aprueban y de que tipo es el aprobado")
    var notaNegativa = false
    var contador = 1
    var sobresaliente = 0
    var notable = 0
    var bien = 0
    var suspenso = 0
    while (!notaNegativa)
    {
        println("Ingresa la nota del alumno $contador (Si ya no hay mas alumnos ingresa una nota negativa)")
        var n = readln().toFloat()
        if(n<0)
        {
            notaNegativa= true
        }
        else
        {
            when(n.toInt())
            {
                10,9 -> sobresaliente++
                8,7 -> notable++
                5,6 -> bien++
                else ->
                {
                    if(n.toInt()>10) println("Nota ($n)no valida")
                    else suspenso++
                }
            }
        }
        contador++
    }

    println("El numero de aprobados es de ${bien+notable+sobresaliente} y el de suspensos es de $suspenso" +
            "\nEl numero de sobresaliente/s es de $sobresaliente" +
            "\nEl numero de notable/s es de $notable" +
            "\nEl numero de bien/es es de $bien")


}