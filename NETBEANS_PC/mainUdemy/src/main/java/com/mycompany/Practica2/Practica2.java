/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.Practica2;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Practica2 {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      String nombre;
      int edad;
        System.out.println("Hola dime tu nombre:");
        nombre = teclado.nextLine();
        System.out.println("dime tu edad");
        edad = teclado.nextInt();
        System.out.println("¡Hola " + nombre + ", tienes " + edad + " años");
    }
}
