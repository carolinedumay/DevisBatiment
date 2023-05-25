//eee


package fr.insa.dumay.devisbatiment.interfacegraphique;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Test extends Stage {
    
    public Test(){
        Label label = new Label("Test");
        
        Scene scene = new Scene(label, 400, 400);
        this.setScene(scene);
        this.setTitle("Test");
    }
    
}
