package com.example.javaapp;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class HelloController implements Initializable {
    @FXML
    private TableView<Pessoa> tabela;
    @FXML
    private TableColumn<Pessoa, Integer> colId;
    @FXML
    private TableColumn<Pessoa, String> colNome;
    @FXML
    private TableColumn<Pessoa, Integer> colIdade;
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtIdade;


    List<Pessoa> pessoaList = new ArrayList<>();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Pessoa p1 = new Pessoa("Julio", 17);
        Pessoa p2 = new Pessoa("Joao", 132);
        Pessoa p3 = new Pessoa("Joel", 16);

        pessoaList.add(p1);
        pessoaList.add(p2);
        pessoaList.add(p3);

        mostrarPessoas();

        System.out.println(pessoaList);
    }

    private void mostrarPessoas() {
        tabela.setItems(FXCollections.observableArrayList(pessoaList));
        colId.setCellValueFactory(new PropertyValueFactory<Pessoa, Integer>("id"));
        colNome.setCellValueFactory(new PropertyValueFactory<Pessoa, String>("nome"));
        colIdade.setCellValueFactory(new PropertyValueFactory<Pessoa, Integer>("idade"));

    }

    public void salvar(ActionEvent actionEvent) {
        Pessoa p = new Pessoa(txtNome.getText(), Integer.parseInt(txtIdade.getText()));
        pessoaList.add(p);
        mostrarPessoas();
    }
}