/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment;

/**
 *
 * @author mfanget01
 */
public class Niveau {
    /// Attributs ///
    int idNiveau;
    double hauteurSousPlafond;
    //Appartement ListeApparts[];
    
    /// Constructeurs ///
    
    Niveau(int ID, double H)
    {
        this.idNiveau = ID;
        this.hauteurSousPlafond = H;
    }
    
    
    /// Méthodes ///
    
    void afficher()
    {
        
    }
    
    double surface()
    {
    
        return 0; //temporaire
    }        
    double montantRevetement()
    {
        return 0; //temporaire
    }
    
    @Override 
    public String toString() //String ?
    {
        return  ""; //temporaire
    }
    
}
