/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package fr.insa.dumay.devisbatiment;
import java.util.ArrayList;
/**
 *
 * @author cdumay01
 */
public class DevisBatiment {
    
    public static void Menu(int menu, String[][] action)
    {
        System.out.println();
        System.out.println(action[menu][0]);
        System.out.println();
        for(int i=1; i<action[menu].length;i++)
        {
            System.out.println(i-1+". "+action[menu][i]);
        }
        
    }
    
    public static Batiment Charger(Batiment batiment)
    {
        System.out.println("Entrez le nom du batiment");
        String Nom = Lire.S();
        if(!(Nom.contains(".txt")))
        {
            Nom = Nom + ".txt";
        }
        batiment.idBatiment = Nom;
        batiment.charger();
        return batiment;
    }
    public static void Sauvegarder(Batiment batiment)
    {
        System.out.println("Le nom actuel du fichier est "+batiment.idBatiment);
        System.out.println("Voulez vous le modifiez ? (Oui: O ; Non : N)");
        char R = Lire.c();
        while((R!='O')&&(R!='N'))
        {
            System.out.println("Entrez une réponse valable");
            R=Lire.c();
        }
        if(R=='O')
        {
            System.out.print("Nom : ");
            String Nom = Lire.S();
            batiment.idBatiment = Nom;
        }
        batiment.sauvegarder();

    }
    
    public static void Devis(Batiment batiment)
    {
        System.out.println();
        System.out.println("Devis");
        System.out.println();
        System.out.println(batiment.devisBatiment());
        String S = Lire.S();
    }
    
    public static int ChoixNiveau(Batiment batiment)
    {
        if(batiment.listeNiveaux.isEmpty())
        {
            System.out.println(" Il n'y a pas de niveau disponible");
            return -1;
        }
        for(Niveau niveau : batiment.listeNiveaux)
        {
            System.out.println(niveau);
        }
        System.out.println("Entrez l'indice du niveau choisi");
        int id = Lire.i();
        Boolean IDValid = false;
        while(!(IDValid))
        {    
            for(Niveau niveau : batiment.listeNiveaux)
            {
                if(id==niveau.idNiveau)
                {
                    System.out.println("Le niveau "+id+" a été choisi");
                    return batiment.listeNiveaux.indexOf(niveau);
                }
            }
            System.out.println("Entrez un indice indice valide");
            id = Lire.i();
        }
        return 0;
    }
    
    public static int EntrezIDNiveau(Boolean AOS,Batiment batiment)//AOS : ADD Or Suppr (ADD=true; Suppr=false) 
    {
        for(Niveau niveau : batiment.listeNiveaux)
        {
            System.out.println(niveau);
        }
        
        Boolean IsValid = !AOS;
        System.out.println();
        System.out.println("Laisser vide pour annuler");
        System.out.print("Entrez un id : ");
        String id = Lire.S();
        System.out.println();
        if(id.isBlank())
        {
            return -1;
        }
        while(((Integer.parseInt(id)<0)||(!IsValid==AOS)))
        {
            IsValid = AOS;
            if(Integer.parseInt(id)<0)
            {
                System.out.print("Entrez un id valide (positif) : ");
                id = Lire.S();
                if(id.isBlank())
                {
                    return -1;
                }
            }
            for(Niveau niveau : batiment.listeNiveaux)
            {
                if(Integer.parseInt(id)==niveau.idNiveau)
                {   
                    IsValid=AOS;
                    if(AOS)
                    {   
                        IsValid=!AOS;
                        System.out.println("Cet id est deja pris");
                        System.out.print("Entrez un id valide (positif) : ");
                        id = Lire.S();
                        if(id.isBlank())
                        {
                            return -1;
                        }
                    }
                    
                }
            }
        }
            
        return Integer.parseInt(id);
    }
    public static int EntrezIDPiece(Boolean AOS,Batiment batiment,int Niveau)//AOS : ADD Or Suppr (ADD=true; Suppr=false) 
    {   
        for(Piece piece : batiment.listeNiveaux.get(Niveau).listeappartements.get(0).listePieces)
        {
            System.out.println(piece);
        }
        
        Boolean IsValid = !AOS;
        System.out.println();
        System.out.println("Laisser vide pour annuler");
        System.out.print("Entrez un id : ");
        String id = Lire.S();
        System.out.println();
        if(id.isBlank())
        {
            return -1;
        }
        while(((Integer.parseInt(id)<0)||(!IsValid==AOS)))
        {
            IsValid = AOS;
            if(Integer.parseInt(id)<0)
            {
                System.out.print("Entrez un id valide (positif) : ");
                id = Lire.S();
                if(id.isBlank())
                {
                    return -1;
                }
            }
            for(Piece piece : batiment.listeNiveaux.get(Niveau).listeappartements.get(0).listePieces)
            {
                if(Integer.parseInt(id)==piece.idPiece)
                {   
                    IsValid=AOS;
                    if(AOS)
                    {   
                        IsValid=!AOS;
                        System.out.println("Cet id est deja pris");
                        System.out.print("Entrez un id valide (positif) : ");
                        id = Lire.S();
                        if(id.isBlank())
                        {
                            return -1;
                        }
                    }
                }
            }
        }
            
        return Integer.parseInt(id);
    }
    
