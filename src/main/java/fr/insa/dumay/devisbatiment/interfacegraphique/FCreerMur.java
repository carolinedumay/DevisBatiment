/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author caroo
 */
public class FCreerMur extends Stage {
    
    private TextField tfPx;
    private TextField tfPy;
    
    public FCreerMur(){
        Label label = new Label("Mur");
        
        Scene scene = new Scene(label, 500, 500);
        this.setScene(scene);
        this.setTitle("Créez votre mur");
}
}
