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

public class Sol {
    
    // Attributs
    int idSol;
    List<Coin> listeCoin;
    List<Revêtement> listeRevetements;
    
    // Constructeur
    public Sol(int id, List<Coin> coins, List<Revêtement> revetements) {
        this.idSol = id;
        this.listeCoin = coins;
        this.listeRevetements = revetements;
    }
    
    // Méthodes
    public void Afficher() {
        System.out.println("---- Sol ----");
        for (Coin c : this.listeCoin) {
            c.afficher();
        }
    }
    
    public String ToString() {
        String result = "Sol " + this.idSol + " : ";
        for (Coin c : this.listeCoin) {
            result = result + "(" + c.cx + ", " + c.cy + ") ";
        }
        return result;
    }
    
    public double Surface() {}
  
    }
