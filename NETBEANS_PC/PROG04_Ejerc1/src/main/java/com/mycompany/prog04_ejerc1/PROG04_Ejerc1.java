/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prog04_ejerc1;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class PROG04_Ejerc1 {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         System.out.print("Por favor ingresa el numero que quieres usar: ");//SOLICITAMOS AL USUARIO EL NOMBRE DE USUARIO
       
        int NumMulti = 0;
        int contador =1;
        int resultado=0;
         NumMulti = teclado.nextInt();//ALMACENAMOS EN NUMERO QUE INTRODUCE EL USUARIO
        if(NumMulti<=30){System.out.println ("Tabla de multiplicar del " + NumMulti + " con bucle for");
        System.out.println (".............................. ");
        for (contador=1; contador<=10;contador++){
        resultado = contador * NumMulti; 
            System.out.println(NumMulti + " x " + contador + " = " + resultado);
        }
        int i=1;
        System.out.println("Tabla de multiplicar del " + NumMulti + " con bucle while");
        System.out.println("...............................");
        while (i<=10){
            resultado = i*NumMulti;
            System.out.println(NumMulti+ " x " + i + " = "+resultado);
            i++;
        }
        System.out.println("Tabla de multiplicar del "+ NumMulti + " con bucle do-while");
        System.out.println("...............................");
        int j = 1;
        do{
            resultado = j*NumMulti;
            System.out.println(NumMulti + " x " + j + " = " + resultado );
            j++;
        }while(j<=10);
        }else System.out.println("el numero es incorrecto");
    }
    
}
