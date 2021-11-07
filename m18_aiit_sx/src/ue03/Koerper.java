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
public abstract class Koerper {
    private final double dichte;

    public Koerper (double dichte) {
        this.dichte = dichte;
    }

    public double getDichte () {
        return dichte;
    }
    
    public abstract double getVolumen();  // es gibt diese Methode jetzt
    public abstract double getOberflaeche();
    
    public double getMasse() {
        return getVolumen() * dichte;
    }  
}
