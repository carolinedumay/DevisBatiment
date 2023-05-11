/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment;

/**
 *
 * @author juliette
 */
public class Porte extends Ouverture{
    
    //Attribut
   // int idPorte;
   // double largeur;
   // double hauteur;
            
    //Conctructeurs
    Porte (int id)
    {
        super (id);
        this.dimX=2;
        this.dimY=1;
        this.type="Porte";
        /*
    this.idPorte=id;
    this.largeur=x;
    this.hauteur=y; */
    }
    
    //Méthodes
   /* void afficher()
    {
        System.out.println(" Porte : id ="+this.idPorte+" largueur = "+this.largeur+ " longueur ="+this.hauteur);
    }
        
    double surface()
    {
        return((this.largeur)*(this.hauteur));
    }*/
    }