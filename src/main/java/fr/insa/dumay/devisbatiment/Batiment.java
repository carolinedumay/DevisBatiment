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
        ////Batiment////
        
        ////Niveaux////
        for(Niveau N : this.listeNiveaux)
        {
            ////Appartements////
            for(Appartement Appart : N.listeappartements)
            {
                ////Pieces////
                for(Piece piece : Appart.listePieces)
                {   
                    ///Coins///
                    for(Coin coin : piece.sol.listeCoin)//ecriture des coins
                    {
                        batiment.write("Coin;"+coin.idCoin+";"+coin.cx+";"+coin.cy);
                        batiment.newLine();
                    }
                    ///Coins///
                    
                    ///Sol///
                    batiment.write("Sol;"+piece.sol.idSol);
                    for(Coin coin : piece.sol.listeCoin)
                    {
                        batiment.write(";"+coin.idCoin); 
                    }
                    
                    for(Revêtement R : piece.sol.listeRevetements)
                    {
                        batiment.write("/"+R.idRevetement); 
                    }
                    batiment.newLine();
                    ///Sol///
                    
                    ///Plafond///
                    batiment.write("Plafond;"+piece.plafond.idPlafond);
                    for(Coin coin : piece.plafond.listeCoins)
                    {
                        batiment.write(";"+coin.idCoin); 
                    }
                    
                    for(Revêtement R : piece.plafond.listeRevetements)
                    {
                        batiment.write("/"+R.idRevetement); 
                    }
                    batiment.newLine();
                    ///Plafond///
                    
                    ///Murs///
                    for(Mur M : piece.listeMurs)
                    {
                        batiment.write("Mur;"+M.idMur+";"+M.debut.idCoin+";"+M.fin.idCoin+";"+M.nbFenetres+";"+M.nbPortes);
                        
                        for(Revêtement R : M.listeRevetements)
                        {
                            batiment.write("/"+R.idRevetement); 
                        }
                        batiment.newLine();
                    }
                    ///Murs///
                    
                    ///Piece///
                    batiment.write("Piece;"+piece.idPiece+";"+piece.plafond.idPlafond+";"+piece.sol.idSol);
                    for(Mur M : piece.listeMurs)
                    {
                        batiment.write(";"+M.idMur); 
                    }
                    batiment.newLine();
                    ///Piece///
                    
                }
                ////Pieces////
               
                ///Appartement///
                batiment.write("Appartement;"+Appart.idAppartement+";"+Appart.idNiveauAppartement);
                for(Piece P : Appart.listePieces)
                {
                    batiment.write(";"+P.idPiece); 
                }
                batiment.newLine();
                ///Appartement///
            }
            ////Appartements////
            
            ///Niveau///
            batiment.write("Niveau;"+N.idNiveau+";"+N.hauteurSousPlafond);
            for(Appartement A : N.listeappartements)
            {
                batiment.write(";"+A.idAppartement); 
            }
            batiment.newLine();
            ///Niveau///
            
        }
        ////Niveaux////
       
        ///Batiment///
        batiment.write("Batiment;"+this.idBatiment);
        for(Niveau N : this.listeNiveaux)
        {
            batiment.write(";"+N.idNiveau); 
        }
        ///Batiment///
        
        ////Batiment////
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
