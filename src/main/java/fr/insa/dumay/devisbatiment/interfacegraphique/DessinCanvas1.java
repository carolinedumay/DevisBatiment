/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

import java.awt.Canvas;
import java.awt.Color;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author juliette
 */
public class DessinCanvas1 extends Canvas{
 
    public DessinCanvas1(double w, double h){
        super(w,h);
        GraphicsContext context = this.getGraphicsContext2D();
        context.setFill(Color.RED);
        context.fillRect(0,0,this.getWidth(),this.getHeight());
    }    
    
}
