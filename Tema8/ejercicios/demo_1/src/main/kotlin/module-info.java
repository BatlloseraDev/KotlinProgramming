module com.ejercicio.demo_1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.ejercicio.demo_1 to javafx.fxml;
    exports com.ejercicio.demo_1;
}