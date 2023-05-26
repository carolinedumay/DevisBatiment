/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/**
 *
 * @author julietteeee
 */
public class DessinCanvas extends Pane {
    
    private MainPane main; //DC doit avoir accès au paneau principal  et donc au model et au controleur
    
    private Canvas realCanvas;
    
    public DessinCanvas(MainPane main){
        this.main = main;
        this.realCanvas = new Canvas(this.getWidth(), this.getHeight());//création du canvas
        this.getChildren().add(this.realCanvas); //on met le Canvas dans le Pane (getChildren = accéder au sous-composants d'un composant)
        
        this.realCanvas.heightProperty().bind(this.heightProperty());// la propriété de hauteur du Pane va être modifiée alors la prop de hauteur du Canvas est modifiée
        this.realCanvas.heightProperty().addListener((o) -> {
        System.out.println("w = " + this.realCanvas.getWidth()+ "et h = "+ this.realCanvas.getHeight()); //test pour voir la taille actuelle de la fenetre (on pourrait prendre celle du Pane mais on choisit celle du Canvas pour etre plus correct
            this.redrawAll();//à chaque fois que je modifie la taille de la fenetre, je redessine
        });
        this.realCanvas.widthProperty().bind(this.widthProperty());// la propriété de largeur du Pane va être modifiée alors la prop de hauteur du Canvas est modifiée
        this.realCanvas.widthProperty().addListener((o) -> {
            this.redrawAll();//à chaque fois que je modifie la taille de la fenetre, je redessine
        });
        this.realCanvas.setOnMouseClicked((t) -> {
            Controleur control = this.main.getControleur();
            control.clicDansZoneDessin(t);
        });
        this.redrawAll();
    }
    
    public void redrawAll(){ //on va surement avoir besoin de redessiner si on change la taille du canvas 
        GraphicsContext context = this.realCanvas.getGraphicsContext2D(); //c'est GraphicsContext qui va me servir à dessiner
        context.setFill(Color.PURPLE); //colorier en rouge
        context.fillRect(0,500,this.getWidth(),this.getHeight()); // coord 0 et 1 : (0,0) : coin haut gauche de la fenetre ; coord 2 et 3 : taille en x et en y
        //Groupe model = this.main.getModel(); //accéder aux figures au travers le panneau principal
       // model.dessine(context);
    }
            
}
