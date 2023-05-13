/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/**
 *
 * @author juliette
 */
public class DessinCanvas extends Pane {
    
    private Canvas realCanvas;
    
    public DessinCanvas(){
        this.realCanvas = new Canvas(this.getWidth(), this.getHeight());
        this.redrawAll();
    }
    
    public void redrawAll(){ //on va surement avoir besoin de redessiner si on change la taille du canvas 
        GraphicsContext context = this.realCanvas.getGraphicsContext2D(); //c'est là-dessus que je peux dessiner
        context.setFill(Color.RED); //colorier en rouge
        context.fillRect(0,0,this.getWidth(),this.getHeight()); // coord 1 et 2 : (0,0) : coin haut gauche de la fenetre ; coord 2 et 3 : taille en x et en y

    }
            
}
