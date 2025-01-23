class Capitolio {
    var reserva = ArrayList<Item>()
    var cementerio = ArrayList<Tributo>()


    fun inicializarItem(cantidad:Int){
        for (i in 1..cantidad){
            reserva.add(Item())
        }
    }
    fun alCementerio(tributo:Tributo){
        cementerio.add(tributo)
    }
    fun item():Item{
        return reserva.random()
    }
}