/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.dumay.devisbatiment;
import java.util.ArrayList;
/**
 *
 * @author mathis
 */
public class Piece {
    ///attributs///
    int idPiece; 
    int sol;
    int plafond;
    ArrayList<Mur> listeMurs;
    
    public Piece(int id, int sol,int plafond, ArrayList<Mur> murs){
    this.idPiece=id;
    this.sol=sol;
    this.plafond=plafond;
    this.listeMurs=murs;
}
    
    @Override
    public String toString() {
        return "Piece{" + "idPiece=" + idPiece + ", sol=" + sol + ", plafond=" + plafond + ", listeMurs=" + listeMurs + '}';
    }

    public double surface()
    {
        
    }
    
    public void afficher()
    {
        
    }
}
