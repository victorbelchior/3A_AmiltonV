/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author 03704323209
 */
public class PrincipalController implements Initializable {
    
    @FXML
    private TextField txtnum1, txtnum2, txtresult;
    
    @FXML
    private Button btnsoma, btnsubtrair, btndividir, btnmultiplicar;
    @FXML
    private Label label;
    
    @FXML
    private void Soma (ActionEvent event) {
        Double numero1 = Double.parseDouble(txtnum1.getText());
        Double numero2 = Double.parseDouble(txtnum2.getText());
        Double resultado = numero1 + numero2;
        txtresult.setText(resultado.toString());
    }
    @FXML
    private void Subtrair (ActionEvent event) {
        Double numero1 = Double.parseDouble(txtnum1.getText());
        Double numero2 = Double.parseDouble(txtnum2.getText());
        Double resultado = numero1 - numero2;
        txtresult.setText(resultado.toString());
    }
    @FXML
    private void Dividir (ActionEvent event) {
        Double numero1 = Double.parseDouble(txtnum1.getText());
        Double numero2 = Double.parseDouble(txtnum2.getText());
        Double resultado = numero1 / numero2;
        txtresult.setText(resultado.toString());
    }
    @FXML
    private void Multiplicar (ActionEvent event) {
        Double numero1 = Double.parseDouble(txtnum1.getText());
        Double numero2 = Double.parseDouble(txtnum2.getText());
        Double resultado = numero1 * numero2;
        txtresult.setText(resultado.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AbrirCadastroAlunos(ActionEvent event) {{
      
        FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
        Stage stage = new Stage();
    stage.setTitle("Cadastrar Aluno");
    stage.setScene(Scene);
    stage.show();
}
    catch(IOException e){

}
    }

    @FXML
    private void fecharProjeto(ActionEvent event) {
    }
    
}
