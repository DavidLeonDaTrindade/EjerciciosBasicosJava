/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clases_openbootcamp_1;

/**
 *
 * @author David
 */
public class CLASES_OPENBOOTCAMP_1 {

    public static void main(String[] args) {
        Animal miAnimal = new Animal("falco");
        miAnimal.setEdad(3);
        miAnimal.setRaza("Loro");
        System.out.print("El nombre es: " + miAnimal.getNombre());
        System.out.print(" tiene "+ miAnimal.getEdad() + " años ");
        System.out.println("y es un "+miAnimal.getRaza());
        Animal miAnimal1 = new Animal("Lolo");
        miAnimal1.setEdad(9);
        miAnimal1.setRaza("Perro");
        System.out.print("El nombre es: "+ miAnimal1.getNombre());
        System.out.print(" tiene "+miAnimal1.getEdad() + " años");
        System.out.println(" y es un " + miAnimal1.getRaza());
    }
 }