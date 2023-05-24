/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 *
 * @author juliette
 */
public class FOuverture extends MainPane {
    public FOuverture() {
        setTitle("Ouverture");

        Button closeButton = new Button("Fermer");
        closeButton.setOnAction(event -> close());

        VBox vbox = new VBox();
        vbox.getChildren().addAll(new Button("Cliquez-moi"), closeButton);

        Scene scene = new Scene(vbox, 300, 200);
        setScene(scene);
    }

    
    
    
    
    
    private void setTitle(String fenêtre_secondaire) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void close() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setScene(Scene scene) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
