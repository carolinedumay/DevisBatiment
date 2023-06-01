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
    
    //void afficher()
    //{
        
    //}
    
    double surface()
    {
        double surface = 0;
    for (Appartement appart : listeappartements){
        surface += appart.surface();
    }
    return surface;
    } 
    
    double montantRevetement()//somme du prix de tous les revêtements de nivaux
    {
      
      double prix = 0;
       for (Appartement appartements : listeappartements){
           for(Piece piece: appartements.listePieces)
           {
               for(Mur mur : piece.listeMurs)
               {
                   for(Revêtement R : mur.listeRevetements)
                   {
                       prix+= (mur.longueur()*R.prixUnitaire*hauteurSousPlafond)- (mur.nbPortes*(new Porte(0).surface())) - (mur.nbFenetres*(new Fenetre(0).surface()));
                   }
                   
               }
               prix += piece.plafond.prixrevetement_p();
               prix += piece.sol.prixrevetement_s();
           }
           
           
           
       //prix += appartements.montantRevetement();
       }
       return prix;
    }

    @Override
    public String toString() {
        return "Niveau{" + "idNiveau=" + idNiveau + ", hauteurSousPlafond=" + hauteurSousPlafond + ", listeappartements=" + listeappartements + '}';
    }

    
    
    
}
