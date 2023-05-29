/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author julietteeee
 */

public class FAccueil extends BorderPane {
    //Stage test;
    //private TextField quantityTextField;
    
    public FAccueil() {
       
        Button saveButton = new Button("Continuer");
        saveButton.setOnAction(event -> {
  
    // Fermer la fenêtre
    Stage stage = (Stage) saveButton.getScene().getWindow();
    stage.close();
    });
        
        // Création des boutons fenetre et porte
        Label PhraseLabel = new Label("Bienvenue dans l'interface pour réaliser le devis de votre futur bâtiment.");
        
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(PhraseLabel);
        StackPane.setAlignment(PhraseLabel, Pos.TOP_CENTER);
        
        StackPane posok = new StackPane();
        posok.getChildren().add(saveButton);
        StackPane.setAlignment(saveButton, Pos.BOTTOM_RIGHT);
        
        this.setTop(stackPane);
        this.setBottom(posok);
        stackPane.setPadding(new Insets(10));
        
        
        
        //Scene scene = new Scene(vbox, 300, 200); 
        //test = A;
    }

    /**private void close() { //on doit définir ce que fait cette méthode
        this.test.setScene(new Scene(new MainPane(), 800,600));
        */
    }
