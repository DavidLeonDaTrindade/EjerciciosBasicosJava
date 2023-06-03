/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prog04_ejerc03b;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class PROG04_Ejerc03B {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numUno, numDos;
        int mcm=0;
        int i =0;
        System.out.println("introduce el primer numero: ");
        numUno = teclado.nextInt();
        System.out.println("introduce el segundo numero: ");
        numDos = teclado.nextInt();
        if (numUno < 0){
        System.out.println("el primer numero es negativo");
        }else System.out.println("el primer numero es positivo");
         if (numDos < 0){
        System.out.println("el segundo numero es negativo");
        }else System.out.println("el segundo numero es positivo");
         mcm=numUno;
         if(numDos>mcm) {
             mcm=numDos;
             i=mcm;
             while((i%numUno !=0) || (i%numDos !=0)){
             i++;
             }
             System.out.println("El minimo comun multiplo de "+ numUno +" y "+numDos+" es "+i );
         }
    }
}
