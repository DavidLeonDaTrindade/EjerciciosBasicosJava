/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prog04_ejerc02;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class PROG04_Ejerc02 {
    
    

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame el primer numero: ");
        int numUno = teclado.nextInt();
        System.out.println("Dame el segundo numero: ");
        int numDos = teclado.nextInt();
        System.out.println("Dame el tercer numero: ");
        int numTres = teclado.nextInt();
        System.out.println("Dame el cuarto numero: ");
        int numCuatro = teclado.nextInt();
        System.out.println("Dame el quinto numero: ");
        int numCinco = teclado.nextInt();
    if (numUno < 0){
        System.out.println("el primer numero es negativo");
        }else System.out.println("el primer numero es positivo");
     System.out.println("...............................................");
    if (numDos < 0){
        System.out.println("el segundo numero es negativo");
        }else System.out.println("el segundo numero es positivo");
     System.out.println("...............................................");
    if (numTres < 0){
        System.out.println("el tercero numero es negativo");
        }else System.out.println("el tercero numero es positivo");
     System.out.println("...............................................");
    if (numCuatro < 0){
        System.out.println("el cuarto numero es negativo");
        }else System.out.println("el cuarto numero es positivo");
     System.out.println("...............................................");
    if (numCinco < 0){
        System.out.println("el quinto numero es negativo");
        }else System.out.println("el quinto numero es positivo");
     System.out.println("...............................................");
    int sumaUno = 0;
    for (int i =1; i<=numUno; i++){
        int auxiliar = numUno%i;
        if(auxiliar == 0){
        sumaUno = sumaUno+1;
            }
        }
    if(sumaUno <= 2){
        System.out.println("el primer numero ES primo");
        }else{
        System.out.println("el primer numero NO es primo");
        }
     System.out.println("...............................................");
     int sumaDos = 0;
    for (int i =1; i<=numDos; i++){
        int auxiliar = numDos%i;
        if(auxiliar == 0){
        sumaDos = sumaDos+1;
            }
        }
    if(sumaDos <= 2){
        System.out.println("el segundo numero ES primo");
        }else{
        System.out.println("el segundo numero NO es primo");
        }
     System.out.println("...............................................");
     int sumaTres = 0;
    for (int i =1; i<=numTres; i++){
        int auxiliar = numTres%i;
        if(auxiliar == 0){
        sumaTres = sumaTres+1;
            }
        }
    if(sumaTres <= 2){
        System.out.println("el tercer numero ES primo");
        }else{
        System.out.println("el tercer numero NO es primo");
        }
     System.out.println("...............................................");
     int sumaCuatro = 0;
    for (int i =1; i<=numCuatro; i++){
        int auxiliar = numCuatro%i;
        if(auxiliar == 0){
        sumaCuatro = sumaCuatro+1;
            }
        }
    if(sumaCuatro <= 2){
        System.out.println("el cuarto numero ES primo");
        }else{
        System.out.println("el cuarto numero NO es primo");
        }
        System.out.println("...............................................");
     int sumaCinco = 0;
    for (int i =1; i<=numCinco; i++){
        int auxiliar = numCinco%i;
        if(auxiliar == 0){
        sumaCinco = sumaCinco+1;
            }
        }
    if(sumaCinco <= 2){
        System.out.println("el quinto numero ES primo");
        }else{
        System.out.println("el quinto8 numero NO es primo");
        }
    }
    
}
