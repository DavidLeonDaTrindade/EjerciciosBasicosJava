/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.datosdesdeelteclado;

/**
 *
 * @author David
 */
import java.util.Scanner; // PARA USAR SCANNER TENEMOS QUE IMPORTAR LA LIBRERIA SCANNER
public class Datosdesdeelteclado {
  public static void main(String args[])
   
  {     
      Scanner teclado = new Scanner(System.in);//AQUI ESTAMOS ASIGNANDO A TECLADO LA VARIABLE SCANNER PARA QUE LEA LO QUE EL USUARIO TECLEE
          String nombre = "";
          int numuno = 0, numdos = 0, resultado = 0;
          
          System.out.println("¿Cual es tu nombre?");
          nombre = teclado.nextLine();//AQUI INTRODUCIMOS EL NOMBRE CON EL TECLADO
          
          System.out.println("hola " + nombre + " Dame el primer valor para la suma: ");
          numuno = teclado.nextInt();//AQUI INTRODUCIMOS EL 1º VALOR DE LA SUMA CON EL TECLADO
          
          System.out.println("Dame el segundo valor de la suma: ");
          numdos = teclado.nextInt();// AQUI INTRODUCIMOS EL 2º VALOR DE LA SUMA CON EL TECLADO
          
         resultado = numuno + numdos;
         System.out.println("OK  "+ nombre + " El resultado de la suma es " + resultado);//AQUI IMPRIMIMOS EN CONSOLA LOS VALORES QUE LES HEMOS DADO A LAS VARIABLES CON EL TECLADO
         
          }
}
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          