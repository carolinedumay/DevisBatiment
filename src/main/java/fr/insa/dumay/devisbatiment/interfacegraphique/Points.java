/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

import javafx.scene.paint.Color;

/**
 *
 * @author juliette
 */
public class Points {
    
    private double px;
    private double py;

    public Points(double px, double py, Color couleur) {// enlever couleur
        //super(couleur);
        this.px = px;
        this.py = py;
    }
    
}
