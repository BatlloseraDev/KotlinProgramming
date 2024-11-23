fun main(args: Array<String>) {
    var num1 : Int = 0
    var num2 : Int = 0

    print("Dame 2 números: ")
    num1= readln().toInt()
    num2= readln().toInt()
    //var resta:Int=0
    if (num1 > num2){
        println("Numero 1 mayor 2 ${num1-num2}")
        //resta = num1-num2
       // println("Numero 1 mayor 2 $resta")
    }else if (num2>num1){
        println("Numero 2 mayor 1 ${num2-num1}")
    }else{
        println("Son iguales resta 0")
    }

    if (num1 > num2){
        println("Numero 1 mayor 2 ${num1-num2}")

    }
    if (num1 < num2){
        println("Numero 1 mayor 2 ${num1-num2}")

    }
    if (num1 == num2){
        println("Numero 1 mayor 2 ${num1-num2}")

    }



}