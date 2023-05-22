/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

import javafx.scene.input.MouseEvent;

/**
 *
 * @author juliette
 */
public class Controleur {
    
    private MainPane vue; //controleur peut accéder au panneau principal(à la vue, grace au MainPane)
    
    private int etat; 
    
    public Controleur(MainPane vue){
        this.vue = vue;
    }
    public void changeEtat(int nouvelEtat){
         if (nouvelEtat==30){
             this.vue.getbGrouper().setDisable(true);
             this.vue.getbCouleur().setDisable(true);
                     
         }
    }

    void clicDansZoneDessin(MouseEvent t) {
        double px = t.getX();
        double py = t.getY();
        Color col = Color.color(Math.random(),Math.random(),Math.random());
        Groupe model = this.vue.getModel();
        model.add(new Point(px, py));// col a un lien avec la couleur mais le .add bug quand on l'enlève
        this.vue.redrawAll();
        }
}
