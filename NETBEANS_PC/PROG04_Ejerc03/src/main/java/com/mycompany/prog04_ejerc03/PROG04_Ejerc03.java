/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prog04_ejerc03;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class PROG04_Ejerc03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numUno, numDos, mcm, i;
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
        mcm=1;
        i=2;
        while(i<=numUno || i<=numDos)
        {
            if(numUno%i==0 || numDos%i==0)
                {   mcm=mcm*i;
                if(numUno%i == 0) numUno=numDos/i;
                 if(numDos%i == 0) numDos=numDos/i;
                }
            else i=i+1;
            }
        System.out.println("el MCM es: "+ mcm);
        }
    }

