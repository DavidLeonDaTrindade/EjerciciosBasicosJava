/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prog02_ejerc9;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class PROG02_Ejerc9 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.println("introduce el año");
       int anio = teclado.nextInt();
       if ((anio % 4 == 0 && anio % 100 !=0) || (anio % 100 == 0 && anio % 400 == 0)) {
       System.out.println("el año " + anio+ " es bisiesto");
       } else {
       System.out.println("el año "+anio+" no es no es bisiesto");
       }
    }
}
