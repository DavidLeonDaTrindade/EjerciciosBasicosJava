/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.practica15udemy;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Practica15Udemy {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la contraseña: ");
        String pass = teclado.nextLine();
        boolean valida = false;
        if (pass.length() >= 10 && pass.length() <= 20) {

            for (int i = 0; i < pass.length(); i++) {
              
                if (pass.charAt(i) == '*' || pass.charAt(i) == '-' || pass.charAt(i) == '_') {
                    valida = true;
                }
               
            }
            if (valida) {
                System.out.println("La contraseña es correcta");
            }else {
                System.out.println("La contraseña no tiene los caracteres necesarios");
            }
            
        } else {
            System.out.println("La contraseña no tiene la longitud correcta");
        }
    }
}
