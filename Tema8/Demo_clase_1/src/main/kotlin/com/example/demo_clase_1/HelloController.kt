package com.example.demo_clase_1

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label

class HelloController {
    @FXML
    private lateinit var welcomeText: Label

    @FXML
    private lateinit var buttonText: Button

    @FXML
    private fun onHelloButtonClick() {
        welcomeText.text = "Welcome to JavaFX Application!"
    }

    @FXML
    private fun onButtonClick() {
        buttonText.text = "PERRO!"
    }

}