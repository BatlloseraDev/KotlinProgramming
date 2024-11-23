
fun main() {
    //Ejercicio 29 version 1
    println("De cuantos alumnos quieres las notas")
    var n_Alumnos = readln().toInt()
    //quiero hacerlo con for
    var corredorArray= 0
    val alumnosArray = Array<Float>(n_Alumnos){0f}
    while (corredorArray<n_Alumnos)
    {
        println("Escribe la nota del alumno ${corredorArray+1}")
        var nota = readln().toFloat()
        alumnosArray[corredorArray] = nota
        corredorArray++
    }
    var aprobados = 0
    var suspensos = 0
    var sobresaliente= 0
    var notable = 0
    var bienes = 0

    alumnosArray.forEach {
        if(it>=5f)
        {
            aprobados++
        }
        else
        {
            suspensos++
        }
        when(it.toInt())
        {
            9,10 -> sobresaliente++
            7,8-> notable++
            5,6-> bienes++

        }
    }
    println("El numero de aprobados es $aprobados y el numero de suspensos es $suspensos \n" +
            "Entre los aprobados hay $sobresaliente sobresaliente/s" +
            ", hay $notable notable/s y" +
            " hay $bienes bien/es")


}