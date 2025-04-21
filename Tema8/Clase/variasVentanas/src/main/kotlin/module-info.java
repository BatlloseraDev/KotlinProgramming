module org.example.variasventanas {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens org.example.variasventanas to javafx.fxml;
    exports org.example.variasventanas;
}