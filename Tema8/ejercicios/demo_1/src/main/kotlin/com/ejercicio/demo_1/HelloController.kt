package com.ejercicio.demo_1

import javafx.fxml.FXML
import javafx.scene.control.Label

class HelloController {
    @FXML
    private lateinit var welcomeText: Label

    @FXML
    private fun onHelloButtonClick() {
        welcomeText.text = "Welcome to JavaFX Application!"
        println("hola")
        var a= readLine()
        println(a)
    }
}