/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.condicionalesanidadas;

/**
 *
 * @author David
 */
public class Condicionalesanidadas {
        public static void main(String args[]){
        
        int operacion = 4;//VALOR DE LA VARIABLE OPERACION  
        int num_uno = 8;//VALOR DE LA VARIABLE NUMERO 1
        int num_dos = 4;//VALOR DE LA VARIABLE NUMERO 2
        int resultado = 0;//VALOR DE LA VARIABLE RESULTADO
               if (operacion == 1)
               {  resultado = num_uno + num_dos;
                   System.out.println("la suma es " + resultado);//SI SE CUMPLE LA PRIMERA CONDICION IMPRIME LA SUMA EN CONSOLA SINO SALTARIA AL ELSE
               }
               else if(operacion == 2) 
               {  resultado = num_uno - num_dos;
                   System.out.println("la resta es " + resultado);//SI SE CUMPLE EL ELSE SE IMPRIME LA RESTA EN CONSOLA SINO SALTARIA AL SIGUIENTE
               }
               else if(operacion == 3)
               { resultado = num_uno * num_dos;
                  System.out.println("la multiplicacion es: " + resultado);  //SI SE CUMPLE EL 3ª ELSE IMPRIME LA MULTIPLICACION SINO SALTARIA A LA SIGUIENTE
               }
               else if(operacion == 4)
               { resultado = num_uno / num_dos;
                   System.out.println("la division es igual a: " + resultado);// SI SE CUMPLE EL 4 ELSE SE IMPRIME LA DIVISION SINO SALTARIA A LA SIGUIENTE
               }
               else 
               {System.out.println("el numero que has introducido no es correcto");//ESTE SERIA EL ELSE DEFINITIVO E IMPRIMIRIA UN MENSAJE DE ERROR POR NO CUMPLIRSE NINGUNA DE LAS ANTERIORES CONDICIONES
               } 
        }
}
