module com.example.relembrarmoradia {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.relembrarmoradia to javafx.fxml;
    exports com.example.relembrarmoradia;
}