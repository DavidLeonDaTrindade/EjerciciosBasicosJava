/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicioarraydiscoduro;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class EjercicioArrayDiscoDuro {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte una longitud");
        int longitud = teclado.nextInt();
        int numeros[] = new int[longitud];
        int num = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Inserte un numero en la posicion " + i);
            do {
                num = teclado.nextInt();
                if (!(num > 0 && num < 10)) {
                    System.out.println("Error. Solo numeros del 0 al 10. Inserte un numero en la posicion " + i);
                }

            } while (!(num > 0 && num < 10));
                numeros [i] = num;
                
        }
        System.out.println("Estos son los numeros elegidos por el usuario");
        for (int i = 0;i<numeros.length ; i++) {
            System.out.println(numeros[i]);
            
        }
    }
}
