/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author juliette
 */
public class DessinCanvas1 extends Canvas{
    
    public DessinCanvas1(){
        setStyle("-fx-border-color: black");
    }
    public void dessinerSegment(double x1, double y1, double x2, double y2) {
        GraphicsContext gc = this.getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        gc.strokeLine(x1, y1, x2, y2);
    }
    
    /*public void colorerZone(Color couleur) {
        GraphicsContext gc = this.getGraphicsContext2D();
        gc.setFill(couleur);
        gc.fillRect(0, 0, getWidth(), getHeight());
    }
*/
}
