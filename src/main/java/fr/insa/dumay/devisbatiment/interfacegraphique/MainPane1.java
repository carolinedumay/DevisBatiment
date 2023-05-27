/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author juliette
 */
public class MainPane1 extends BorderPane{
    
   private DessinCanvas1 dessin = new DessinCanvas1();

    public MainPane1() {
        
        
        DessinCanvas1 dessin = new DessinCanvas1();
        setRight(dessin);
        
        Button buttonCreerMur = new Button("Créer un mur");
        buttonCreerMur.setOnAction(e -> {
            FCreerMur creermur = new FCreerMur();
            creermur.show();
        });

        VBox vbox = new VBox(buttonCreerMur);
        vbox.setPadding(new Insets(10));

        this.setTop(vbox);
    }

    Object getDessinCanvas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}