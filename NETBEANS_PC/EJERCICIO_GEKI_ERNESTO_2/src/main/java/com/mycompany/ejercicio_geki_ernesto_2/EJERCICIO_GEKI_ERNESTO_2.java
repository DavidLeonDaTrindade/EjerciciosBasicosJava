/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_geki_ernesto_2;

/**
 *
 * @author David
 */
public class EJERCICIO_GEKI_ERNESTO_2 {

    public static void main(String[] args) {
        int i = 1, j = 99;
        
        System.out.println("Serie con for: ");
        for (i = 1; i <= 5; i++){
            if(i < 5){
                System.out.print( i + "," );
                System.out.print( j + "," );
            }else{
                System.out.print(i + ",");
                 System.out.print(j );
            }
            j--;
        }
        System.out.println("");
        
        i = 1;
        j = 99;
        
        System.out.println("Serie con while: ");
        while(i <= 5){
        if(i < 5){
                System.out.print( i + "," );
                System.out.print( j + "," );
            }else{
                System.out.print(i + ",");
                 System.out.print(j );
            }
            i++;
            j--;
        }
        
        System.out.println("");
        
        i = 1;
        j = 99;
        
        System.out.println("Serie con do-while: ");
        
        do{
            if(i < 5){
                System.out.print( i + "," );
                System.out.print( j + "," );
            }else{
                System.out.print(i + ",");
                 System.out.print(j );
            }
            i++;
            j--;
        }while(i <= 5);
    }
}
