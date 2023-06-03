/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.practica11udemy;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Practica11Udemy {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numAlum;
        int contadorMayores = 0;
        int contadorMenores = 0;
        double suma = 0;
        System.out.println("Dime los alumnos de la clase");
        numAlum = teclado.nextInt();
        System.out.println("A continuacion introduce la altura de cada alumno");
        for (int i = 1; i <= +numAlum; i++) {
            System.out.println("Dime la altura del alumno" + i);
            double altura = teclado.nextDouble();
            suma = suma + altura;
            if (altura >= 1.8) {
                contadorMayores++;
            } else {
                contadorMenores++;
            }

        }
        double promedio = suma / numAlum;
        System.out.println("Numero de alumnos con altura mayor a 1,80 " + contadorMayores);
        System.out.println("Numero de alumnos con altura menor a 1,80 " + contadorMenores);
        System.out.println("Promedio de altura " + promedio);
    }
}
