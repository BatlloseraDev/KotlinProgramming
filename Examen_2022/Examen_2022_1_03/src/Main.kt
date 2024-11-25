import kotlin.random.Random
import kotlin.random.nextInt

const val N=3
const val C=15
fun main() {
    var campamento= Array(N){IntArray(N){(0..100).random()} }

    imprimirCampamento(campamento)
    var zona = alert()
    while(zona!=0){
        var energiaActual=nivelZona(zona,campamento)
        println("Zona Atacada es ${zona} y la energia es $energiaActual")

        if(energiaActual>50)
        {
            println("Antes del ataque")
            imprimirCampamento(campamento)
            var cantidad= calcularCantidadEnergia(zona,campamento)

            ataqueCampamento(campamento,cantidad)
            /*var corredor= 1
            while(corredor<=(N*N))
            {
                aumentarEnergia(corredor,campamento,-cantidad)
                corredor++
            }*/
            println("Despues del ataque.")
        }
        aumentarEnergia(zona,campamento,C)
        imprimirCampamento(campamento)
        zona=alert()

    }
    println("Fin de juego")
}


fun calcularCantidadEnergia(zona:Int, campamento: Array<IntArray>):Int
{
    var energia=0
    if(zona==(N*N)){
        energia=50
    }else{

        energia= nivelZona(zona+1,campamento)
        if(energia%2==0)
        {
            energia/=2
        }
        else{
            energia-=7
        }
    }
    return energia
}


fun alert():Int
{
    return Random.nextInt(0..(N*N))
}
fun ataqueCampamento(campamento:Array<IntArray>, cantidad:Int){

    for(i in campamento.indices){
        for(j in campamento[i].indices)
        {
            if(campamento[i][j]!=0){
                campamento[i][j]-=cantidad
            }
        }

    }

}

fun nivelZona(zona:Int,campamento: Array<IntArray>):Int
{
    var coordenadas = crearCoordenadas(zona)
    return campamento[coordenadas[0]][coordenadas[1]]
}

fun crearCoordenadas(zona: Int):Array<Int>
{
    var v=Array <Int>(2){0}
    v[0]=(zona-1)/N
    v[1]=(zona-1)%N
    return v

}

fun aumentarEnergia(zona: Int, campamento: Array<IntArray>, cantidad: Int)
{
    var coordenadas = crearCoordenadas(zona)
    campamento[coordenadas[0]][coordenadas[1]]+= cantidad
}

fun imprimirCampamento(campamento: Array<IntArray>){
    for(i in campamento.indices){
        for(j in campamento[i].indices){
            print(".${campamento[i][j]}.")
        }
        println()

    }
    println()
}


/*
fun alert():Int
{
    return Random.nextInt(-1,1)
}
fun ataqueCampamento(campamento:Array<Int>, cantidad:Int){

    for(i in campamento.indices){
        if(campamento[i]!=0){
            campamento[i]-=cantidad
        }
    }

}

fun nivelZona(zona:Int,campamento: Array<Int>):Int
{
    return campamento[zona]
}

fun aumentarEnergia(zona: Int, campamento: Array<Int>, cantidad: Int)
{
        campamento[zona]+= cantidad
}

fun imprimirCampamento(campamento: Array<Int>){
    for(i in campamento.indices){
        print(".${campamento[i]}.")
    }
    println()
}
 */