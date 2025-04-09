module com.example.demo_clase_1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.demo_clase_1 to javafx.fxml;
    exports com.example.demo_clase_1;
}