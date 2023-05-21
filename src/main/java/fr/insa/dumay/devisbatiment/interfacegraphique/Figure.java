/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author juliette
 */
public abstract class Figure {
    
    public static Color COULEUR_SELECTION = Color.RED;//je sais pas quoi en fzire
    
    private Groupe groupe;
    
    //setter
    
    public Groupe getGroupe(){
        return groupe;
    }
    
    void setGroupe(Groupe groupe){ //public donc cette méthode n'est accessible que dans les autres classes du meme package
        this.groupe = groupe;
    }
    /**
    public abstract double maxX();
    public abstract double minX();
    public abstract double maxY();
    public abstract double minY();
    
    public abstract double distancePoint(Point p);
    */
    public abstract void dessine(GraphicsContext context);//toute figure doit pouvoir se dessiner dans un certain contexte graphique
    
    public abstract void dessineSelection(GraphicsContext context);
    
    public abstract void changeCouleur(Color value);//truc en rapport avec la couleur et jsp pas quoi en faire
}
