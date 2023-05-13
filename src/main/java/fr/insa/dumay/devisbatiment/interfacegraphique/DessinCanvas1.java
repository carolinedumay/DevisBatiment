 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;


import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.*;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author juliette
 */
public class DessinCanvas1 extends Canvas{
 
    public DessinCanvas1(double w, double h){
        super(w,h); // taille du canvas (zone de dessin)
        GraphicsContext context = this.getGraphicsContext2D(); //c'est là-dessus que je peux dessiner
        context.setFill(Color.RED); //colorier en rouge
        context.fillRect(0,0,this.getWidth(),this.getHeight()); // coord 1 et 2 : (0,0) : coin haut gauche de la fenetre ; coord 2 et 3 : taille en x et en y
    }    
    
}
