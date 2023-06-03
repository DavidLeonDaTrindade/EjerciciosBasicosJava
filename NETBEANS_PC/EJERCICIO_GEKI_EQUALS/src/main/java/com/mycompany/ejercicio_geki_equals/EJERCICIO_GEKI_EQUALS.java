/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_geki_equals;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class EJERCICIO_GEKI_EQUALS {

    public static void main(String[] args) {
        
        String nombreUno = "" , nombreDos = "";
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Por favor ingresa el primer nombre: ");
        nombreUno = teclado.nextLine();
        
        System.out.print("Por favor ingresa el segundo nombre: ");
        nombreDos = teclado.nextLine();
        
        if(nombreUno.equals(nombreDos)  ){
            System.out.println("Los nombres son iguales");
        }else
            System.out.println("Los nombres son diferentes");
    }
}
