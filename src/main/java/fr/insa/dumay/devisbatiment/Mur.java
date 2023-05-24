/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment;

import java.util.ArrayList;
/**
 *
 * @author cdumay01
 */
public class Mur {
    
    
    // Attributs
    int idMur;
    Coin debut, fin;
    int nbPortes;
    int nbFenetres;
    ArrayList<Revêtement> listeRevetements;
    
    // Constructeur
    Mur(int id, Coin dc, Coin fc)
    {
        this.idMur=id;
        this.debut=dc;
        this.fin=fc;
        this.listeRevetements = new ArrayList<Revêtement>();
    }
    
  /*  void afficher()
    {System.out.println("==== Mur =====");
        this.debut.afficher();
        this.fin.afficher();    
    }*/
    double longueur()
    {
        return(Math.sqrt((this.fin.cx-this.debut.cx)*(this.fin.cx-this.debut.cx) + (this.fin.cy-this.debut.cy)*(this.fin.cy-this.debut.cy)));
    }
    
    double surface()
    {
        System.out.println("\nEntrer la Hauteur du mur (hauteur sous-plafond)");
        double hsp=Lire.d();
        return(this.longueur()*hsp);
    }
    
    public double prixrevetement_m()
    {
        double prix = 0;
        for(int i = 0; i<listeRevetements.size();i++)
        {  
            prix += this.listeRevetements.get(0).prixUnitaire*this.surface();
        }
       return prix; 
    }
    
    /**DESSINER SEGMENT (MUR)
     * voir classe segment du prof
     */
}
//nbrePortes : int 
//nbreFenetres :int 
//listeRevetements: List 
//montantRevetement()

