package com.example.destinosviagens;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class HelloController {
    @FXML
    private TextField destinoUsuario;

    @FXML
    private Label viagensText;

    @FXML
    private ArrayList<String> destinos = new ArrayList<String>();

    @FXML
    protected void onRegistrarClick() {
        destinos.add(destinoUsuario.getText());

        destinoUsuario.clear();
    }

    @FXML
    protected void primeiraViagemClick(){
        if (destinos.size() == 0){
            viagensText.setText("Ainda não viajou");
        } else {
            viagensText.setText(String.valueOf(destinos.get(0)));
        }
    }

    @FXML
    protected void terceiraViagemClick(){
        if (destinos.size() < 3){
            viagensText.setText("Ainda não fez a terceira viagem");
        } else {
            viagensText.setText(String.valueOf(destinos.get(2)));
        }
    }

    @FXML
    protected void ultimaViagemClick(){
        if (destinos.size() == 0){
            viagensText.setText("Ainda não viajou");
        } else {
            viagensText.setText(String.valueOf(destinos.get(destinos.size() - 1)));
        }
    }
}