/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exepcionesudemy;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class ExepcionesUdemy {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int num = 0;
        try {
            num = teclado.nextInt();
        } catch (Exception ex) {
            System.out.println("El dato no es un numero entero");
        }
        System.out.println("El numero es " + num);
    }
}
