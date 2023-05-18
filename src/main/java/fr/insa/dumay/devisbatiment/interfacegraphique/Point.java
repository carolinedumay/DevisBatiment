/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

/**
 *
 * @author juliette
 */
public class Point extends FigureSimple {
    
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
}
