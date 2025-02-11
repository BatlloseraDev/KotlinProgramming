

class Cuadrante {

    var supervisor= "VIKA"
    var mecanico="JACK"
    var naves = ArrayList<Nave>()


    constructor(){

    }

    constructor(fila:Int, columna:Int,naves:ArrayList<Nave>)
    {
        mecanico= mecanico+fila+columna;
        supervisor= supervisor+fila+columna;
        this.naves= naves
    }


    fun aniadirDron(dron:Nave){
        if(naves.size<Constantes.MAXNAVESCUADRANTE)
        {
            naves.add(dron)
        }
    }
    //fun de crear  nombre
}