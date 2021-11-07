/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue02;

/**
 *
 * @author fabio
 */
public class MySecondClass {
    
    //Auch ohne explizit formulierten Konstruktor existiert ein DEFAULT-Konstruktor (ohne Parameter)
    
    public void workWithStrings () {
        
        //char s[100]; Geht nicht mehr
        //Strings in C sind Felder von Char
        //char s [] = new char [100]; // in C -> char s[100]
        
        // in Java gibt es eine eigene Klasse String
        String s = "Guten Morgen"; //Bei String kein new erforderlich
        //String s2 = new String ("Guten Morgen"); //nicht erwünscht, ist aber möglich
        
        //Das angelegte Object ist immutable -> nicht veränderbar
        
        s = s + ", Herr Schmid!";
        s = s.replace("Herr", "Frau");
        
        System.out.println(s);
        
        String s2 = "Guten Morgen, Frau Schmid!";
        if (s == s2) {
            System.out.println("Gleiche Objekte");
        } else {
            System.out.println("Unterschiedliche Obkejte");
        }
        
        if (s.equals(s2)) {
            System.out.println("Gleicher Inhalt");
        } else {
            System.out.println("Ungleicher Inhalt");
        }
        
        Person p1 = new Person("Jabkob", "Kurzmann", 17);
        var p2 = new Person("Sebastian", "Sever", 17);
        System.out.println(p1.getSurname());
        System.out.println(p1);
        System.out.println(p2);
        
        //Wrapper Klassen für primitive Datentypen
        
        int i1 = 10;        //primitiver Datentyp -> Variable mit einem Wert
        Integer i2 = 20;  //Objekt der Klasse Integer (Integer -> WrapperKlasse für int)
        
        //Grundregel: immer primitive Datentypen verwenden, Objekte nur dann wenn erforderlich
     
    }
    public static void main (String[] args) {
        new MySecondClass().workWithStrings();
    }   
}