    public static double EntrezDoublePositif(String valeur)
    {
        System.out.println();
        System.out.println("Laisser vide pour annuler");
        System.out.print("Entrez "+valeur+" : ");
        String D = Lire.S();
        System.out.println();
        if(D.isBlank())
        {
            return -1;
        } 
        while((Double.parseDouble(D)<0))
        {
            System.out.print("Entrez "+valeur+" valide (positif) : ");
            D = Lire.S();
            if(D.isBlank())
            {
                return -1;
            } 
        }
           
        return Double.parseDouble(D);
    }
    
    public static Piece ADDPiece(Batiment batiment, int Niveau,int idmincoin,int idminmur,int idminsol,int idminplafond)
    {
        int id = EntrezIDPiece(true,batiment,Niveau);
        System.out.println();
        System.out.println("Pour le point en bas à gauche de la piece");
        System.out.println("Entrez l'abscisse du point");
        double X = Lire.d();
        System.out.println("Entrez l'ordonnée du point");
        double Y = Lire.d();
        System.out.println("Entrez la longueur de la piece sur l'axe des abscisses");
        double LA = Lire.d();
        System.out.println("Entrez la longueur de la piece sur l'axe des ordonnées");
        double LO = Lire.d();
        Coin A = new Coin(idmincoin,X,Y);
        Coin B = new Coin(idmincoin+1,X+LA,Y);
        Coin C = new Coin(idmincoin+2,X+LA,Y+LO);
        Coin D = new Coin(idmincoin+3,X,Y+LO);
        
        for(Piece piece : batiment.listeNiveaux.get(Niveau).listeappartements.get(0).listePieces)
        {
            for(Coin coin : piece.sol.listeCoin)
            {
                if(A.cx==coin.cx && A.cy ==coin.cy)
                {
                   A=coin; 
                }
                if(B.cx==coin.cx && B.cy ==coin.cy)
                {
                   B=coin; 
                }
                if(C.cx==coin.cx && C.cy ==coin.cy)
                {
                   C=coin; 
                }
                if(D.cx==coin.cx && D.cy ==coin.cy)
                {
                   D=coin; 
                }
            }
        }
        Mur E = new Mur(idminmur,A,B);
        Mur F = new Mur(idminmur+1,B,C);
        Mur G = new Mur(idminmur+2,C,D);
        Mur H = new Mur(idminmur+3,D,A);
        
        for(Piece piece : batiment.listeNiveaux.get(Niveau).listeappartements.get(0).listePieces)
        {
            for(Mur mur : piece.listeMurs)
            {
                if(((E.debut == mur.debut) && (E.fin == mur.fin))||((E.fin==mur.debut)&&(E.debut==mur.fin)))
                {
                   E=mur; 
                }
                if(((F.debut == mur.debut) && (F.fin == mur.fin))||((F.fin==mur.debut)&&(F.debut==mur.fin)))
                {
                   F=mur; 
                }
                if(((G.debut == mur.debut) && (G.fin == mur.fin))||((G.fin==mur.debut)&&(G.debut==mur.fin)))
                {
                   G=mur; 
                }
                if(((H.debut == mur.debut) && (H.fin == mur.fin))||((H.fin==mur.debut)&&(H.debut==mur.fin)))
                {
                   H=mur; 
                }
            }
        }
        ArrayList<Coin> Lcoin = new ArrayList<Coin>();
        Lcoin.add(A);
        Lcoin.add(B);
        Lcoin.add(C);
        Lcoin.add(D);
        Sol S = new Sol(idminsol,Lcoin);
        Plafond Pla = new Plafond(idminplafond,Lcoin);
        ArrayList<Mur> Lmur = new ArrayList<Mur>();
        Lmur.add(E);
        Lmur.add(F);
        Lmur.add(G);
        Lmur.add(H);
        
        return new Piece(id, S, Pla,Lmur);
        
        
     }

