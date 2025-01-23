import kotlin.random.Random

class FabricaGalletas {
    companion object {
        fun crearGalleta(): Galleta {
            var g=Galleta()
            var final=(0..10).random()
            for(i in 1..final){
                var i= crearIngrediente()
                g.aniadirIngrediente(i)
            }
            return g
        }

        fun crearGalletaEspecial(): GalletaEspecial {
            val galleta = GalletaEspecial()
            var final=(0..10).random()
            for(i in 1..final){
                var g=crearGalleta()
                galleta.aniadirGalleta(g)
            }
            galleta.forma = crearForma()
            return galleta
        }

        fun crearGalletaRellena():GalletaRellena {
            val g = GalletaRellena(crearSabor(), (0..100).random())
            g.consumoAnimal= Random.nextBoolean()
            var final=(0..10).random()
            for(i in 1..final){
                var i= crearIngrediente()
                g.aniadirIngrediente(i)
            }
            g.sabor = crearSabor()
            return g
        }

        fun crearGalletaRellenaParticular(): GalletaRellenaParticular {
            val g = GalletaRellenaParticular()
            g.consumoAnimal= Random.nextBoolean()
            var final=(0..10).random()
            for(i in 1..final){
                var i= crearIngrediente()
                g.aniadirIngrediente(i)
            }
            g.sabor = crearSabor()
            return g
        }

        private fun crearSabor():Sabor{
            var s=Sabor()
            s.coste=(0..100).random()
            s.gradoDulzura=(0..100).random()
            s.nombre=sabores.values().random().toString()
            return s
        }
        private fun crearIngrediente():Elemento{
            var e=Elemento()
            e.carbohidratos=(0..100).random()
            e.grasas=(0..100).random()
            e.porcentaje=(0..100).random()
            e.nombre=ingredientes.values().random().toString()
            return e
        }
        private fun crearForma():Forma{
            var f=Forma()
            f.dificultad=(0..100).random()
            f.tiempoModelado=(0..100).random()
            return f
        }
    }


}
enum class sabores{
    vainilla,chocolate,fresa,algodon;
}
enum class ingredientes{
    harina, sal, azucar, miel, e504, e503;
}