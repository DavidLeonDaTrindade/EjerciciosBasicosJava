/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio_repaso_array;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class EJERCICIO_REPASO_ARRAY {

    public static void main(String[] args) {
        int longitud = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantos numeros deseas ingresar?");

        longitud = teclado.nextInt();
        System.out.println("--------------------------------------------");

        int numeros[] = new int[longitud];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dame el numero " + (i + 1));
            numeros[i] = teclado.nextInt();

        }
        System.out.println("----------------------------------------------");
        for (int i = longitud - 1; i >= 0; i--) {
            System.out.println("el orden inverso es: " + (numeros[i]));
        }
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 10) {
                System.out.println("los numeros mayores a 10 son: " + numeros[i]);
            }
            System.out.println("---------------------------------------------");
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("El " + numeros[i] + " es par.Es mayor a " + (numeros[i] - 1) + " y esta en la posicion " + (i + 1) + ".");
            }

        }
    }
}
