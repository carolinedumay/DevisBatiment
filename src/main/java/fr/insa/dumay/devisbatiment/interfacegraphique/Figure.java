/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author juliette
 */
public abstract class Figure {//jsp prq netbeans veut rendre cette classe abstract
    
    private Groupe groupe;
    
    public Groupe getGroupe(){
        return groupe;
    }
    void setGroupe(Groupe groupe){
        this.groupe = groupe;
    }
    /**
    public abstract double maxX();
    public abstract double minX();
    public abstract double maxY();
    public abstract double minY();
    
    public abstract double distancePoint(Point p);
    */
    public abstract void dessine(GraphicsContext context);
    //appeler la classe mur ?
}
