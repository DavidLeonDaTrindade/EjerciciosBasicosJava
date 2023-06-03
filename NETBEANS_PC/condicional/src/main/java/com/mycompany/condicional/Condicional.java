/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.condicional;

/**
 *
 * @author David
 */
public class Condicional {
    public static void main(String args[]){
    
        int matematicas =4 ;
        int biologia = 6;
        int quimica = 5;
        int promedio = (matematicas+biologia+quimica)/3;
        
        if (promedio >=6){
           System.out.println("el alumno aprovo " + promedio);
           }
        
        else {
        System.out.println("el alumno suspendio " + promedio);
        }
                
      
            
    }   
}
