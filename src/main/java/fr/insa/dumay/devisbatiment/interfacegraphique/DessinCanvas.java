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
public class DessinCanvas extends Canvas{
    
    public DessinCanvas(){
        setStyle("-fx-border-color: black");
    }
    
    public void dessinerSegment(double x1, double y1, double x2, double y2) {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(1.0);//épaisseur du trait
        gc.strokeLine(x1, y1, x2, y2);
    }
    
    
    public DessinCanvas(double width, double height) {
        super(width, height);
    }
}
