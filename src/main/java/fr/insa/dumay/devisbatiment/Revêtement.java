/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment;

/**
 *
 * @author caroo
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Revêtement {
    int idRevetement;
    String designation;
    boolean pourMur;
    boolean pourSol;
    boolean pourPlafond;
    double prixUnitaire;

    public Revêtement(int id, String des, boolean pm, boolean ps, boolean pp, double pu) {
        this.idRevetement = id;
        this.designation = des;
        this.pourMur = pm;
        this.pourSol = ps;
        this.pourPlafond = pp;
        this.prixUnitaire = pu;
    }

    @Override
    public String toString() {
        return "Rev\u00eatement{" + "idRevetement=" + idRevetement + ", designation=" + designation + ", pourMur=" + pourMur + ", pourSol=" + pourSol + ", pourPlafond=" + pourPlafond + ", prixUnitaire=" + prixUnitaire + '}';
    }
    
        //liste de revêtements
    public static ArrayList<Revêtement> lireRevêtements() {
        ArrayList<Revêtement> revetements = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("prixUnitaires2.txt"))) {
            String lignelue;
            while ((lignelue = reader.readLine()) != null) { //? je sais pas quoi mettre pour que ça fonctionne correctement
                String[] champs = lignelue.split(";");//on extrait les informations de chaque ligne
                 
                if (!(champs[0].equals("idRevetement")))
                {       
                int id = Integer.parseInt(champs[0]);
                String designation = champs[1];//champs : éléments contenus dans une ligne de texte du fichier
                boolean pourMur = ((Integer.parseInt(champs[2]))==1);
                boolean pourSol = ((Integer.parseInt(champs[3]))==1);
                boolean pourPlafond = ((Integer.parseInt(champs[4]))==1);
                double prixUnitaire = Double.parseDouble(champs[5]);
                Revêtement revetement = new Revêtement(id, designation, pourMur, pourSol, pourPlafond, prixUnitaire);
                revetements.add(revetement);
                }
                
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier de revêtements : " + e.getMessage());
        }
        return revetements;
    }
}
