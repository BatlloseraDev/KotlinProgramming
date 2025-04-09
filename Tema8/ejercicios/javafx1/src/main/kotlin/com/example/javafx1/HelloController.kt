package com.example.javafx1

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label

class HelloController {
    @FXML
    private lateinit var welcomeText: Label
    @FXML
    private lateinit var miText: Label
    @FXML
    private lateinit var btnPulsar: Button
    @FXML
    private fun onPulsar() {
        welcomeText.text = "Welcome to JavaFX Application!"
    }

    @FXML
    private fun onPulsar2() {
        miText.text ="kolololo"
        btnPulsar.text="estoy aqui"
    }
}