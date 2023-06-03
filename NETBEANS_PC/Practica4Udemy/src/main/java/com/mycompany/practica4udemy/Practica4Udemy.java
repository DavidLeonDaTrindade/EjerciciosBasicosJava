/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica4udemy;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Practica4Udemy {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int base, altura;
        System.out.println("Vamos a calcular el area de un triangulo.");
        System.out.println("Dime la base del triangulo");
        base = teclado.nextInt();
        System.out.println("Ahora dime la altura");
        altura = teclado.nextInt();
        
         int area = (base * altura)/2; 
         
         System.out.println("El area de tu triangulo es " + area);
        
        
    }
}
