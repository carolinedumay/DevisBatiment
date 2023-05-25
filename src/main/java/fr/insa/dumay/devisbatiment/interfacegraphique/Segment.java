/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

import fr.insa.dumay.devisbatiment.Lire;
import static fr.insa.dumay.devisbatiment.interfacegraphique.Point.RAYON_IN_DRAW;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author julietteee
 */
public class Segment extends FigureSimple {
    
    //attributs
    private Point debut; //debut du segment
    private Point fin; //fin du segment
    
    //constructeurs (j'ai volontairement pas mis de couleurs)
    public Segment(Point debut, Point fin){
        this.debut = debut;
        this.fin = fin;
    }
    
    //accéder aux infos de début et de fin
    public Point getDebut(){
        return debut;
    }
    
    public Point getFin(){
        return fin;
    }

    @Override
    public String toString() {
        return "[" + this.debut + "," + this.fin + ']';
    }
    
        //entrer les coord du point (à modif pour juste clic souris)
    /**public static Segment demandeSegment(){
        System.out.println("point début : ");
        Point deb = Point.demandePoint();
        System.out.println("point fin : ");
        Point fin = Point.demandePoint();
        return new Segment(deb, fin);
    }
    */ 
    
    //@Override
    public void dessine(GraphicsContext context){
        context.strokeLine(this.debut.getPx(),this.debut.getPy(),this.fin.getPx(),this.fin.getPy());
    }
   
    
}
