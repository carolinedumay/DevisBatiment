/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment;
import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author mfanget01
 */
public class Batiment {
    
/// Attributs ///
    String idBatiment;
    //Niveau listeNiveaux[];
    ArrayList<Niveau> listeNiveaux;
    
/// Constructeurs ///
    Batiment(String ID, ArrayList<Niveau> listeNiveau)
    {
        this.idBatiment = ID;
        this.listeNiveaux= listeNiveau;
    }
    Batiment(String ID)
    {
        this.idBatiment = ID;
        this.listeNiveaux= new ArrayList<Niveau>();
    }
    
/// Methodes ///  
    void sauvegarder()
    {
         try
        {
        BufferedWriter batiment=new BufferedWriter(new FileWriter("batiment.txt",false));
        for(Niveau Niveau : listeNiveaux)
        {
            for(Appartement Appart : Niveau.listeappartements)
            {
                for(Piece piece : Appart.listePieces)
                {
                    for(Coin coin : piece.sol.listeCoin)
                    {
                        batiment.write("Coin;"+coin.idCoin+";"+coin.cx+";"+coin.cy);
            
        
                    }
            
        
                }
                batiment.write(Niveau.toString());
                batiment.newLine();
        
            }
            batiment.write(Niveau.toString());
            batiment.newLine();
        
        }
       
        batiment.close();
        }
        catch(IOException erreur)
        {
            System.out.println("erreur fichier");
        }
        
    }
    
    void charger()
    {
    
    
    }
    
    
    double devisBatiment() //float ?
    {
        double prix = 0;
       for (Niveau niveaux : listeNiveaux){
       prix += niveaux.montantRevetement();
       }
       return prix;
    }        
            
    void Dessiner()
    {
        
    }

    @Override
    public String toString() {
        return "Batiment{" + "idBatiment=" + idBatiment + ", listeNiveaux=" + listeNiveaux + '}';
    }
    
}
