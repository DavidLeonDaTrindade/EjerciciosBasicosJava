/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica14udemy;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Practica14Udemy {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        String cadena = teclado.nextLine();
        int espacios = 0;
        
        for(int i = 0; i<cadena.length(); i++){
            if(cadena.charAt(i)== ' '){
                espacios++;
            }
        }
        System.out.println("Numero de espacios en blanco " + espacios);
    }
}
