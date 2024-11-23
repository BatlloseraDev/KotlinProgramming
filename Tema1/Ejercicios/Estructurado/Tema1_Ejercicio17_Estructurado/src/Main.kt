//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Ejercicio 17
    //como no pide ninguna entrada solo es el calculo
    println("Se calculara el jornal diario para los dos turnos tanto el de dia como el de noche")

    var dias = 365
    var domingos : Int= dias/7
    dias -=domingos

    var sumDiurno = (dias * (20/*euros*/*8/*horas*/)) +(domingos *(30*8))
    var sumNocturno = (dias* (35*8)) +(domingos*(50*8))
    println("El turno diurno el jornal diario será de ${sumDiurno/365}" +
            "\nEl turno nocturno el jornal diario será de ${sumNocturno/365}")



}