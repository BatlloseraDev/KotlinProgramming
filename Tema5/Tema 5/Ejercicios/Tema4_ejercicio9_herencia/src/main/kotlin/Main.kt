fun main() {
    var banco = arrayListOf<Cuenta>()
    var grupo = ArrayList<Persona>()
    var nombres= arrayOf("José","María")
    var edad = arrayOf(17,23)
    //var banco2= ArrayList<Cuenta>()
    // jose 17, maria 50 , ana 22 ,eva 16 ,juan 80
    var dni=1
    for (i in 1..5){
        var rd = (0..1).random()
        var person = Persona()
        person.dni = dni
        dni++
        person.edad =  edad[rd]
        grupo.add(person)
    }

}