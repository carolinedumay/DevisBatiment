/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 *
 * @author juliette
 */
public class FOuverture extends BorderPane {
    Stage test;
    public FOuverture(Stage A) {
       

        Button closeButton = new Button("Fermer");
        closeButton.setOnAction(event -> close());

        VBox vbox = new VBox();
        vbox.getChildren().addAll(new Button("Cliquez-moi"), closeButton);
        this.setBottom(vbox);
        //Scene scene = new Scene(vbox, 300, 200); 
        test = A;
    }

    private void close() {
        this.test.setScene(new Scene(new MainPane(), 800,600));
    }

    
    
    
    
    

}
