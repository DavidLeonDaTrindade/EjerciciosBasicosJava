/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio_repaso_array_while;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class EJERCICIO_REPASO_ARRAY_WHILE {

    public static void main(String[] args) {
        int longitud = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantos numeros deseas ingresar?");//SOLICITAMOS LA LONGITUD DE LA ARRAY

        longitud = teclado.nextInt();//INTRODUCIMOS POR TECLADO LA LONGITUD
        System.out.println("--------------------------------------------");

        int numeros[] = new int[longitud];//ASIGNAMOS EL TAMAÑO PREVIAMENTE SOLICITADO A LA ARRAY NUMEROS
        int i = 0;
        while (i < numeros.length) {
            System.out.println("Dame el numero " + (i + 1));
            numeros[i] = teclado.nextInt();//DAMOS VALOR A LOS ESPACIOS SOLICITADOS DE LA ARRAY
            i++;
        }
        System.out.println("----------------------------------------------");
        int j = longitud - 1;//ASIGNAMOS LA VARIABLE J A LONGITUD PARA PODER CONTAR AL REVES Y SACAR EL ORDEN INVERSO
        while (j >= 0) {
            System.out.println("el orden inverso es " + (numeros[j]));
            j--;//TENEMOS QUE DESCONTAR A LA VARIAABLE LONGITUD PARA QUE APAREZCAN LOS NUMEROS DE MANERA INVERSA
        }
        System.out.println("-----------------------------------------------");
        i = 0;
        while (i < numeros.length) {//CON EL METODO LENGHT LE DECIMOS A EL PROGRAMA QUE CUENTE TODOS LOS ESPACIOS DE LA ARRAY
            if (numeros[i] > 10) {//COLOCAMOS UN IF PARA COLAR TODOS LOS NUMEROS MAYORES A 10
                System.out.println("Los numeros mayores a 10 son: " + numeros[i]);
            }
            i++;
        }
        System.out.println("-----------------------------------------------");
        i = 0;
        while (i < numeros.length) {
            if (numeros[i] % 2 == 0) {//PARA INDICAR SI LOS NUMEROS DE DENTRO DE LA ARRAY SON PARES SE HACE CON LA FORMULA ANTERIOR
                System.out.println("El " + numeros[i] + " es par.Es mayor a " + (numeros[i] - 1) + " y esta en la posicion " + (i + 1) + ".");
            }
            i++;
        }
    }
}
