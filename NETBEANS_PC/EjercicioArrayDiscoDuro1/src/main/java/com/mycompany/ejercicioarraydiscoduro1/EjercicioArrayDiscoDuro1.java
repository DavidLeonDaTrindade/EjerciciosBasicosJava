/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicioarraydiscoduro1;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class EjercicioArrayDiscoDuro1 {

    public static void main(String[] args) {

        char abecedario[] = new char[91 - 65];
        for (int i = 65, indice = 0; i < 91; i++, indice++) {
            abecedario[indice] = (char) i;
           
        }
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte un numero entre el 0 y "+(abecedario.length-1)+" -1 para terminar");
        int num = teclado.nextInt();
        
        String cadena = "";
        while (num != -1) {

            if (num >= 0 && num < abecedario.length) {
                cadena+=abecedario[num];
                System.out.println("Inserte un numero entre el 0 y "+(abecedario.length-1)+" -1 para terminar");
            }else{
                System.out.println("Numero no valido, Inserte un numero entre el 0 y "+(abecedario.length-1)+" -1 para terminar");
            }
            num=teclado.nextInt();
        }
        System.out.println("la cadena resultante es "+cadena);
    }
}

