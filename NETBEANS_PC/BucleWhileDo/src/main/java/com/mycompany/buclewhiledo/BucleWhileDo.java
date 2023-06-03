/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.buclewhiledo;
import java.util.Scanner;
        
/**
 *
 * @author David
 */
public class BucleWhileDo {

    public static void main(String[] args) {
       Scanner sc =new Scanner (System.in);
       int numero;// VALOR QUE LE ASIGNAMOS A LA VARIABLE NUMERO
       
       do//SIEMPRE EL NUMERO SELECCIONADO POR EL USUARIO SEA MENOR O IGUAL A 10 REALIZARA LA INSTRUCCION
       {
           System.out.println("ingrese un numero; ");//PEDIMOS UN NUMERO AL USUARIO SOLO IMPRIMIRA EN CONSOLA CUANDO EL WHILE SE CUMPLA ES DECIR CUANDO EL NUMERO SEA MENOR A 10
           numero = sc.nextInt();//ASIGNAMOS A NUMERO EL VALOR QUE EL USUARIO DECIDA
       }
       while(numero <=10);//DAMOS LA INSTRUCCION DEL NUMERO EN ESTE CASO SERIA MENOR O IGUAL A 10 POR LO TANTO CUANDO UN USUARIO INTRODUZCA UN VALOR MENOR O IGUAL A 10 EL CICLO SE REPITE Y CUANO SEA MAYOR EL CICLO ACABA
    }
}
