module com.ejercicio.ejercicio3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.ejercicio.ejercicio3 to javafx.fxml;
    exports com.ejercicio.ejercicio3;
}