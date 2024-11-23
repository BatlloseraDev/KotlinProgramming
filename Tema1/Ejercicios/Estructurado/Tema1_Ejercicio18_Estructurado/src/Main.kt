//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Ejercicio 18
    println("Dame la hora, los minutos y los segundos y te los devolvere sumados por 1 segundo" +
            "\nDame la hora")
    var h = readln().toInt()
    println("Dame los minutos")
    var m= readln().toInt()
    println("Dame los segundos")
    var s = readln().toInt()

    s++ //sumo un segundo
    if(s>=60 )
    {
        m += s/60
        s%=60
    }
    if(m>=60)
    {
        h+= m/60
        m%=60
    }
    if(h>=24)
    {
        h%=24
    }

    println("La hora sumada un segundo es ${String.format("%02d",h)}:${String.format("%02d",m)},${String.format("%02d",s)} ")
}