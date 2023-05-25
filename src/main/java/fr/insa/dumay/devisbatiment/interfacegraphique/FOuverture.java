/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 *
 * @author julietteeee
 */
public class FOuverture extends BorderPane {
    //Stage test;
    //private TextField quantityTextField;
    
    public FOuverture() {
       
        /*//création du bouton fermer
        Button closeButton = new Button("Fermer");
        closeButton.setOnAction(event -> close());
        */
        
        // Création des boutons fenetre et porte
        Button fenetreButton = new Button("Fenêtre");
        Button porteButton = new Button("Porte");

        // Champ de texte pour saisir le nombre d'ouverture
        TextField textFenetre = new TextField();
        textFenetre.setPromptText("Entrez le nombre de fenêtres (0 si aucune)");
        
        TextField textPorte = new TextField();
        textPorte.setPromptText("Entrez le nombre de portes (0 si aucune");
        
        //mise en place des boutons
        VBox vbox = new VBox();
        vbox.getChildren().addAll( fenetreButton,textFenetre, porteButton,textPorte);
        this.setCenter(vbox);
        
        //Scene scene = new Scene(vbox, 300, 200); 
        //test = A;
    }

    /**private void close() { //on doit définir ce que fait cette méthode
        this.test.setScene(new Scene(new MainPane(), 800,600));
        */
    }

    
    
    
    
    


