package com.example.olamundoswing;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button btnCliqueMe;

    @FXML
    protected void clicouBotao(ActionEvent event) {
        welcomeText.setText("Olá Mundo");
    }
}