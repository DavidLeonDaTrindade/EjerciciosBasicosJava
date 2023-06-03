/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practica22udemy;

/**
 *
 * @author david
 */
public class Practica22Udemy {

    public static void main(String[] args) {
        Fecha f1 = new Fecha(7, 4, 1980);
        Fecha f2 = new Fecha(10, 6, 1970);
        Fecha f3 = new Fecha(5, 1, 1985);
        Persona persona1 = new Persona("Juan", "Lopez", f1);
        Persona persona2 = new Persona("Pepe", "Hernandez", f2);
        Persona persona3 = new Persona("Maria", "Ruiz", f3);

        Persona[] personas = {persona1, persona2, persona3};
        //Esta seria otra manera de inicializar el array
        //personas[0] = persona1;
        //personas[1] = persona2;
        //personas[2] = persona3;
        
        for(Persona p: personas ){
            System.out.println(p.getFechaNacimiento().toString());
        }
    }
}
