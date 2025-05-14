package com.ejercicio.ejercicio4

import javafx.animation.KeyFrame
import javafx.animation.Timeline
import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.control.ProgressBar
import javafx.event.ActionEvent
import javafx.fxml.Initializable
import javafx.util.Duration
import java.net.URL
import java.util.*

class ClepsidraController: Initializable {


    private var hora:Int = 0
    private var minuto:Int = 0
    private var dia:Int = 0

    private val timeline = Timeline(
        KeyFrame(
            Duration.seconds(0.5),
            { _ ->
                minuto++
                CheckCounters()
            }
        )
    )

    fun CheckCounters(){
        if(minuto>=60){
            hora++
            minuto = 0
        }
        if(hora>=24){
            dia++
            hora = 0
        }
        upddateLabels()
    }

    fun upddateLabels(){
        txtNDia.text="$dia"
        txtNHora.text="$hora"
        txtNMin.text="$minuto"

        pbDIa.progress= dia*100.0/31.0/100.0
        pbMin.progress=minuto*100.0/60.0/100.0
        pbHora.progress=hora*100.0/24.0/100.0

    }


    @FXML
    private lateinit var pbDIa: ProgressBar

    @FXML
    private lateinit var pbHora: ProgressBar

    @FXML
    private lateinit var pbMin: ProgressBar

    @FXML
    private lateinit var txtNDia: Label

    @FXML
    private lateinit var txtNHora: Label

    @FXML
    private lateinit var txtNMin: Label


    @FXML
    fun onArrancarPressed(event: ActionEvent) {
        timeline.cycleCount = Timeline.INDEFINITE
        timeline.play()
    }

    @FXML
    fun onPararPressed(event: ActionEvent) {
        timeline.stop()
    }

    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        pbDIa.progress = 0.0
        pbHora.progress = 0.0
        pbMin.progress = 0.0
        txtNDia.text = "0"
        txtNHora.text = "0"
        txtNMin.text = "0"
        //dia=15 como testeo
        //hora=20

    }

}