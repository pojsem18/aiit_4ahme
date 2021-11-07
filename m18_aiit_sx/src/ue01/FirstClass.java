/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue01;

/**
 *
 * @author fabio
 * Paketnamen immer KLEIN schreiben
 */
public class FirstClass {     
    //Objekt Eigenschaften (Properties), umgangsspravhlich "Objektvariable", sollte man nicht sagen
    private double v1;
    private double v2; 
    /**
     * public class FirstClass { Diese Klasse ist überall von meinem Programm aus zugreifbar(public class)
     * public FirstClass () {    Das (public) ist der Konstruktor, kann die Sichtbarkeit public, private, protected, oder nichts hinschreiben(package scope) = Mischung aus protected und public
     */
    public FirstClass () {  
        int i = 10;
        i++;
        for (i = 3; i < 20; i++) {
            System.out.println("i hat den Wert " + i);
        }
        v1 = 0; //man muss es nicht auf 0 setzen, da Java bei double und int automatisch 0 in den Speicher schreibt     
        v2 = 0;
    }
    
    public double add (double v1, double v2) {
        //schlüsselwort this bezeichnet das eigene Objekt
        //bei Namensollission muss this verwendet werden
        //Verwendung von this nicht üblich wenn keine Namenskollission
        this.v1 = v1;
        this.v2 = v2;
        return v1 + v2;
    }
    
    public static void main (String[] args) {
        System.out.println("Start");
        //Klassische Deklaration einer Variablen für ein Objekt
        FirstClass myFirstObject = new FirstClass();
        
        //ab Java 10 auch Schlüsselwort var möglich
        var mySecondObject = new FirstClass();
        
        //FirstClass.add(1,2); funktioniert nicht, da bei der Methode kein static ist
        double result = myFirstObject.add(1, 2);
        System.out.println("result = " + result);
        
        mySecondObject = null;
        mySecondObject = myFirstObject;
        //zweites Objekt wird nicht mehr refernzeirt
        // => Java Garbage Collection sorgt automatisch für Speicherfreigabe
        // => kein free() wie in C oder C++ mehr erforderlich!!!
        
        System.out.println("myFirstObject.v1 = " +myFirstObject.v1);
        System.out.println("myFirstObject.v2 = " +myFirstObject.v2);
        System.out.println("mySecondObject.v1 = " +mySecondObject.v1);
        System.out.println("mySecondObject.v2 = " +mySecondObject.v2);
        //mySecondObject = null;     //Als Test, zeigt auf gar nichts, deswegen null, deswegen funktioniert der Zugriff in Zeile 62 nicht mehr => error Meldung   
        mySecondObject.add(10, 11);
    }
}
