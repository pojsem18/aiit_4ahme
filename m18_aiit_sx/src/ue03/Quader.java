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
public abstract class Quader extends Koerper{
    
    private final double laenge;
    final double breite;
    final double hoehe;

    public Quader(double laenge, double breite, double hoehe, double dichte) {
        super(dichte);
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    /**
     *
     * @return
     */
    @Override
    public double getOberflaeche() {
        return laenge*breite*2 + hoehe*breite*2 + hoehe*laenge*2;
    }

    /**
     *
     * @return
     */
    @Override
    public double getVolumen(){
        return laenge*breite*hoehe;
    }
  
    
}
