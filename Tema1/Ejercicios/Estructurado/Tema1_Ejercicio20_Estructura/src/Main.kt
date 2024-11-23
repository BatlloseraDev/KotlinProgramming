//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Escribe el nombre con la primera letra mayuscula o pon el numero de un mes")
    var mes= readln()
    println("Pon el año")
    var anio = readln().toInt()
    var dias=0
    var bisiesto=false
    if ((anio%4 == 0 && anio%100!=0)|| (anio%100==0 && anio%400==0)) bisiesto=true
    else bisiesto=false

    when(mes)
    {
        "Enero", "1", "Marzo","3","Mayo","5","Julio","7","Agosto","8",
                 "Octubre","10","Diciembre","12"
             ->dias=31

        "Abril","4","Junio","6","Septiembre","9","Noviembre","11"
            ->dias= 30
        "Febrero","2"-> if(bisiesto) dias=29 else dias=28
        else -> println("Nombre o numero incorrecto")
    }

    if(dias != 0)
    {
        println("El mes $mes del año $anio tiene $dias dias")
    }
}