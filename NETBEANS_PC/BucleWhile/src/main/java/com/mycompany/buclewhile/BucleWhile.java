/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.buclewhile;

/**
 *
 * @author David
 */
public class BucleWhile {

    public static void main(String[] args) {
       int i = 1;//INICIALIZACIOND E LA VARIABLE DE CONTROL
       while (i<10)//CONDICION A EVALUAR QUE DETERMINARA LA CONTINUIDAD O NO DEL BUCLE MIENTRAS I SEA MENOR QUE 10 EL BUCLE SE REPITE
       {
           System.out.println(i);//MUESTRA POR CONSOLA EL VALOR QUE VA ADQUIRIENDO I
           i++;//CONTADOR VARIABLE DE I
       }
    }
}
