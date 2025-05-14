package com.ejercicio.ejercicio5

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class MultiplicarApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(MultiplicarApplication::class.java.getResource("multiplicar-view.fxml"))
        val scene = Scene(fxmlLoader.load())
        stage.title = "Multiplicaciones!"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(MultiplicarApplication::class.java)
}