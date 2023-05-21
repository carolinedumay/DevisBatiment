/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

import fr.insa.dumay.devisbatiment.Lire;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author juliette
 */
public class Point extends FigureSimple {
    
    public static double RAYON_IN_DRAW = 5; //rayon du cercle(=point)
    
    private double px;
    private double py;

    public Point(double px, double py) {
        this.px = px;
        this.py = py;
    }
    
    //on condidère que la couleur par défaut est noir j'ai donc pas crée d'attribut couleur dans FigureSimple
    
    public Point(){
        this(0,0); //si je ne veux pas donner de coord au point alors il aura pour coord : (0,0)
    }
    
    //création des accesseurs en écriture (= modifier la valeur d'une propriété d'un objet)
     /**
     * @return the px
     */
    public double getPx() {
        return px;
    }

    /**
     * @param px the px to set
     */
    public void setPx(double px) {
        this.px = px;
    }

    /**
     * @return the py
     */
    public double getPy() {
        return py;
    }

    /**
     * @param py the py to set
     */
    public void setPy(double py) {
        this.py = py;
    }

    @Override
    public String toString() {
        return "(" + px + "," + py + ')';
    }
    
    
    //entrer les coord du point (à modif pour juste clic souris)
    /**public static Point demandePoint(){
        System.out.println("abcisse : ");
        double px = Lire.d();
        System.out.println("ordonné : ");
        double py = Lire.d();
        return new Point(px, py);
      
    }
    */
    
    //@Override
    public void dessine(GraphicsContext context){
        context.fillOval(this.px-RAYON_IN_DRAW, this.py-RAYON_IN_DRAW, 2*RAYON_IN_DRAW, 2*RAYON_IN_DRAW);// taille = 2*rayon
    }
    public void dessineSelection(GraphicsContext context){//truc en rapport avec la couleur dcp je sais pas quoi en faire
        context.setFill(Figure.COULEUR_SELECTION);
        context.fillOval(this.px-RAYON_IN_DRAW, this.py-RAYON_IN-DRAW, 2*RAYON_IN_DRAW, 2*RAYON_IN_DRAW);
    }
}
