/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.udemyif;

/**
 *
 * @author David
 */
public class UdemyIF {

    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 1;
        if(numero1>0 && numero2 > 0){
            System.out.println("Numero 1 y numero 2 mayores que 0");
        }
        else if(numero1 > 0|| numero2 > 0 ){
            System.out.println("Numero 1 o numero 2 mayores que 0");
        }
        else{
            System.out.println("Ninguno de los dos numeros es mayor a 0");
        }
    }
}
