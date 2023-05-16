/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author juliette
 */
public class MainPane extends BorderPane {
    
    private Groupe Model; //ex du prof : model de données (groupe de figures dans son cas)
    private Controleur controleur; //garder un lien vers le controleur et aussi J'AI SELECTIONNE getModel et getControleur pour y avoir accès hors panneau principal
    
    private RadioButton rbSelect;
    private RadioButton rbPoints;
    private RadioButton rbSegments;
    
    private Button bGrouper;
    private Button bCouleur; 
    
    private DessinCanvas cDessin;
    private Groupe model;
    
    public MainPane(){
        this(new Groupe());
    }
    public MainPane(Groupe model){
        this.model = model;
        this.controleur = new Controleur(this);//le panneau principal accède au controleur ; on est dands MP donc le panneau principal c'est this
        this.rbSelect= new RadioButton("Select"); //pour selectionner seulement un bouton parmis n boutons)
        this.rbPoints= new RadioButton("Points");
        this.rbSegments= new RadioButton("Segments");
        
        VBox vbGauche = new VBox(this.rbSelect,this.rbPoints,this.rbSegments); //déclarer qui est dans la zone verticale de gauche
        this.setLeft(vbGauche); //mettre les membres de vbGauche à gauche
        
        this.bGrouper= new Button("Grouper"); //bouton simple
        this.bGrouper.setOnAction(new EventHandler<ActionEvent>(){ //setOn : changer le comportement du bouton concernant une certaine action ; eventHandler : l'utlisateur a cliqué/utlisé raccourci clavier pour selectionner le bouton
            @Override
            public void handle(ActionEvent t){
                System.out.println("Bouton Grouper cliqué"); //pour tester si le programme assimile que le bouton est cliqué
            }
        }); //dans les acolades c'est une classe locale qui définir les méthodes de EventHandle r
            
        
        this.bCouleur= new Button("Couleur");
        this.bCouleur.setOnMouseEntered(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent t){
                System.out.println("entered couleur en :" + t.getX() + "," + t.getY());
            }
        });
        VBox vbDroit = new VBox(this.bGrouper,this.bCouleur);
        this.setRight(vbDroit);
        
        this.cDessin = new DessinCanvas(this);
        this.setCenter(cDessin);
    }

    /**
     * @return the Model
     */
    public Groupe getModel() {
        return Model;
    }

    /**
     * @return the controleur
     */
    public Controleur getControleur() {
        return controleur;
    }
        
        
        
    }
