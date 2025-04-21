module org.example.varioscontroles {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens org.example.varioscontroles to javafx.fxml;
    exports org.example.varioscontroles;
}