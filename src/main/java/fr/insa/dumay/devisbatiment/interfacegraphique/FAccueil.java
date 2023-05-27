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
       
        /*//création du bouton fermer
        Button closeButton = new Button("Fermer");
        closeButton.setOnAction(event -> close());
        */
        
        // Création des boutons fenetre et porte
        Label PhraseLabel = new Label("Bienvenue dans l'interface pour réaliser le devis de votre futur bâtiment.");
        
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(PhraseLabel);
        StackPane.setAlignment(PhraseLabel, Pos.TOP_CENTER);
        
        this.setTop(stackPane);
        stackPane.setPadding(new Insets(10));
        
        
        
        //Scene scene = new Scene(vbox, 300, 200); 
        //test = A;
    }

    /**private void close() { //on doit définir ce que fait cette méthode
        this.test.setScene(new Scene(new MainPane(), 800,600));
        */
    }
