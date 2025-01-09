class Contrasenia {
    var longitud = 8
    var contrasenia:String = ""
    var fuerte :Boolean = false

    constructor()
    constructor(b:Boolean){
        fuerte = b
    }
    constructor(l:Int){
        longitud=l
    }
    fun generar(){
        if (fuerte){
            contrasenia = fuerte()
        }else{
            contrasenia = debil()
        }
    }
    fun debil():String{
        var n=""
        for (i in 1.. longitud){
            var x = (0..9).random()
            n = n + x.toString()
        }
        return  n
    }

    fun fuerte():String{
        var s=""
        var contador1=0
        var contador2=0
        var contador3=0
        var seguir = true
        do {
            var n = (1..3).random()
            when (n) {
                1 -> {
                    if (contador1<2){
                        contador1++
                        s = s + devolverMayusculas()
                    }
                }
                2 -> {
                    if (contador2<1){
                        contador2++
                        s = s + devolverMinusculas()
                    }
                }

                else -> {
                    if (contador3<5) {
                        contador3++
                        s = s + ((3..9).random()).toString()
                    }
                }
            }
        }while ((contador1<2) || (contador2<1) || (contador3<5))

        return  s
    }
    fun devolverMayusculas():String{
        var n = (1..4).random()
        return when (n){
            1->{"Q"}
            2->{"W"}
            3->{"E"}
            else->{"R"}
        }
    }
    fun devolverMinusculas():String{
        var n = (1..3).random()
        return when (n){
            1->{"a"}
            2->{"s"}
            else->{"d"}
        }
    }
}