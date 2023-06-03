/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arraybasico;

/**
 *
 * @author David
 */
public class ArrayBasico {

    public static void main(String[] args) {
        int [ ] numeros = new int[3];
        numeros [0] = 99;
        numeros[1] = 199;
        numeros[2] = 211;
        
        int suma = numeros[0] + numeros[1] + numeros[2];
        int resta = numeros[2] - numeros[0];
        System.out.println(suma);
        System.out.println(resta);
        //PROPIEDAD QUE NOS PERMITE SABER EL TAMAÑO DE UN ARRAY
        System.out.println(numeros.length);
        
        int suma1 = sumaArray(numeros);
        System.out.println(suma1);
       } 
    
    //METODO PARA RECORRER EL ARRAY Y QUE TODAS SUS POSICIONES SE SUMEN
        static int sumaArray (int[ ] j){
        int suma1 = 0;
        for (int i =0; i<j.length;i++)
            suma1 = suma1+j[i];
        return suma1;
    }
    
}
