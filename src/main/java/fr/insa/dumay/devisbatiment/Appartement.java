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
    Appartement(int IDA, int IDN)
    {
        this.idAppartement=IDA;
        this.idNiveauAppartement=IDN;
    }
    
    /// Méthode ///
    
    void afficher()
    {
        
    }
    
    double surface()
    {
        return 0;//temporaire
    }
    
    double montantRevetement()
    {
        return 0; // temporaire
    }
    
    @Override
    public String toString()
    {
        return ""; //temporaire
    }
    
    
}
