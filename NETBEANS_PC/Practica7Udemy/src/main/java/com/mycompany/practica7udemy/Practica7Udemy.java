/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.practica7udemy;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Practica7Udemy {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota;
        System.out.println("Dime tu nota de programacion");
        nota = teclado.nextDouble();

        if (nota < 3) {
            System.out.println("Muy deficiente");
        } else if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota < 6) {
            System.out.println("Suficiente");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else if(nota == 10){
            System.out.println("Sobresaliente");
        }else{
            System.out.println("Nota no valida");
        }
        
    }
}
