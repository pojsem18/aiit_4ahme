/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue02;

import java.util.logging.Logger;

/**
 * Immutable Klasse Person.
 * Immutable -> Obkekte nicht mehr veränderbar
 * @author fabio
 * 
 */
public class Person {
    
    private final String firstName; 
    private final String surname;
    private final int age;

    public Person (String firstName, String surname, int age) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
    }

    public String getFirstName () {
        return firstName;
    }

    public String getSurname () {
        return surname;
    }

    public int getAge () {
        return age;
    }

    @Override
    public String toString () {
        return "Person{" + "firstName=" + firstName + ", surname=" + surname + ", age=" + age + '}';
    }   
}


