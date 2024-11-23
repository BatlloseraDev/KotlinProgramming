fun main(args: Array<String>) {
    var año : Int = 0

    print("Dime un año")
    año = readln().toInt()

    if (año%4==0 && año%100!=0 || año%400==0){
        println("El ${año} es bisiesto")
    }
    else{
        println("El ${año} no es bisiesto")
    }
}