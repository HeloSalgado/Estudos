package com.example.alunos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class HelloController {
    @FXML
    private Label alunosCadastrados;

    @FXML
    private TextField nomeAlunos;

    @FXML
    private ArrayList<String> alunos = new ArrayList<>();

    @FXML
    public void cadastrarAlunos(ActionEvent event) {
        alunos.add(nomeAlunos.getText());

        StringBuilder alunosText = new StringBuilder();

        for (int posicao = alunos.size() - 1; posicao >= 0; posicao--){
            alunosText.append(alunos.get(posicao)).append("\n");
        }

        alunosCadastrados.setText(alunosText.toString());

        nomeAlunos.clear();
    }
}