package com.example.filmesfavoritos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.*;

import java.util.ArrayList;
import java.util.Optional;

public class HelloController {
    @FXML
    private Label totalFilmes;

    @FXML
    private Label filmesFav;

    @FXML
    private TextField filmesUsuario;

    @FXML
    private ArrayList<String> filmes = new ArrayList<String>();

    @FXML
    public void cadastrarFilme(ActionEvent event) {

        if (String.valueOf(filmesUsuario.getText()) == "") {
            JOptionPane.showMessageDialog(null,"O campo deve ser preenchido corretamente!");
        } else {
            filmes.add(String.valueOf(filmesUsuario.getText()));
        }

        filmesUsuario.clear();
    }

    @FXML
    public void verFavoritos(ActionEvent event) {
        totalFilmes.setText("Total: " + String.valueOf(filmes.size()));
        filmesFav.applyCss();
        filmesFav.setText("O filme que mais gosta é " + filmes.get(0) +  "\n" +
                "E desses, o que menos gosta é " + filmes.get(filmes.size() - 1));
    }
}