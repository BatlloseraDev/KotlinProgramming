module com.ejercicio.ejercicio6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.ejercicio.ejercicio6 to javafx.fxml;
    exports com.ejercicio.ejercicio6;
}