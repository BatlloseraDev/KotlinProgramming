package org.example.variasventanas

import Modelo.PasoDatos
import Modelo.Persona
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.Node
import javafx.scene.control.TextField
import javafx.stage.Stage
import java.net.URL
import java.util.*

class Ventana2Controller : Initializable {
    var pPrincipal: Persona? = null

    @FXML
    private lateinit var  TXTEdad: TextField

    @FXML
    private lateinit var  TXTNombre: TextField


    @FXML
    fun volver(event: ActionEvent?) {
        PasoDatos.p.edad = TXTEdad.text.toInt()
        PasoDatos.p.nombre = TXTNombre.text


        val source: Node = event!!.source as Node
        val stage = source.scene.window as Stage
        stage.close()
    }


    override fun initialize(url: URL?, rb: ResourceBundle?) {
//        TXTNombre.text = this.pPrincipal!!.nombre
//        TXTEdad.text = this.pPrincipal!!.edad.toString()
        TXTNombre.text = PasoDatos.p.nombre
        TXTEdad.text = PasoDatos.p.edad.toString()
    }


}