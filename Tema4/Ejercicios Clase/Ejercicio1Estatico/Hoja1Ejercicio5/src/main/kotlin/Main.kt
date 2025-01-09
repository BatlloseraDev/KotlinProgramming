fun main() {
    var tres = Divisible(3,"Fizz")
    var cinco = Divisible(5,"Buzz")

    var n=0
    while (n< 100){

        if ((tres.esDivisible(n)) && (cinco.esDivisible(n))) {
            println(tres.texto + cinco.texto)
        }else{
            if (tres.esDivisible(n)){
                println(tres.texto)
            }else {
                if (cinco.esDivisible(n)) {
                    println(cinco.texto)
                } else {
                    println(n)
                }
            }
        }
      n++
    }
}