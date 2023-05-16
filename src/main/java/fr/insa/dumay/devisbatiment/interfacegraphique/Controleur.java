/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment.interfacegraphique;

/**
 *
 * @author juliette
 */
public class Controleur {
    
    private MainPane vue; //controleur peut accéder au panneau principal(à la vue, grace au MainPane)
    
    public Controleur(MainPane vue){
        this.vue = vue;
    }
    
}
