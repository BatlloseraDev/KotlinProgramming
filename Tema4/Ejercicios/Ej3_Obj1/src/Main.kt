import kotlin.random.Random

fun main() {

    var ferrari= Coche("Ferrari","F60","rojo","6666qtd",0,0,false)
    var seiscientos= Coche()
    seiscientos.marca= "Seat"
    seiscientos.modelo="600"
    seiscientos.matricula="3333klo"
    seiscientos.color="Blanco"

    var i= 0
    while(i<200)
    {
        i++
        var miau= (1..10).random()
        var velocidad= (1..100).random()
        var apagar= Random.nextBoolean()

        ferrari.estadoMotor=apagar
        ferrari.acelerar(velocidad)
        seiscientos.acelerar(velocidad)


        //var miau= (1..10).random()//Random.nextFloat()

        if(miau==1)
        {
            println("Maldito gato")
            ferrari.acelerar(0)
            ferrari.estadoMotor=false
            seiscientos.acelerar(0)
            seiscientos.estadoMotor=false
        }


    }

}