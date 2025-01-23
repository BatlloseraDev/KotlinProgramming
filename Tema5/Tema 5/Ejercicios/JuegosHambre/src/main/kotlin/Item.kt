class Item {
    var tipo: Tipo = Tipo.entries.toTypedArray().random()
    var nivel = (50..100).random()
}