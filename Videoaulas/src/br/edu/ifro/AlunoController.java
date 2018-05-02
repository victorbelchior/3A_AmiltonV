/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import br.edu.ifro.br.edu.ifro.modelo.Aluno.Aluno;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author 03704323209
 */
public class AlunoController implements Initializable {

    @FXML
    private JFXTextField txtNome;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void salvar(ActionEvent event) {
        EntityManagerFactory enf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = enf.createEntityManager();
        Aluno a = new Aluno();
        a.setNome(txtNome.getText());
        
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
    }

    @FXML
    private void fechar(ActionEvent event) {
    }
    
}
