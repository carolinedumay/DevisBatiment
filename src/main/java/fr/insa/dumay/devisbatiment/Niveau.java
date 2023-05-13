/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment;

import java.util.ArrayList;
/**
 *
 * @author mfanget01
 */
public class Niveau {
    /// Attributs ///
    int idNiveau;
    double hauteurSousPlafond;
    ArrayList<Appartement> listeappartements;
    
    /// Constructeurs ///
    
    Niveau(int ID, double H, ArrayList<Appartement> appart)
    {
        this.idNiveau = ID;
        this.hauteurSousPlafond = H;
        this.listeappartements=appart;
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
    public String toString() {
        return "Niveau{" + "idNiveau=" + idNiveau + ", hauteurSousPlafond=" + hauteurSousPlafond + ", listeappartements=" + listeappartements + '}';
    }

    
    
    
}
