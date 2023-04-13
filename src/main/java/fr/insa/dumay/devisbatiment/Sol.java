/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment;

import java.util.ArrayList;



/**
 *
 * @author caroo
 */
public class Sol {
    
    //attributs
    int idSol;
    ArrayList<Coin> listecoins = new ArrayList<Coin>();
 
    //constructeurs
    Sol(int id, listecoins) {
        this.idSol = id;
        
    }
    void afficher()
    {System.out.println("==== Sol =====");
    }
}
