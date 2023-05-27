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
        BufferedWriter batiment=new BufferedWriter(new FileWriter(this.idBatiment,false));
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
        ArrayList<Revêtement> R = Revêtement.lireRevêtements();
        String Init = "";//sert à initialisé P2
        String[] P1;
        String[] P2 = Init.split("");// on initialise P2 vide

        ArrayList<Coin> C = new ArrayList<Coin>();
        ArrayList<Sol> S = new ArrayList<Sol>();
        ArrayList<Plafond> Pla = new ArrayList<Plafond>();
        ArrayList<Mur> M = new ArrayList<Mur>();
        ArrayList<Piece> P = new ArrayList<Piece>();
        ArrayList<Appartement> A = new ArrayList<Appartement>(); 
        ArrayList<Niveau> N = new ArrayList<Niveau>();
        
        try
        {
            BufferedReader batiment=new BufferedReader(new FileReader(this.idBatiment));
            String Ligne;
            while((Ligne=batiment.readLine())!=null)
                    {   
                        P1=Ligne.split("/");
                        if(P1.length>1)
                        {
                            System.arraycopy(P1, 1, P2, 0, P1.length-1);
                        }
                        
                        P1=P1[0].split(";");
                        
                        ///Coin///
                        if(P1[0].equals("Coin"))
                        {
                            C.add((Integer.parseInt(P1[1])-1), new Coin(Integer.parseInt(P1[1]),Double.parseDouble(P1[2]),Double.parseDouble(P1[3])));
                        }
                        ///Coin///
                        
                        ///Sol///
                        if(P1[0].equals("Sol"))
                        {   
                            Sol sol = new Sol(Integer.parseInt(P1[1]),new ArrayList<Coin>());
                            for(int i=1;i<P1.length;i++)
                            {    
                                for(Coin c: C)
                                {
                                    if(c.idCoin == Integer.parseInt(P1[i]))
                                    {
                                        sol.listeCoin.add(c);
                                    }
                                }
                            }
                            for(int i=0;i<P2.length;i++)
                            {    
                                for(Revêtement r: R)
                                {
                                    if(r.idRevetement == Integer.parseInt(P2[i]))
                                    {
                                        sol.listeRevetements.add(r);
                                    }
                                }
                            }
                            S.add((Integer.parseInt(P1[1])-1),sol);
                        }
                        ///Sol///
                        
                        ///Plafond///
                        if(P1[0].equals("Plafond"))
                        {   
                            Plafond plafond = new Plafond(Integer.parseInt(P1[1]),new ArrayList<Coin>());
                            for(int i=1;i<P1.length;i++)
                            {    
                                for(Coin c: C)
                                {
                                    if(c.idCoin == Integer.parseInt(P1[i]))
                                    {
                                        plafond.listeCoins.add(c);
                                    }
                                }
                            }
                            for(int i=0;i<P2.length;i++)
                            {    
                                for(Revêtement r: R)
                                {
                                    if(r.idRevetement == Integer.parseInt(P2[i]))
                                    {
                                        plafond.listeRevetements.add(r);
                                    }
                                }
                            }
                            Pla.add((Integer.parseInt(P1[1])-1),plafond);
                        }
                        ///Plafond///
                        
                        ///Mur///
                        if(P1[0].equals("Mur"))
                        {
                            Coin cd = new Coin(0,0,0);
                            Coin cf = new Coin(0,0,0);
                            for(Coin c:C)
                            {
                                if(c.idCoin==Integer.parseInt(P1[2]))
                                {
                                    cd = c;
                                }
                                if(c.idCoin==Integer.parseInt(P1[3]))
                                {
                                    cf = c;
                                }
                            }
                            
                            Mur mur = new Mur(Integer.parseInt(P1[1]),cd,cf);
                            
                            mur.nbFenetres = Integer.parseInt(P1[4]);
                            mur.nbPortes =  Integer.parseInt(P1[5]);
                            
                            for(int i=0;i<P2.length;i++)
                            {    
                                for(Revêtement r: R)
                                {
                                    if(r.idRevetement == Integer.parseInt(P2[i]))
                                    {
                                        mur.listeRevetements.add(r);
                                    }
                                }
                            }
                            
                            
                            M.add((Integer.parseInt(P1[1])-1),mur);
                        }
                        ///Mur///
                           
                        ///Piece///
                        if(P1[0].equals("Piece"))
                        {
                            Sol sol = new Sol(0,new ArrayList<Coin>());
                            Plafond plafond =new Plafond(0,new ArrayList<Coin>());
                            for(Plafond pla : Pla)
                            {
                                if(pla.idPlafond==Integer.parseInt(P1[2]))
                                {
                                    plafond = pla;
                                }  
                            }
                            for(Sol s : S)
                            {
                                if(s.idSol==Integer.parseInt(P1[3]))
                                {
                                    sol = s;
                                }  
                            }
                            
                            Piece piece = new Piece(Integer.parseInt(P1[1]),sol,plafond,new ArrayList<Mur>());
                            
                            for(int i=4; i<P1.length;i++)
                            {
                                 for(Mur m : M)
                                 {
                                     if(m.idMur==Integer.parseInt(P1[i]))
                                     {
                                         piece.listeMurs.add(m);
                                     }
                                 }
                            }
                            
                            P.add((Integer.parseInt(P1[1])-1), piece);
                        }
                        ///Piece///
                        
                        ///Appartement///
                        if(P1[0].equals("Appartement"))
                        {
                            Appartement appart = new Appartement(Integer.parseInt(P1[1]),Integer.parseInt(P1[2]),new ArrayList<Piece>());
                            
                            for(int i=3; i<P1.length;i++)
                            {
                                 for(Piece p : P)
                                 {
                                     if(p.idPiece==Integer.parseInt(P1[i]))
                                     {
                                         appart.listePieces.add(p);
                                     }
                                 }
                            }
                            
                            A.add((Integer.parseInt(P1[1])-1), appart);
                        }
                        ///Appartement///
                        
                        ///Niveau///
                        if(P1[0].equals("Niveau"))
                        {
                            Niveau niveau = new Niveau(Integer.parseInt(P1[1]),Double.parseDouble(P1[2]), new ArrayList<Appartement>());
                            
                            for(int i=3;i<P1.length;i++)
                            {
                                for(Appartement a : A)
                                {
                                    if(a.idAppartement == Integer.parseInt(P1[i]))
                                    {
                                        niveau.listeappartements.add(a);
                                    }
                                }
                            }
                            
                            N.add((Integer.parseInt(P1[1])-1), niveau);
                        }
                        ///Niveau///
                        
                        ///Batiment///
                        if(P1[0].equals("Batiment"))
                        {
                            this.idBatiment=P1[1];
                            this.listeNiveaux = N;
                        }
                        ///Batiment///
                                 /*   
                        if(t[0].equals(designation))
                        {
                        System.out.println(lignelue);
                        System.out.println("Prix unitaire:"+t[5]);// la position du prix unitaire est à t5
                        //conversion du prix en type de donnée double
                        double pu=Double.parseDouble(t[5]);
                        double surface=15;
                        double devisRevetement=surface*pu;
                        System.out.println("devis Revetement:"+devisRevetement);
                        }*/
                    }
            //revetement.readLine();
        }
        
        catch(IOException erreurLecture)
        {
            System.out.println("erreur de lecture du fichier");
        }
    
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
