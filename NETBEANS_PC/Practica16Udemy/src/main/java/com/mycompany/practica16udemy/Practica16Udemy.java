/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica16udemy;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Practica16Udemy {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra por teclado");
        String cadena = teclado.nextLine();
        String cadena2 = "";
        
        for (int i = cadena.length()-1;i >= 0; i--){
            char c = cadena.charAt(i);
            cadena2 = cadena2 + c;
        }
        if (cadena.equals(cadena2)){
            System.out.println("La cadena " + cadena + " es palindroma");
        }else{
            System.out.println("La cadena " + cadena + " no es palindroma");
        }
    }
}
