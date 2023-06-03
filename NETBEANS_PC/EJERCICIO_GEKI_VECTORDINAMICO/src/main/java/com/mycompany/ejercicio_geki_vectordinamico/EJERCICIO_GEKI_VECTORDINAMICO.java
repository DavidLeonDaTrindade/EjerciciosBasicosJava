/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio_geki_vectordinamico;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class EJERCICIO_GEKI_VECTORDINAMICO {

    public static void main(String[] args) {
        int longitud = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿cuantos numeros deseas ingresar?");
        longitud = teclado.nextInt();

        int numeros[] = new int[longitud];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Por favor dame el valor " + (i+1));
            numeros [i] = teclado.nextInt();
        }
        for (int i = 0; i< numeros.length; i++) {
            System.out.println("["+ numeros [i] + "]");
        }
    }
}
