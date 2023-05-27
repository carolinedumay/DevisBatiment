/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author caroo
 */
public class FCreerMur extends Stage {
    
    private TextField tfPx;
    private TextField tfPy;
    
    public FCreerMur(){
         
        //phrases
        Label phrasedebut = new Label("Vous pouvez créer un mur.");
        Label p1 = new Label("Rentrez les coordonnées du point 1 :");
        Label ab1 = new Label("Abscisse :          ");
        Label o1 = new Label("Ordonnée:        ");
        Label p2 = new Label("Rentrez les coordonnées du point 2 :");
        Label ab2 = new Label("Abscisse :          ");
        Label o2 = new Label("Ordonnée :       ");
        Label sep = new Label("----------------------------------------------------------");
        Label nbf = new Label("Quelle est le nombre de fenêtres sur ce mur ?        ");
        Label nbp = new Label("Quelle est le nombre de portes sur ce mur ?           ");
        Label ri = new Label("Revêtement intérieur :");
        Label re = new Label("Revêtement extérieur :");
        
        //champs pour rentrer du texte
        TextField textab1 = new TextField();
        textab1.setPromptText("Rentrez votre valeur.");
        TextField texto1 = new TextField();
        texto1.setPromptText("Rentrez votre valeur.");
        TextField texta2 = new TextField();
        texta2.setPromptText("Rentrez votre valeur.");
        TextField texto2 = new TextField();
        texto2.setPromptText("Rentrez votre valeur.");
        TextField textf = new TextField();
        textf.setPromptText("Rentrez votre valeur.");
        TextField textp = new TextField();
        textp.setPromptText("Rentrez votre valeur.");
        
        //positionnement de certaines fenêtres
        StackPane posph1 = new StackPane();
        posph1.getChildren().add(phrasedebut);
        StackPane.setAlignment(phrasedebut, Pos.TOP_CENTER);
        
        StackPane posp1 = new StackPane();
        posp1.getChildren().add(p1);
        StackPane.setAlignment(p1, Pos.CENTER_LEFT);
        
        StackPane posp2 = new StackPane();
        posp2.getChildren().add(p2);
        StackPane.setAlignment(p2, Pos.CENTER_LEFT);
        
        //menu déroulant
       List<String> revet = loadTextData("prixUnitaire2.txt");
        ComboBox<String> revetbox = new ComboBox<>();
        revetbox.getItems().addAll(revet);
        revetbox.setOnAction(event -> {
            String selectedValue = revetbox.getValue();
            System.out.println("Choix : " + selectedValue);
            });
        
        //positionnement, affichage
        HBox hbox0 = new HBox(posph1); 
        hbox0.setAlignment(Pos.TOP_CENTER);
        HBox hbox01= new HBox(posp1);
        hbox01.setAlignment(Pos.CENTER_LEFT);
        HBox hbox1 = new HBox();
        hbox1.getChildren().addAll(ab1,textab1);
        HBox hbox2 = new HBox();
        hbox2.getChildren().addAll(o1,texto1);
        HBox hbox02= new HBox(posp2);
        hbox02.setAlignment(Pos.CENTER_LEFT);
        HBox hbox3 = new HBox();
        hbox3.getChildren().addAll(ab2,texta2);
        HBox hbox4 = new HBox();
        hbox4.getChildren().addAll(o2,texto2);
        HBox hbox03 = new HBox();
        hbox03.getChildren().addAll(sep);
        HBox hbox5 = new HBox();
        hbox5.getChildren().addAll(nbf,textf);
        HBox hbox6 = new HBox();
        hbox6.getChildren().addAll(nbp,textp);
        HBox hbox04 = new HBox();
        hbox04.getChildren().addAll(sep);
        HBox hbox7 = new HBox();
        hbox7.getChildren().addAll(ri, revetbox, re, revetbox);
        
        //affichage final
        VBox vbox = new VBox();
        vbox.getChildren().addAll(hbox0,hbox01,hbox1,hbox2,hbox02,hbox3,hbox4, hbox03, hbox5, hbox6, hbox04, hbox7);
        vbox.setPadding(new Insets(10));
        
        //affichage fenêtre
        Scene scene = new Scene(vbox,500,300);
        this.setScene(scene);
        this.setTitle("Créer un mur");
    }
    //fonction pour menu déroulant
    private List<String> loadTextData(String prixUnitaire2) {
        List<String> revet = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("prixUnitaire2.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(";");
                if (columns.length > 1) {
                    revet.add(columns[1]); // Ajouter la deuxième colonne au jeu de données
                }
            }
        } catch (IOException e) {
        System.out.println("Erreur lors de la lecture du fichier de revêtements : " + e.getMessage());
        }
        return revet;
    }
}