    public static int ChoixPiece(Batiment batiment, int Niveau)
    {
        if(batiment.listeNiveaux.isEmpty())
        {
            System.out.println(" Il n'y a pas de Niveau disponible");
            return -1;
        }
        if(batiment.listeNiveaux.get(Niveau).listeappartements.get(0).listePieces.isEmpty())
        {
            System.out.println(" Il n'y a pas de Piece disponible");
            return -1;
        }
        for(Piece piece : batiment.listeNiveaux.get(Niveau).listeappartements.get(0).listePieces)
        {
            System.out.println(piece);
        }
        System.out.println("Entrez l'indice de la piece choisi");
        int id = Lire.i();
        Boolean IDValid = false;
        while(!(IDValid))
        {    
            for(Piece piece: batiment.listeNiveaux.get(Niveau).listeappartements.get(0).listePieces)
            {
                if(id==piece.idPiece)
                {
                    System.out.println("La piece "+id+" a été choisi");
                    return batiment.listeNiveaux.get(Niveau).listeappartements.get(0).listePieces.indexOf(piece);
                }
            }
            System.out.println("Entrez un indice indice valide");
            id = Lire.i();
        }
        return 0;
    }
    
        public static int ChoixMur(Batiment batiment, int Niveau, int Piece)
    {
        if(batiment.listeNiveaux.isEmpty())
        {
            System.out.println(" Il n'y a pas de Niveau disponible");
            return -1;
        }
        if(batiment.listeNiveaux.get(Niveau).listeappartements.get(0).listePieces.isEmpty())
        {
            System.out.println(" Il n'y a pas de Piece disponible");
            return -1;
        }
        if(batiment.listeNiveaux.get(Niveau).listeappartements.get(0).listePieces.get(Piece).listeMurs.isEmpty())
        {
            System.out.println(" Il n'y a pas de Mur disponible");
            return -1;
        }
        for(Mur mur : batiment.listeNiveaux.get(Niveau).listeappartements.get(0).listePieces.get(Piece).listeMurs)
        {
            System.out.println(mur);
        }
        System.out.println("Entrez l'indice du Mur choisi");
        int id = Lire.i();
        Boolean IDValid = false;
        while(!(IDValid))
        {    
            for(Mur mur : batiment.listeNiveaux.get(Niveau).listeappartements.get(0).listePieces.get(Piece).listeMurs)
            {
                if(id==mur.idMur)
                {
                    System.out.println("Le mur "+id+" a été choisi");
                    return batiment.listeNiveaux.get(Niveau).listeappartements.get(0).listePieces.get(Piece).listeMurs.indexOf(mur);
                }
            }
            System.out.println("Entrez un indice indice valide");
            id = Lire.i();
        }
        return 0;
    }
    
