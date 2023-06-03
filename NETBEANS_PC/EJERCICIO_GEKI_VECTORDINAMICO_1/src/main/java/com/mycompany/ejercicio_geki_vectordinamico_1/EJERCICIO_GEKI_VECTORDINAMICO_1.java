/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio_geki_vectordinamico_1;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class EJERCICIO_GEKI_VECTORDINAMICO_1 {

    public static void main(String[] args) {
       
        int contador =1;
        int filas =0;
        int columnas=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el numero de columnas de tu vector dinamico");
        columnas = teclado.nextInt();
        System.out.println("Dame el numero de filas de tu vector dinamico");
        filas = teclado.nextInt();
         int numeros[][] = new int[filas][columnas];

        for (int j = 0; j < filas; j++) {
            for (int i = 0; i < columnas; i++) {
                numeros[j][i] = contador;
                contador++;
                System.out.print("[" + numeros[j][i] + "]");
            }
            System.out.println(" ");
        }
    }
}
