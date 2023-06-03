/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estructura_de_control;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Estructura_de_control {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
       int num_uno = 0;
       int num_dos = 0; 
       int resultado = 0;//ASIGNAMOS VALORES TIPO ENTEROS A NUM_UNO NUM_DOS Y RESULTADO
       int parametro = 0;//LA VARIABLE PARAMETRO LA USAMOS PARA QUE EJECUTE UNA DE LAS 4 OPCIONES 
       
       System.out.println("dame el primer numero: ");
       num_uno = teclado.nextInt();
       System.out.println("dame el segundo numero: ");
       num_dos = teclado.nextInt();
       System.out.println("dame un parametro del 1 al 4");
       parametro = teclado.nextInt();
               
       switch(parametro) { 
           case 1: resultado = num_uno + num_dos;// SI LE DAMOS VALOR UNO A PARAMETRO HARA LA SUMA
                        System.out.println("el resultado de la suma es: " + resultado);
                     break;//SIEMPRE HAY QUE PONER BREAK AL FINAL DE CADA SWITCH
           case 2: resultado = num_uno - num_dos;//SI LE DAMOS LA OPCION DOS MUESTRA LA RESTA
                        System.out.println("el resultado de la resta es: " + resultado);
                     break;//SIEMPRE HAY QUE PONER UN BRAK AL FINAL DE CADA CASE
            case 3: resultado = num_uno * num_dos;//SI LE DAMOS VALOR 3 AL SWITCH NOS DARA LA MULTIPLICACION
                        System.out.println("el resultado de la multiplicacion es: " + resultado);
                     break;//SIEMPRE HAY QUE PONER UN BREAK AL FINAL DE CADA CASE
            case 4: resultado = num_uno / num_dos;//SI LE DAMOS VALOR 4 NOS MUESTRA LA DIVISION
                        System.out.println("el resultado de la division es: " + resultado);
                     break;//SIEMPRE HAY QUE PONER UN BREAK AL FINAL DE CADA CASE
            default: System.out.println("error, la opcion no existe");
                    break;
       }
    }
}
