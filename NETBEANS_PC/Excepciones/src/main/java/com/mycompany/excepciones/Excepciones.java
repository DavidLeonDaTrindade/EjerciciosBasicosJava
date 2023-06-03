/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.excepciones;

/**
 *
 * @author David
 */
public class Excepciones {

    public static void main(String[] args) {
            boolean fueradelimites = true;
            int i;
            String texto[ ] = {"uno","dos","tres","cuatro","cinco",};
            
            while (fueradelimites) {
            try {
                i= (int) Math.round(Math.random()*9);
                System.out.println(texto[i]);
                fueradelimites = false;
            } catch (ArrayIndexOutOfBoundsException exc){
                System.out.println("fallo en el indice");
            }
            }
    }
}
