module com.example.filmesfavoritos {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.desktop;

    opens com.example.filmesfavoritos to javafx.fxml;
    exports com.example.filmesfavoritos;
}