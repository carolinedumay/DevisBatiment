package fr.insa.dumay.devisbatiment;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juliette
 */
public class Tremie extends Ouverture{
    //Attribut
    //int idTremie;
    //double largeur;
    //double hauteur;
    
    //Conctructeurs
    Tremie (int id, double x, double y)
    {   
        super(id);
        this.dimX=x;
        this.dimY=y;
        this.type = "Tremie";
        /*        
        
    this.idTremie=id;
    this.largeur=x;
    this.hauteur=y;*/
    }
    
    //Méthodes
 /*   void afficher()
    {
        System.out.println(" Tremie : id ="+this.idTremie+" largueur = "+this.largeur+ " hauteur ="+this.hauteur);
    }
        
   /* double surface()
    {
        return((this.largeur)*(this.hauteur));
    }*/
    
    
}
