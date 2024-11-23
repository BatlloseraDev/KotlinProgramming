fun main(args: Array<String>) {


    for (i in 1..1000){
        if (esPerfecto(i)){
            println(i)
        }
    }
}

fun esPerfecto(n: Int): Boolean {
    var suma = 0

    for(i in 1..n-1){
        if (n % i == 0){
            suma+=i
        }
    }
    return suma == n
}

