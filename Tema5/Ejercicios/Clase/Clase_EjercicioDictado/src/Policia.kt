class Policia(nombre: String, edad: Int) : Mujer(nombre, edad, inteligencia=0) {
    var id_placa=0;
    var ganasMultar=0;



    override fun frase() {
        println("Tengo placa $id_placa y soy $nombre ")
    }



}