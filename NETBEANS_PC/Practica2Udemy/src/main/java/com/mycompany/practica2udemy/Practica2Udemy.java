/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica2udemy;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Practica2Udemy {

    public static void main(String[] args) {
        int edad;
        String nombre;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu nombre:");
        nombre = teclado.nextLine();
        System.out.println("Dime tu edad");
        edad = teclado.nextInt();
        System.out.println("Hola " + nombre + " tienes " + edad + " años");
    }
}
