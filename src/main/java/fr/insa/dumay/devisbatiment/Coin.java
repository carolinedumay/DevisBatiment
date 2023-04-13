/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment;

/**
 *
 * @author Amadou Coulibaly
 */
public class Coin {
    
    // Attributs
    int idCoin;
    double cx;
    double cy;
    
    // Constructeur
    Coin(int id, double x, double y)
    {
      this.idCoin=id;
      this.cx=x;
      this.cy=y;
    }
   
    void afficher()
    {
        System.out.println(" Coin : id ="+this.idCoin+" abscisse = "+this.cx+ " Ordonnée ="+this.cy);
    }
            
}
