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

    public static void main(String[] args) {
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
         Niveau N = new Niveau(2,1,LA);
         System.out.print(LA);
         
         B.listeNiveaux.add(N);
         System.out.println(B);
         B.sauvegarder();
               
    }
 }
