/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.practica12udemy;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Practica12Udemy {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        //variables de tipo contador hay que inicializarlas
        int pares = 0;
        int impares = 0;
        int contadorNumeros = 0;
        System.out.println("Introduce un numero");
        System.out.println("Introduce un 0 cuando quieras salir");
        numero = teclado.nextInt();
        while (numero != 0) {
            System.out.println("Introduce un numero");
            numero = teclado.nextInt();
            contadorNumeros++;
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Has introducido " + contadorNumeros + " numeros de los cuales son pares " + pares + " y " + impares + " impares");
    }
}
