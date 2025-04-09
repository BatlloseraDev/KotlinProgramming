package com.example.demo

import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.event.ActionEvent
import javafx.scene.control.CheckBox

class HelloController {

    @FXML
    private lateinit var LbResultado: Label

    @FXML
    private lateinit var txtNombre: TextField
    @FXML
    private lateinit var chbDual: CheckBox





    @FXML
    fun onAceptarPulsado(event: ActionEvent) {
        LbResultado.text = "Bienvenido/a ${txtNombre.text}!"
    }

    @FXML
    fun onSalirPulsado(event: ActionEvent) {
        System.exit(0)
    }
    @FXML
    fun onCHBPulsado(event: ActionEvent) {
        if (chbDual.isSelected) chbDual.text="Si" else chbDual.text="No" ;
    }


}