package com.example.relembrarmoradia;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class HelloController {
    @FXML
    private Label moradias;

    @FXML
    private TextField bairroUsuario;

    @FXML
    private TextField numeroMoradia;

    @FXML
    private ArrayList<String> bairro = new ArrayList<String>();

    @FXML
    public void cadastrarBairro(ActionEvent event) {
        bairro.add(bairroUsuario.getText());

        bairroUsuario.clear();
    }

    @FXML
    public void relembrarMoradia(ActionEvent event) {
        for (int posicao = 1; posicao <= bairro.size(); posicao++){
            if (Integer.valueOf(numeroMoradia.getText()) == posicao) {
                moradias.setText(bairro.get(posicao - 1));
            }

            if (Integer.valueOf(numeroMoradia.getText()) > bairro.size()){
                moradias.setText("Você ainda não morou num " + numeroMoradia.getText() + "º bairro!");
            }
        }
    }


}