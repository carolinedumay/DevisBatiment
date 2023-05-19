/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author juliette
 */
public class Groupe extends Figure {
    
    private List<Figure> contient;
        
    //création d'un groupe vide
    public Groupe(){
        this.contient = new ArrayList<Figure>();//liste dans une interface : ArrayList
    }
    
    //ajout d'une figure au groupe et on dit que groupe de la figure c'est ce groupe là
    public void add(Figure f){
        if(f.getGroupe() != this){
            if (f.getGroupe() != null){//si la figure est deja dans un groupe (getGroupe!=null) et que ce n'est pas le groupe courant alors c'est une erreur
                throw new Error("figure déjà dans un autre groupe");
            }
            this.contient.add(f); //si figure n'est pas dans le groupe ni dans les autres groupes : ajout de la figure
            f.setGroupe(this);
        }
    }
    
    @Override
    public void dessine(GraphicsContext context){
        for(Figure f : this.contient){//pour chaque figure contenu dans ce groupe, je demande à la figure de dessiner
            f.dessine(context);
        }
    }
    
    
    
}
