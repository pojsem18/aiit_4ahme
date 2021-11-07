/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue03;

/**
 *
 * @author fabio
 */
public abstract class Wuerfel extends Quader {

   private final double laenge;

    public Wuerfel(double laenge, double breite, double hoehe, double dichte) {
        super(laenge, breite, hoehe, dichte);
        this.laenge = laenge;
        breite = this.laenge;
        hoehe = this.laenge;
    }

    @Override
    public double getVolumen() {
        return super.getVolumen(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getOberflaeche() {
        return super.getOberflaeche(); //To change body of generated methods, choose Tools | Templates.
    }
   
    
   
    
    
    
    
    
}
