/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio_clase_array_1;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class EJERCICIO_CLASE_ARRAY_1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte una longitud");
        int longitud = teclado.nextInt();
        int numeros[] = new int[longitud];
        int num = 0;
        for (int i=0; i<numeros.length;i++ ) {
            numeros[i]=generaNumeroAleatorio(0,10);
            System.out.println(numeros[i]);
        }
    }

    public static int generaNumeroAleatorio(int minimo, int maximo) {
        return (int) Math.floor(Math.random() * (minimo - (maximo + 1) + (maximo + 1)));//FORMULA PARA OBTENER DOS NUMEROS ALEATORIOS ENTRE UN MINIMO Y MAXIMO QUE NOSOTROS ELEJIMOS
    }
}
