/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica13udemy;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Practica13Udemy {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double notaMayor = -1;
        double notaMenor = 11;
        System.out.println("Introduce la nota");
        nota = teclado.nextDouble(); 
        while(nota>=0 && nota<=10){
            if(nota > notaMayor){
                notaMayor = nota;
            }if(nota < notaMenor){
                notaMenor = nota;
            }
            System.out.println("Introduce la nota");
            nota = teclado.nextDouble();
        }
        System.out.println("La nota mas alta es " + notaMayor +" y la nota mas baja es " + notaMenor);
    }
}
