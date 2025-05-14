package com.ejercicio.ejercicio6

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.ComboBox
import javafx.scene.control.TextField

class HelloController {

    @FXML
    private lateinit var cbPeliculas: ComboBox<Any>

    @FXML
    private lateinit var txtPelicula: TextField

    @FXML
    fun onAniadirPressed(event: ActionEvent) {
        if(!txtPelicula.text.isEmpty()){
            cbPeliculas.items.add(txtPelicula.text)
        }
    }
}