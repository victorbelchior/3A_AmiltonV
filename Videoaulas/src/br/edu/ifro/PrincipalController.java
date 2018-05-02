/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author 03704323209
 */
public class PrincipalController implements Initializable {
    
    @FXML
    private TextField txtnum1, txtnum2, txtresult;
    
    @FXML
    private Button btnsoma;
    
    @FXML
    private void Soma (ActionEvent event) {
        Double num1 = Double.parseDouble(txtnum1.getText());
        Double num2 = Double.parseDouble(txtnum1.getText());
        Double result = Double.parseDouble(txtnum1.getText());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
