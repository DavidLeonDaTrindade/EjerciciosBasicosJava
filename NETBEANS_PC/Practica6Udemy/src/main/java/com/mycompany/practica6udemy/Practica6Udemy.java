/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica6udemy;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Practica6Udemy {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        System.out.println("Dime un numero");
        num = teclado.nextInt();
        if(num<0 && num%3 ==0){
            System.out.println("El numero " + num + " es negativo y multiplo de 3");
        }
        else{
            System.out.println("El numero no es negativo ni multiplo de 3");
        }
    }
}
