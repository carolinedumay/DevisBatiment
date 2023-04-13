/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment;
/**
 *
 * @author juliette
 */
public class Ouverture {
///comment faire choisir à l'utlisateur fenetre ou porte ?
    //Attribut
    int idOuverture;
    double dimX;
    double dimY;
            
    //Conctructeurs
    Ouverture (int id, double x, double y)
    {
    this.idOuverture=id;
    this.dimX=x;
    this.dimY=y;
    }
    
    //Méthodes
    void afficher()
    {
        //System.out.println(" Ouverture : id ="+this.idOuverture+" largueur = "+this.dimX+ " hauteur ="+this.dimY);
    }
        
    double surface()
    {
        return((this.dimX)*(this.dimY));
    }
    }
    
