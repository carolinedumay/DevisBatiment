/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment                                                         ;

import java.util.ArrayList;
/**
 *
 * @author caroo
 */

public class Sol {
    
    // Attributs
    int idSol;
    ArrayList<Coin> listeCoin;
    ArrayList<Revêtement> listeRevetements;
    
    // Constructeur
    public Sol(int id, ArrayList<Coin> coins, ArrayList<Revêtement> revetements) {
        this.idSol = id;
        this.listeCoin = coins;
        this.listeRevetements = revetements;
    }
    
    // Méthodes
 /*   public void Afficher() {
        System.out.println("---- Sol ----");
        for (Coin c : this.listeCoin) {
            c.afficher();
        }
    }*/
    
    /*public String ToString() {
        String result = "Sol " + this.idSol + " : ";
        for (Coin c : this.listeCoin) {
            result = result + "(" + c.cx + ", " + c.cy + ") ";
        }
        return result;
    }*/
    
    public double Surface() 
    {
        //double a = listeCoin.get(0).cx;
        double a = Math.sqrt((Math.pow(listeCoin.get(0).cx - listeCoin.get(1).cx,2))+(Math.pow(listeCoin.get(0).cy-listeCoin.get(1).cy,2)));
        double b = Math.sqrt((Math.pow(listeCoin.get(1).cx - listeCoin.get(2).cx,2))+(Math.pow(listeCoin.get(1).cy-listeCoin.get(2).cy,2)));
        double c = Math.sqrt((Math.pow(listeCoin.get(2).cx - listeCoin.get(0).cx,2))+(Math.pow(listeCoin.get(2).cy-listeCoin.get(0).cy,2)));
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

    @Override
    public String toString() {
        return "Sol{" + "idSol=" + idSol + ", listeCoin=" + listeCoin + ", listeRevetements=" + listeRevetements + '}';
    }
    
}
