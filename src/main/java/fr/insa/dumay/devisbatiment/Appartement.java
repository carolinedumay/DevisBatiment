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
public class Appartement {
    /// Attributs ///
    int idAppartement;
    int idNiveauAppartement;
    ArrayList<Piece> listePieces;
    
    /// Constructeur ///
    Appartement(int IDA, int IDN, ArrayList<Piece> pieces)
    {
        this.idAppartement=IDA;
        this.idNiveauAppartement=IDN;
        this.listePieces=pieces;
    }
    
    /// Méthode ///
    
    //void afficher()
    //{
        
    //}
    
    public double surface()
    {
        double surface = 0;
    for (Piece pieces : listePieces){
        surface += pieces.Surface();
    } 
    return surface;
    }
    
    double montantRevetement()
    {
        return 0; // temporaire
    }

    @Override
    public String toString() {
        return "Appartement{" + "idAppartement=" + idAppartement + ", idNiveauAppartement=" + idNiveauAppartement + ", listePieces=" + listePieces + '}';
    }

    


   
    
    
    
    
}
