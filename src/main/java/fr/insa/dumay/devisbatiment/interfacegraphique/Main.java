/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.*;
/**
 *
 * @author julietteeee
 */
public class Main extends Application {

    
    @Override
    public void start(Stage stage) {
        var javaVersion = System.getProperty("java.version");
        var javafxVersion = System.getProperty("javafx.version");
      
        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        //var scene = new Scene(new StackPane(label), 640, 480);
        Scene scene = new Scene(new FOuverture(), 800,600);//format de la fenetre : 800x600
        stage.setScene(scene);
        stage.setTitle("azdqsxq");
          stage.show();
          stage.setTitle("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    public static void main(String[] args) {
        launch();
        
        //création du fichier texte batiment.txt
       /* try
        {
        BufferedWriter batiment=new BufferedWriter(new FileWriter("batiment.txt",true));
        batiment.write("Coin;1;5,26;16,25");
        batiment.newLine();
        batiment.write("Mur;1;1;2;");
        batiment.newLine();
        batiment.close();
        }
        catch(IOException erreur)
        {
            System.out.println("erreur fichier");
        }*/
        //Lecture du fichier texte catalogueRevetement.txt
        //recherche de revetement par désignation
        String designation="Peinture";
        String[] t;
        try
        {
            BufferedReader revetement=new BufferedReader(new FileReader("CatalogueRevetement.txt"));
            String lignelue="abc";
            while((lignelue=revetement.readLine())!=null)
                    {
                        t=lignelue.split(";");
                        if(t[0].equals(designation))
                        {
                        System.out.println(lignelue);
                        System.out.println("Prix unitaire:"+t[5]);// la position du prix unitaire est à t5
                        //conversion du prix en type de donnée double
                        double pu=Double.parseDouble(t[5]);
                        double surface=15;
                        double devisRevetement=surface*pu;
                        System.out.println("devis Revetement:"+devisRevetement);
                        }
                    }
            //revetement.readLine();
        }
        
        catch(IOException erreurLecture)
        {
            System.out.println("erreur de lecture du fichier");
        }
    }
}