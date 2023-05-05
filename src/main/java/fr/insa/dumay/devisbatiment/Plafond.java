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
    public double surface() {}
    
    // Méthode pour afficher les informations sur le plafond
    public String ToString() {
        String infop = "Plafond " + idPlafond + "\n:Coins :";
        for (Coin coin : listeCoins) {
            infop = infop + "  " + coin + " \n ";
        }
        infop = infop + "Revetements : " + listeRevetements + "\n";
        infop = infop + "Surface : " + surface() + " m²\n";
        return infop;
    }
}