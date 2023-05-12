/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author juliette
 */
public class MainPane extends BorderPane {
    
    private RadioButton rbSelect;
    private RadioButton rbPoints;
    private RadioButton rbSegments;
    
    private Button bGrouper;
    private Button bCouleur; 
    
    private Canvas cDessin;
    
    public MainPane(){
        this.rbSelect= new RadioButton("Select");
        this.rbPoints= new RadioButton("Points");
        this.rbSegments= new RadioButton("Segments");
        
        VBox vbGauche = new VBox(this.rbSelect,this.rbPoints,this.rbSegments);
        this.setLeft(vbGauche);
        
        this.bGrouper= new Button("Grouper");
        this.bGrouper.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                System.out.println("Bouton Grouper cliqué");
            }
        });
            
        }
        this.bCouleur= new Button("Couleur");
        VBox vbDroit = new VBox(this.bGrouper,this.bCouleur);
        this.setRight(vbDroit);
        
        this.cDessin = new DessinCanvas1(200,200);
        this.setCenter(cDessin);
        
        
        
    }

    
}