    public static Revêtement ChoixRevet(String type, ArrayList<Revêtement> r)
    {
        System.out.println();
        for(Revêtement revet : r)
        {
            if(((type.equals("Sol"))&& (revet.pourSol==true))||((type.equals("Plafond"))&& (revet.pourPlafond==true))||((type.equals("Mur"))&& (revet.pourMur==true)))
            {
                System.out.println(revet);
            }
        }
        System.out.println("Entrez l'indice du Revêtement choisi");
        int id = Lire.i();
        Boolean IDValid = false;
        while(!(IDValid))
        {    
            for(Revêtement revet : r)
            {
                if(((type.equals("Sol"))&& (revet.pourSol==true))||((type.equals("Plafond"))&& (revet.pourPlafond==true))||((type.equals("Mur"))&& (revet.pourMur==true)))
                {
                    if(id==revet.idRevetement)
                    {
                       System.out.println(" "+revet.designation +" a été choisi");
                       return revet;
                    }
                }
            }
            System.out.println("Entrez un indice indice valide");
            id = Lire.i();
        }
        return null;
    }
    public static int ChoixSupprRevetMur(Batiment batiment, int Niveau, int Piece,int Mur)
    {
        
        for(Revêtement revet : batiment.listeNiveaux.get(Niveau).listeappartements.get(0).listePieces.get(Piece).listeMurs.get(Mur).listeRevetements)
        {
            System.out.println(revet);
        }
        System.out.println("Entrez l'indice du Revêtement choisi");
        int id = Lire.i();
        Boolean IDValid = false;
        while(!(IDValid))
        {    
            for(Revêtement revet: batiment.listeNiveaux.get(Niveau).listeappartements.get(0).listePieces.get(Piece).listeMurs.get(Mur).listeRevetements)
            {
                if(id==revet.idRevetement)
                {
                    System.out.println(" "+revet.designation+" a été choisi");
                    return batiment.listeNiveaux.get(Niveau).listeappartements.get(0).listePieces.get(Piece).listeMurs.get(Mur).listeRevetements.indexOf(revet);
                }
            }
            System.out.println("Entrez un indice indice valide");
            id = Lire.i();
        }
        return 0;
    }
    public static void main(String[] args) {
        
        Batiment batiment = new Batiment("Nouveau",new ArrayList<Niveau>());
        Revêtement Revet;
        ArrayList<Revêtement> R = Revêtement.lireRevêtements();
        
        Boolean Exit = false;
        Boolean MenuChange = true;
        
        int Menu = 0;
        int PosNiveau = 0;// refert à la position du niveau dans la liste du batiment
        int PosPieceChoisi = 0;
        int PosMurChoisi = 0;
                
        int Interaction;
        int IndiceMinCoin = 0;
        int IndiceMinMur = 0;
        int IndiceMinSol = 0;
        int IndiceMinPlafond = 0;
        
        
        //String[][] Action = new String[9][9];
                            //titre, action0 ,   action1   ,   action2  ,  Action3   ,Action4,Action5
        String[][] Action= {{"Menu","Charger","Sauvegarder","Construire","Revetement","Devis","Fermer"},
                            {"Construire","Niveau","Piece","Retour"},
                            {"Niveau","Selection Niveau","Ajouter Niveau", "Suprimer Niveau","Retour"},
                            {"Piece","Ajouter Piece","Suprimer Piece","Retour"},
                            {"Revêtement","Mur","Plafond","Sol","Retour"},
                            {"Mur","Ajouter Revêtement","Supprimer Revêtment","Ajouter Porte","Ajouter Fenêtre","Supprimer Porte","Supprimer Fenêtre","Retour"},
                            {"Retour"},
                            {"Retour"}};
        //Orienté de cette facon pour mieux y voir//
        
        
        System.out.println("//////////démarage//////////");
        
        while(!Exit)
        {   
            if(MenuChange)
            {
                Menu(Menu,Action);
                MenuChange = false;
            }
            Interaction=Lire.i();
            
            switch(Menu)
            {
                case 0://Menu
                    switch(Interaction)
                    {
                        case 0:
                            
                            batiment = Charger(batiment);
                            IndiceMinCoin = 0;//on remet ces valeurs à zéro pour qu'après les opérations suivantes les valeurs ne soient pas trop élevés
                            IndiceMinMur = 0;
                            IndiceMinSol = 0;
                            IndiceMinPlafond = 0;
                            for(Niveau niveau : batiment.listeNiveaux)
                            {
                                for(Piece piece : niveau.listeappartements.get(0).listePieces)
                                {
                                    for(Coin coin : piece.sol.listeCoin)
                                    {
                                        IndiceMinCoin +=1;
                                    }
                                    for(Mur mur : piece.listeMurs)
                                    {
                                        IndiceMinMur+=1;
                                    }
                                    IndiceMinSol+=1;
                                    IndiceMinPlafond+=1;
                                }
                            }
                            //System.out.print(batiment);
                            MenuChange =true;
                            break;
                        case 1:
                            Sauvegarder(batiment);
                            MenuChange=true;
                            break;
                        case 2:
                            Menu = 1;
                            MenuChange=true;
                            break;
                        case 3:
                            PosPieceChoisi = ChoixPiece(batiment,PosNiveau);
                            if(PosPieceChoisi<0)
                            {
                                MenuChange=true;
                                break;
                            }
                            Menu = 4;
                            MenuChange=true;
                            break;
                        case 4:
                            Devis(batiment);
                            MenuChange =true;
                            break;
                        case 5:
                            Exit =true;
                            break;
                        case 6:
                            
                            break;
                        case 7:
                            
                            break;
                        case 8:
                            
                            break;
                        case 9:
                            
                            break;
                        default:
                            System.out.println("\\\\Action non prise en charge////");
                            MenuChange = true;
                    }
                    break;
                case 1://Construire
                    switch(Interaction)
                    {
                        case 0:
                            Menu = 2;
                            MenuChange=true;
                            break;
                        case 1:
                            Menu = 3;
                            MenuChange=true;
                            break;
                        case 2:
                            Menu = 0;
                            MenuChange=true;
                            break;
                        case 3:
                           
                            break;
                        case 4:
                            
                            break;
                        case 5:
                           
                            break;
                        case 6:
                            
                            break;
                        case 7:
                            
                            break;
                        case 8:
                            
                            break;
                        case 9:
                            
                            break;
                        default:
                            System.out.println("\\\\Action non prise en charge////");
                            MenuChange = true;
                    }
                    break;
                case 2://Niveau
                    switch(Interaction)
                    {
                        case 0:
                            //Selection Niveau
                            PosNiveau = ChoixNiveau(batiment); 
                            MenuChange =true;
                            break;
                        case 1:
                            //Ajouter Niveau
                            int idADD= EntrezIDNiveau(true,batiment);//add is true
                            if(idADD<0)
                            {   
                                MenuChange =true;
                                break;
                            }
                            
                            double H = EntrezDoublePositif("une hauteur");
                            if(H<0)
                            {
                                MenuChange =true;
                                break;
                            }
                            ArrayList<Appartement> AppartementADD = new ArrayList<Appartement>();
                            AppartementADD.add(new Appartement(0,idADD,new ArrayList<Piece>()));
                            Niveau NiveauADD =new Niveau(idADD,H,AppartementADD);
                            batiment.listeNiveaux.add(NiveauADD);
                            PosNiveau = batiment.listeNiveaux.indexOf(NiveauADD);
                            System.out.println("Niveau "+idADD+" ajouté");
                            MenuChange =true;
                            break;
                        case 2:
                            //Suprimer Niveau
                            if(batiment.listeNiveaux.isEmpty())
                            {
                                System.out.println("Il n'y a pas de niveau");
                                MenuChange =true;
                                break;
                            }
                            int idSuppr = EntrezIDNiveau(false,batiment);//suppr is false
                            int PosNiveauSuppr=0;
                            if(idSuppr<0)
                            {
                                MenuChange =true;
                                break;
                            }
                            for(Niveau niveau : batiment.listeNiveaux)
                            {
                                if(idSuppr==niveau.idNiveau)
                                {
                                     PosNiveauSuppr= batiment.listeNiveaux.indexOf(niveau);
                                }
                            }
                            batiment.listeNiveaux.remove(PosNiveauSuppr);
                            System.out.println("Niveau "+idSuppr+" supprimé");
                            MenuChange =true;
                            break;
                        case 3:
                            //retour
                            Menu = 1;
                            MenuChange=true;
                            break;
                        case 4:
                            
                            break;
                        case 5:
                           
                            break;
                        case 6:
                            
                            break;
                        case 7:
                            
                            break;
                        case 8:
                            
                            break;
                        case 9:
                            
                            break;
                        default:
                            System.out.println("\\\\Action non prise en charge////");
                            MenuChange = true;
                    }
                    break;
                case 3://Piece
                    switch(Interaction)
                    {
                        case 0:
                            //ajouter piece
                            Piece pieceADD = ADDPiece(batiment,PosNiveau,IndiceMinCoin,IndiceMinMur,IndiceMinSol,IndiceMinPlafond);
                            batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.add(pieceADD);
                            
                            IndiceMinCoin+=4;//on ajoute au max 4 coins donc pas de problèmme avec les indices
                            IndiceMinMur+=4;//meme chose que pour les coins
                            IndiceMinSol+=1;//seul un plafond est ajouter ici 
                            IndiceMinPlafond+=1;//meme chose que pour le sol
                            MenuChange = true;
                            break;
                        case 1:
                            //supprimer piece
                            if(batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.isEmpty())
                            {
                                System.out.println("Il n'y a pas de pieces");
                                MenuChange =true;
                                break;
                            }
                            int idSupprPiece = EntrezIDPiece(false,batiment,PosNiveau);//suppr is false
                            int PosPieceSuppr = 0;
                            if(idSupprPiece<0)
                            {
                                MenuChange =true;
                                break;
                            }
                            for(Piece piece : batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces)
                            {
                                if(idSupprPiece==piece.idPiece)
                                {
                                     PosPieceSuppr= batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.indexOf(piece);
                                }
                            }
                            batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.remove(PosPieceSuppr);
                            System.out.println("Piece "+idSupprPiece+" supprimé");
                            MenuChange =true;
                            break;
                        case 2:
                            //retour
                            Menu = 1;
                            MenuChange =true;
                            break;
                        case 3:
                            
                            break;
                        case 4:
                            
                            break;
                        case 5:
                           
                            break;
                        case 6:
                            
                            break;
                        case 7:
                            
                            break;
                        case 8:
                            
                            break;
                        case 9:
                            
                            break;
                        default:
                            System.out.println("\\\\Action non prise en charge////");
                            MenuChange = true;
                    }
                    break;
                case 4://Revetement
                    switch(Interaction)
                    {
                        case 0:
                            PosMurChoisi = ChoixMur(batiment,PosNiveau,PosPieceChoisi);
                            if(PosMurChoisi<0)
                            {
                                MenuChange=true;
                                break;
                            }
                            Menu = 5;
                            MenuChange=true;
                            break;
                        case 1:
                            //revetement plafond
                            Revet = ChoixRevet("Plafond",R);
                            batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.get(PosPieceChoisi).plafond.listeRevetements.clear();
                            batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.get(PosPieceChoisi).plafond.listeRevetements.add(Revet);
                            MenuChange=true;
                            break;
                        case 2:
                            //revetment sol
                            Revet = ChoixRevet("Sol",R);
                            batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.get(PosPieceChoisi).sol.listeRevetements.clear();
                            batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.get(PosPieceChoisi).sol.listeRevetements.add(Revet);
                            MenuChange=true;
                            break;
                        case 3:
                            //retour
                            Menu = 0;
                            MenuChange=true;
                            break;
                        case 4:
                            
                            break;
                        case 5:
                           
                            break;
                        case 6:
                            
                            break;
                        case 7:
                            
                            break;
                        case 8:
                            
                            break;
                        case 9:
                            
                            break;
                        default:
                            System.out.println("\\\\Action non prise en charge////");
                            MenuChange = true;
                    }
                    break;
                case 5://Mur Revetement, Porte et Fenetre
                    switch(Interaction)
                    {
                        case 0:
                            //ajouter revetement
                            if(batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.get(PosPieceChoisi).listeMurs.get(PosMurChoisi).listeRevetements.size()>=2)
                            {
                                System.out.println("Le maximum de revêtement pour ce mur est dejà atteint");
                                MenuChange =true;
                                break;
                            }
                            Revet = ChoixRevet("Mur",R);
                            batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.get(PosPieceChoisi).listeMurs.get(PosMurChoisi).listeRevetements.add(Revet);
                            MenuChange=true;
                            break;
                        case 1:
                            //suprimer revetement
                            if(batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.get(PosPieceChoisi).listeMurs.get(PosMurChoisi).listeRevetements.isEmpty())
                            {
                                System.out.println("Il n'y a pas de revetement à supprimer sur ce mur");
                                MenuChange =true;
                                break;
                            }
                            int indRevetSuppr = ChoixSupprRevetMur(batiment,PosNiveau,PosPieceChoisi,PosMurChoisi);
                            batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.get(PosPieceChoisi).listeMurs.get(PosMurChoisi).listeRevetements.remove(indRevetSuppr);
                            MenuChange=true;
                            
                            break;
                        case 2:
                            //ajouter porte
                            System.out.println("Il y a "+batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.get(PosPieceChoisi).listeMurs.get(PosMurChoisi).nbPortes+" portes sur ce mur");
                            batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.get(PosPieceChoisi).listeMurs.get(PosMurChoisi).nbPortes +=1; 
                            break;
                        case 3:
                            //ajouter fenetre
                            System.out.println("Il y a "+batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.get(PosPieceChoisi).listeMurs.get(PosMurChoisi).nbFenetres+" fenetres sur ce mur");
                            batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.get(PosPieceChoisi).listeMurs.get(PosMurChoisi).nbFenetres += 1;
                            break;
                        case 4:
                            //suprimer porte
                            System.out.println("Il y a "+batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.get(PosPieceChoisi).listeMurs.get(PosMurChoisi).nbPortes+" portes sur ce mur");
                            if(batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.get(PosPieceChoisi).listeMurs.get(PosMurChoisi).nbPortes>0)
                            {
                                batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.get(PosPieceChoisi).listeMurs.get(PosMurChoisi).nbPortes -=1;
                            }
                            break;
                        case 5:
                            //suprimer fenetre
                            System.out.println("Il y a "+batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.get(PosPieceChoisi).listeMurs.get(PosMurChoisi).nbFenetres+" fenetres sur ce mur");
                            if(batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.get(PosPieceChoisi).listeMurs.get(PosMurChoisi).nbFenetres>0)
                            {
                                batiment.listeNiveaux.get(PosNiveau).listeappartements.get(0).listePieces.get(PosPieceChoisi).listeMurs.get(PosMurChoisi).nbFenetres -=1;
                            }
                            break;
                        case 6:
                            //retour
                            Menu = 4;
                            MenuChange=true;
                            break;
                        case 7:
                            
                            break;
                        case 8:
                            
                            break;
                        case 9:
                            
                            break;
                        default:
                            System.out.println("\\\\Action non prise en charge////");
                            MenuChange = true;
                    }
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                default:
                    System.out.println("\\\\Page non trouvé////");
                    System.out.println("Retour au menu...");
                    Menu = 0;
                    MenuChange = true;
            }

        }


    

            

        



            
        // Création d'un coin c1
       /* Coin c1;
        System.out.println(" Identifiant du Coin");
        int id=Lire.i();
        System.out.println(" Abscisse du Coin");
        double x=Lire.d();
        System.out.println(" OrdonnÃ©e du Coin");
        double y=Lire.d();
        c1=new Coin(id,x,y);
        
        // Pour afficher textuellement le coin c1
        c1.afficher();
                
         Coin c2;
         System.out.println(" Identifiant du Coin");
         id=Lire.i();
         System.out.println(" Abscisse du Coin");
         x=Lire.d();
         System.out.println(" OrdonnÃ©e du Coin");
         y=Lire.d();
         c2=new Coin(id,x,y);
         
         // Création d'un mur m1
         Mur m1;
         System.out.println(" Identifiant du Mur");
         id=Lire.i();
         m1=new Mur(id,c1,c2);
         m1.afficher();

         System.out.println("Longueur du mur ="+m1.longueur());
        
         //Formattage de l'affichage
       System.out.format("\nLongueur du mur =%.2f",m1.longueur());  
//         System.out.printf("\nLongueur du mur =%.3f\n",m1.longueur());
 /*         
// Exemple         
         double dval=7.1475;
         System.out.format("\nLongueur du mur =%.2f",dval);
         System.out.format("\nLongueur du mur =%.3f",dval);
         */
 
         // Calcul et affichage de la surface d'un mur
         //double surface=m1.surface();
         //System.out.println(m1.toString()+"\nSurface :"+m1.surface());
         //System.out.format("\nSurface :%.2f",m1.surface());
         //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHHHHHHHHHHHHHHHHHH
         /*
         Tremie a = new Tremie(1,1,1);
         Porte p = new Porte(2);
         Fenetre f = new Fenetre(3);
         System.out.println(a);
         System.out.println(f);
         System.out.println(p);
*/
         /*
         Coin a,b,c,d;
         a = new Coin(1,2,1);
         b = new Coin(2,4,1);
         c = new Coin(3,2,5);
         d = new Coin(4,5,5);
         Mur i,f,g,h;
         i= new Mur(1,a,b);
         f= new Mur(2,b,c);
         g= new Mur(3,c,d);
         h= new Mur(4,d,a);
         
         ArrayList<Coin> coins = new ArrayList<Coin>();
         coins.add(a);
         coins.add(b);
         coins.add(c);
         coins.add(d);
         ArrayList<Mur> murs = new ArrayList<Mur>();
         murs.add(i);
         murs.add(f);
         murs.add(g);
         murs.add(h);
         ArrayList<Revêtement> liste = new ArrayList<Revêtement>();
         
         Sol S =new Sol(1,coins);
         Plafond Pla = new Plafond(1,coins);
         
         S.listeRevetements.add(new Revêtement(1,"d",true,true,true,1.5));
         System.out.println(S.surface());
         Revêtement av = new Revêtement(1,"z",true,true,true,9.0);
         Pla.listeRevetements.add(av);
         ArrayList<Revêtement> test= new ArrayList<Revêtement>();
         Batiment B = new Batiment("ze");
         Piece p = new Piece(1,S,Pla,murs);
         
         ArrayList<Appartement> LA = new ArrayList<Appartement>();
         ArrayList<Piece> P = new ArrayList<Piece>();
         P.add(p);
         Appartement A = new Appartement(1,1,P);
         System.out.println(P);
         LA.add(A);
        // P.add(new Piece(1, new Sol()));
         Niveau N = new Niveau(1,1,LA);
         System.out.print(LA);
         
         B.listeNiveaux.add(N);
         System.out.println(B);
         B.sauvegarder();
        *//*
         Batiment B = new Batiment("dz");
         B.charger();
         System.out.print(B);
            */
        
        
        
    }
 }
