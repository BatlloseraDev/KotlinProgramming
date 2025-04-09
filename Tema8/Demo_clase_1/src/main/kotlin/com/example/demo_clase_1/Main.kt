package com.example.demo_clase_1

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.canvas.Canvas
import javafx.scene.canvas.GraphicsContext
import javafx.scene.input.KeyEvent
import javafx.scene.layout.StackPane
import javafx.scene.paint.Color
import javafx.stage.Stage

class Main : Application() {
    private var x = 75.0
    private var y = 75.0

    override fun start(primaryStage: Stage) {
        val canvas = Canvas(800.0, 600.0)
        val gc: GraphicsContext = canvas.graphicsContext2D

        drawShapes(gc)

        val root = StackPane()
        root.children.add(canvas)
        val scene = Scene(root, 800.0, 600.0)

        scene.addEventHandler(KeyEvent.KEY_PRESSED) { event ->
            when (event.code) {
                javafx.scene.input.KeyCode.UP -> y -= 10
                javafx.scene.input.KeyCode.DOWN -> y += 10
                javafx.scene.input.KeyCode.LEFT -> x -= 10
                javafx.scene.input.KeyCode.RIGHT -> x += 10
                else -> {}
            }
            drawShapes(gc)
        }

        primaryStage.title = "Simple Game"
        primaryStage.scene = scene
        primaryStage.show()
    }

    private fun drawShapes(gc: GraphicsContext) {
        gc.clearRect(0.0, 0.0, 800.0, 600.0)
        gc.fill = Color.GREEN
        gc.fillRect(x, y, 100.0, 100.0)
    }
}

fun main() {
    Application.launch(Main::class.java)
}