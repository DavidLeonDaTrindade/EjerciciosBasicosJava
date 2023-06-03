/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.practica9udemy;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Practica9Udemy {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el numero equivalente al dia de la semana");
        int numDia = teclado.nextInt();
        switch (numDia) {
            case 1: {
                /*System.out.println("Lunes");
                break;*/
            }
            case 2: {
                /*System.out.println("Martes");
                break;*/
            }
            case 3: {
                /*System.out.println("Miercoles");
                break;*/
            }
            case 4: {
                /*System.out.println("Jueves");
                break;*/
            }
            case 5: {
                /*System.out.println("Viernes");
                break;*/
                System.out.println("Dia laborable");
                break;
            }
            case 6: {
                /*System.out.println("Sabado");
                break;*/
            }
            case 7: {
                /*System.out.println("Domingo");
                break;*/
                System.out.println("Dia libre");
                break;
                
            }
            default:{
                System.out.println("Opcion incorrecta");
            }
        }

    }
}
