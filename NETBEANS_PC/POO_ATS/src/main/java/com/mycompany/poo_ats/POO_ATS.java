/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo_ats;

/**
 *
 * @author David
 */
public class POO_ATS {

    public static void main(String[] args) {
       //CREACION DEL OBJETO COCHE 1 
       Coche coche1 = new Coche(); 
       coche1.color = "Blanco";
       coche1.marca = "audi";
       coche1.km = 0;
       
        System.out.println("El color del coche 1 es: "+coche1.color);
        System.out.println("La marca del coche 1 es: "+coche1.marca);
        System.out.println("Los km del coche 1 son: "+coche1.km);
        //CREACION DEL OBJETO COCHE 2
        Coche coche2 = new Coche();
        coche2.color = "Rojo";
        coche2.marca = "Ferrari";
        coche2.km = 100;
        
        System.out.println("\nEl color del coche 2 es " + coche2.color);
        System.out.println("La marca del coche 2 es " + coche2.marca);
        System.out.println("Los km del coche 2 son: " + coche2.km);
       
    }
}
