/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practicamain;

/**
 *
 * @author David
 */
public class PracticaMain {

    public static void main(String[] args) {
        //objetos creados de las diferentes clases
        GuerreroZ Goku= new GuerreroZ("Goku", 100, 1000);
        Enemigo Vegeta = new Enemigo("Vegeta", 100, 1000);
        Enemigo Freezer = new Enemigo("Frezzer", 500, 1000);
        Goku.ataque(Vegeta);
        System.out.println("La vida de vegeta es " + Vegeta.vida);
        Vegeta.ataque(Goku);
        System.out.println("La vida de goku es " + Goku.vida);
        //metodo defender de la clase GuerreroZ
        Goku.defender(Goku);
        Goku.defender(Goku);
        Goku.defender(Goku);
        System.out.println("Goku uso defensa su nueva vida es "+Goku.vida);
        Vegeta.ataqueGenkidama(Goku);
        System.out.println(Goku.vida);
        //metodos especiales de la clase interface
        Freezer.ataqueGenkidama(Goku);
        Freezer.bolaFinal(Vegeta);
        System.out.println("la nueva vida de Goku es " + Goku.vida);
        System.out.println("la nueva vida de Vegeta es " + Vegeta.vida);
        Goku.kamehameha(Freezer);
        Goku.genkidama(Freezer);
    }
}
