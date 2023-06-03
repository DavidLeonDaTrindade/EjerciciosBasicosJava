/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_geki_matrix;

/**
 *
 * @author David
 */
public class EJERCICIO_GEKI_MATRIX {

    public static void main(String[] args) {
        int numeros [ ] [ ] = new int [2] [2];
        
        numeros [0] [0] = 5;
        numeros [0] [1] = 2;
        numeros [1] [0] = 2;
        numeros [1] [1] = 5;
        
        System.out.print("["+ numeros [0] [0] + "]");
        System.out.println("["+ numeros [0] [1] + "]");
        System.out.print("["+ numeros [1] [0] + "]");
        System.out.print("["+ numeros [1] [1] + "]");
    }
}
