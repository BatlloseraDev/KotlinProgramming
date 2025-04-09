package com.example.controles2

import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.image.Image
import javafx.scene.image.ImageView

class HelloController {
    @FXML
    private lateinit var imagenCirculo: ImageView

    @FXML
    private fun btnMasPulsado() {
        val laImagen = Image("Dibujo2.jpg")
        imagenCirculo.image = laImagen
    }

    @FXML
    private fun btnMenosPulsado() {
        val laImagen = Image("Dibujo.jpg")
        imagenCirculo.image = laImagen
    }
}