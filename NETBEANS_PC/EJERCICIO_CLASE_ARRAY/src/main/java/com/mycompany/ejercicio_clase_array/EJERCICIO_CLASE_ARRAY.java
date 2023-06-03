/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio_clase_array;

import java.util.Arrays;

/**
 *
 * @author David
 */
public class EJERCICIO_CLASE_ARRAY {

    public static void main(String[] args) {

        int numeros[] = new int[100];

        int suma = 0;
        double media = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            //System.out.println(numeros[i]);
            suma += numeros[i];
        }
        System.out.println("La suma es: " + suma);

        media = (double) suma / numeros.length;

        System.out.println("La media es: " + media);
    }
}
