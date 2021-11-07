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
public class Kugel extends Koerper {
    
    private final double radius;

    public Kugel(double radius, double dichte) {
        super(dichte);
        this.radius = radius;
    }

    @Override
    public double getVolumen () {
        return 4.0 / 3.0 *Math.PI * radius *radius * radius;        //MATH.pow(radius, 3)
    } 

    @Override
    public double getOberflaeche () {
        return 4.0 * MATH.PI * radius * radius;                      //MATH.pow(radius, 2);
    }

    /*@Override
    public double getMasse () {
        return dichte * getVolumen();
    }*/ 
}
