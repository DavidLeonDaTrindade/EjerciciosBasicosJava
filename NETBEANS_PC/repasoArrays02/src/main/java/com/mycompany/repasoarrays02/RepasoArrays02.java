/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.repasoarrays02;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class RepasoArrays02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado1 = new Scanner(System.in);
        
        System.out.println("Introduce un texto: ");
        String texto = teclado.nextLine();
        System.out.println("Introduce una letra: ");
        String letra = teclado1.next();
        
        
        int cont=0;
        
        for(int i=0; i<texto.length(); i++){
            if(texto.charAt(i)==letra.charAt(0)){
                cont++;
            }
        }
        System.out.println("La letra " + letra.charAt(0) + " aparece " + cont + " veces");
    }
}
