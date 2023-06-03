/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.repasoarraystemario;

/**
 *
 * @author David
 */
public class RepasoArraysTemario {

    public static void main(String[] args) {
        int [ ] numeros = new int[3];
        numeros[0] = 99;
        numeros[1] = 120;
        numeros[2] = 33;
        
        //TAMBIEN PODEMOS SUMAR LOS NUMEROS QUE PREVIAMENTE HEMOS ALMACENADO EN CADA ESPACIO DEL ARRAY
        int suma = numeros[0] + numeros[1] + numeros[2];
        System.out.println(suma);
        
        //CON EL METODO .LENGHT LE PEDIMOS AL PROGRAMA QUE NOS MUESTRE LA LONGITUD DEL ARRAY
        System.out.println("La longitud del array es " + numeros.length);
                
        
    }
}
