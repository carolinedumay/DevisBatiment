/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment;

/**
 *
 * @author juliette
 */
public class Fenetre extends Ouverture{
    /// On met RIEN d'autre ? On garde tout sauf le calcul qu'est déjà dans Ouverture
    
    //Attribut
    int idFenetre;
    double largeur;
    double hauteur;
            
    //Conctructeurs
    Fenetre (int id, double x, double y)
    {
        super(id,x,y);
    /*        
    this.idFenetre=id;
    this.largeur=x;
    this.hauteur=y;*/
    }
    
    //Méthodes
    void afficher()
    {
        System.out.println(" Fenetre : id ="+this.idFenetre+" largueur = "+this.largeur+ " hauteur ="+this.hauteur);
    }
        
   /* double surface()
    {
        return((this.largeur)*(this.hauteur));
    }*/
    }