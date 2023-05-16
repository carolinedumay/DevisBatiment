/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment;

import java.util.List;

/**
 *
 * @author caroo
 */

public class Plafond {
    
    // Attributs
    int idPlafond;
    List<Coin> listeCoins;
    List<Revêtement> listeRevetements;
    
    // Constructeur
    public Plafond(int idPlafond, List<Coin> listeCoins, List<Revêtement> listeRevetements) {
        this.idPlafond = idPlafond;
        this.listeCoins = listeCoins;
        this.listeRevetements = listeRevetements;
    }
    
    // Méthode pour calculer la surface du plafond
    public double surface() 
    {
        double a = Math.sqrt((Math.pow(listeCoins.get(0).cx - listeCoins.get(1).cx,2))+(Math.pow(listeCoins.get(0).cy-listeCoins.get(1).cy,2)));
        double b = Math.sqrt((Math.pow(listeCoins.get(1).cx - listeCoins.get(2).cx,2))+(Math.pow(listeCoins.get(1).cy-listeCoins.get(2).cy,2)));
        double c = Math.sqrt((Math.pow(listeCoins.get(2).cx - listeCoins.get(0).cx,2))+(Math.pow(listeCoins.get(2).cy-listeCoins.get(0).cy,2)));
        if (a<b && c<b)
        {
            return a*c;
        }
        else if (a<c && b<c)
        {
            return a*b;            
        }
        else if (b<a && c<a)
        {
            return c*b;
        }
        
        return 0; //temporaire 
            
            }
    double prixrevetement_p()
    { 
        double prix = 0;
        for(int i = 0; i<listeRevetements.size();i++)
        {  
            prix += this.listeRevetements.get(0).prixUnitaire*this.surface();
        }
       return prix; 
    }
    // Méthode pour afficher les informations sur le plafond
    /*public String ToString() {
        String infop = "Plafond " + idPlafond + "\n:Coins :";
        for (Coin coin : listeCoins) {
            infop = infop + "  " + coin + " \n ";
        }
        infop = infop + "Revetements : " + listeRevetements + "\n";
        infop = infop + "Surface : " + surface() + " m²\n";
        return infop;
    }*/

    @Override
    public String toString() {
        return "Plafond{" + "idPlafond=" + idPlafond + ", listeCoins=" + listeCoins + ", listeRevetements=" + listeRevetements + '}';
    }
    
}