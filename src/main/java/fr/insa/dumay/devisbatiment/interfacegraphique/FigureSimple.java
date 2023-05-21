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
public abstract class FigureSimple extends Figure{ //abstract car aucun
    //j'ai changé tout ça, c'est en rapport avec la couleur mais du coup est-ce utile ???
    private Color couleur;
    
    public FigureSimple(Color couleur){
        this.couleur = couleur;
    }
    public Color getCouleur(){
        return couleur;
    }
    public void setCouleur(Color couleur){
        this.couleur = couleur;
    }

    @Override
    public void changeCouleur(Color value){
        this.setCouleur(value);
    }
    
}
