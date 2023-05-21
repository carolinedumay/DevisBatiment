/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

import java.util.ArrayList;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 *
 * @author juliette
 */
public class Controleur {
    
    private MainPane vue; //controleur peut accéder au panneau principal(à la vue, grace au MainPane)
    
    private int etat; 
    
    private double[] pos1 = new double[2];
    
    private List<Figure> selection;
    
    public Controleur(MainPane vue){
        this.vue = vue;
        this.selection = new ArrayList<>();
    }
    public void changeEtat(int nouvelEtat){
         if (nouvelEtat==20){
             //select
         } else if (nouvelEtat == 30){
              //creation de points
             this.vue.getbGrouper().setDisable(true);
             this.vue.getbCouleur().setDisable(true);         
         } else if (nouvelEtat == 40){
             //creation de segments etape 1
             this.vue.getbGrouper().setDisable(true);
             this.vue.getbCouleur().setDisable(true); 
         } else if (nouvelEtat == 41){
             //creation de segments etape 2
         }
         this.etat = nouvelEtat;
    }

    void clicDansZoneDessin(MouseEvent t) {
        if (this.etat == 20){
            Point pclic = new Point(t.getX(), t.getY());
            //pas de limite de distance entre le clic et l'object selectionné
            Figure proche = this.vue.getModel().plusProche(pclic, Double.MAX_VALUE);
            //il faut quand même prévoir le cas où le grp est vide
            // donc pas de plus proche
            if (proche != null){
                if (t.isShiftDown()){//s'il appuie sur shift on ajoute le + proche à la selection courante
                    this.selection.add(proche);
                } else if (t.isControlDown()){// si il appuie sur controle
                    if (this.selection.contains(proche)){ //si l'obj est déjà dans la selection, on l'enlève
                        this.selection.remove(proche);
                    } else {//sinon on ajoute l'obj à la selection
                        this.selection.add(proche);
                    }
                } else {//sinon si clic simple on enlève tout ce qu'il y a dans la selection et on la réduit à l'obj le plus proche
                    this.selection.clear();
                    this.selection.add(proche);
                }
                this.activeBoutonsSuivantSelection();
                this.vue.redrawAll();
            }
        } else if(this.etat == 30){
            double px = t.getX();
            double py = t.getY(); 
            Color col = Color.color(Math.random(),Math.random(),Math.random());
            Groupe model = this.vue.getModel();
            model.add(new Point(px, py, col));// col a un lien avec la couleur mais le .add bug quand on l'enlève
            this.vue.redrawAll();
        } else if (this.etat == 40){
            this.pos1[0] = t.getX();
            this.pos1[1] = t.getY();
            this.changeEtat(41);
        } else if (this.etat == 41){
            double px2 = t.getX();
            double py2 = t.getY();
            Color col = Color.color(Math.random(),Math.random(),Math.random());
            this.vue.getModel().add(
                    new Segment(new Point(this.pos1[0], this.pos1[1]),//coordonnées premier clic
                            new Point(px2,py2),col));//points du deuxième clic
            this.vue.redrawAll();
            this.changeEtat(40);
        }
        
        
        }
    
    void boutonSelect(ActionEvent t) {
        this.changeEtat(20);
    }
    
    void boutonPoints(ActionEvent t){
        this.changeEtat(30);
    }
    
    void boutonSegment(ActionEvent t){
        this.changeEtat(40);
    }
    
    private void activeBoutonsSuivantSelection(){
        if(this.selection.size()<2){
            this.vue.getbGrouper().setDisable(true);
        } else{
            this.vue.getbGrouper().setDisable(false);
        }
    }
    public List<Figure> getSelection(){
        return selection;
    }
    
    void boutonGrouper(ActionEvent t){
        if (this.etat == 20 && this.selection.size() >1){
            Groupe ssGroupe = this.vue.getModel().sousGroupe(selection);
            this.selection.clear();
            this.selection.add(ssGroupe);
            this.vue.redrawAll();
        }
    }
    
    void changeColor(Color value){ //idem par rapport à la couleur jsp quoi en faire
        if (this.etat == 20&& this.selection.size() > 0){
            for (Figure f : this.selection){
                f.changeCouleur(value);
            }
            this.vue.redrawAll();
        }
    }
}
