/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.prog04_ejerc05;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class PROG04_Ejerc05 {

    public static void main(String[] args) {
        int valor1 = 0;
        int valor2 = 0;
        int resultado = 0;
        int numDiv = 0;
        boolean salir = true;
        try {
            do {

                Scanner teclado = new Scanner(System.in);

                System.out.println("Dame el primer valor: ");
                valor1 = teclado.nextInt();
                System.out.println("Dame el segundo valor: ");
                valor2 = teclado.nextInt();

                resultado = valor1 / valor2;

                System.out.println("el resultado es: " + resultado);
                numDiv++;
                if ((valor1 == -1) && (valor2 == -1)) {
                    System.out.println("el numero de divisiones que has realizado es: " + numDiv);
                    salir = false;
                }

            } while (salir);

        } catch (Exception e) {
            System.out.println("Err0r!!!!!!" + e);
        }

    }

}
