/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica5udemy;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Practica5Udemy {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0 , num2 = 0;
        System.out.println("Introduce el primer operando");
        try{
             num1 = teclado.nextInt();
        }catch(Exception e){
            System.out.println("El valor es incorrecto");
        }
       
        System.out.println("Introduce el segundo operando");
         try{
             num2 = teclado.nextInt();
        }catch(Exception e){
            System.out.println("El valor es incorrecto");
        }
        
        
        try{
            int suma = num1 + num2;
            int resta = num1 - num2;
            int div = num1 / num2;
            int mult = num1 * num2;
            System.out.println("La suma es " + suma);
            System.out.println("La resta es " + resta);
            System.out.println("La division es " + div);
            System.out.println("La multiplicacion es " + mult);
            
        }catch(Exception e){
            System.out.println("La division no puede ser entre 0");
        }
    }
}
