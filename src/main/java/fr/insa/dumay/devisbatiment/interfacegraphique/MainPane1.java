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
    
    private static DessinCanvas dessin;

    public MainPane1() {
        dessin = new DessinCanvas(650, 600);
        setRight(dessin);

        Button buttonCreerMur = new Button("Créer un mur");
        buttonCreerMur.setOnAction(e -> {
            FCreerMur creermur = new FCreerMur();
            creermur.setDessinCanvas(dessin); // Passer l'instance de DessinCanvas à FCreerMur
            creermur.show();
        });

        VBox vbox = new VBox(buttonCreerMur);
        vbox.setPadding(new Insets(10));

        setTop(vbox);
    }

    public void dessinerSegment(double x1, double y1, double x2, double y2) {
        dessin.dessinerSegment(x1, y1, x2, y2);
    }
    
    public static DessinCanvas getCanvas(){
        return dessin;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    /**private DessinCanvas dessin = new DessinCanvas();

    public MainPane1() {
        
        
        DessinCanvas dessin = new DessinCanvas();
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
    */
}