module com.ejercicio.controlesvarios {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.ejercicio.controlesvarios to javafx.fxml;
    exports com.ejercicio.controlesvarios;
}