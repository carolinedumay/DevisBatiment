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
public class Batiment {
    
/// Attributs ///
    String idBatiment;
    //Niveau listeNiveaux[];
    ArrayList<Niveau> listeNiveaux;
    
/// Constructeurs ///
    Batiment(String ID)
    {
        this.idBatiment = ID;
        //this.listeNiveaux= niveaux;
    }
    
/// Methodes ///  
    void sauvegarder()
    {
    
    }
    
    float devisBatiment() //float ?
    {
        return 0; //temporaire
    }        
            
    void Dessiner()
    {
        
    }

    @Override
    public String toString() {
        return "Batiment{" + "idBatiment=" + idBatiment + ", listeNiveaux=" + listeNiveaux + '}';
    }
    
}
