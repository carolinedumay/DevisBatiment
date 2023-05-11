/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package fr.insa.dumay.devisbatiment;

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
         
         Tremie a = new Tremie(1,1,1);
         Porte p = new Porte(2);
         Fenetre f = new Fenetre(3);
         System.out.println(a);
         System.out.println(f);
         System.out.println(p);
         
    }
 }
