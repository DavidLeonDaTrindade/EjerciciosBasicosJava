/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practica27udemy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Practica27Udemy {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Map<String, Integer> alumnos = new HashMap<String, Integer>();
        
        int opcion = -1;
        
        while(opcion != 2){
            System.out.println("Introduce la opcion que deseas");
            System.out.println("1- Introduce asignaturas y creditos");
            System.out.println("2- Salir");
            
            opcion= teclado.nextInt();
            teclado.nextLine();
            if(opcion ==1){
                System.out.println("Introduce el nombre de la asignatura");
                String asignatura = teclado.nextLine();
                System.out.println("Introduce los creditos de la asignatura");
                int creditos = teclado.nextInt();
                
                alumnos.put(asignatura, creditos);
            }
        }
        int totalCreditos = 0;
        
        for(String asig: alumnos.keySet()){
            totalCreditos += alumnos.get(asig);
        }
        System.out.println("El numero de creditos que estas cursando es: " + totalCreditos);
    }
}
