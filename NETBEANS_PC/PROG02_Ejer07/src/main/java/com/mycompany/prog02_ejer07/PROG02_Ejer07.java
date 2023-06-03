/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prog02_ejer07;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class PROG02_Ejer07 {

    public static void main(String[] args) {
         Scanner teclado = new Scanner( System.in );
    float C1,C2;
    System.out.print( "Introduzca un número: " );
    C1 = teclado.nextInt();
    System.out.print( "Introduzca otro número: " );
    C2 = teclado.nextInt();
    System.out.println("el resultado de la dividion es: "+(C2/C1));
    System.out.printf("La ecuación %.1fx + %.1f = 0 es: %f",C1,C2,(-(C2/C1)));
    }
}
