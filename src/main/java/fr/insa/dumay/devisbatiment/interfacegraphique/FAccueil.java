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
 * @author juliette
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
        Label NiveauLabel = new Label("Nombre de niveau :");
        Label LargeurLabel = new Label("Largeur du bâtiment :");
        Label LongueurLabel = new Label("Longueur du bâtiment");
        
        
        // Champ de texte pour saisir le nombre d'ouverture
        TextField textNiveau = new TextField();
        textNiveau.setPromptText("");
        
        TextField textLargeur = new TextField();
        textLargeur.setPromptText("");
        
        TextField textLongueur = new TextField();
        textLongueur.setPromptText("");
        
        //mise en place
        
        HBox hbox1 = new HBox();
        hbox1.getChildren().addAll(NiveauLabel,textNiveau);
        
        HBox hbox2 = new HBox();
        hbox2.getChildren().addAll(LargeurLabel,textLargeur);
        
        HBox hbox3 = new HBox();
        hbox3.getChildren().addAll(LongueurLabel,textLongueur);
        
        Button buttonTest = new Button("Test");
        buttonTest.setOnAction(e ->{
            Test test = new Test();
            test.show();
        });
        
        
        
        VBox vbox = new VBox();
        vbox.getChildren().addAll(hbox1,hbox2,hbox3, buttonTest);
        vbox.setPadding(new Insets(10));
        
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(PhraseLabel);
        StackPane.setAlignment(PhraseLabel, Pos.TOP_CENTER);
        
        this.setTop(stackPane);
        this.setCenter(vbox);
        
        
        
        //Scene scene = new Scene(vbox, 300, 200); 
        //test = A;
    }

    /**private void close() { //on doit définir ce que fait cette méthode
        this.test.setScene(new Scene(new MainPane(), 800,600));
        */
    }
