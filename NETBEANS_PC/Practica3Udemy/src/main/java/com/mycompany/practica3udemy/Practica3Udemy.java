/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica3udemy;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Practica3Udemy {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       double euros;
       double resultado;
       
       System.out.println("Introduce los euros que quieres pasar a dolares: ");
       euros = teclado.nextDouble();
       
       double dolares = euros * 1.21;
       
        System.out.println("tienes " + dolares +" $");
       
    }
}
