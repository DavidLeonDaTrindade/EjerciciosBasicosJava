/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_geki_ernesto_fibonacci;

/**
 *
 * @author David
 */
public class EJERCICIO_GEKI_ERNESTO_FIBONACCI {

    public static void main(String[] args) {
       int i = 0,   a = 0, b = 1, c = 0;
        System.out.println("serie con for: ");
        for( i=0;  i<10;  i++){
            if(i < 9) {
                System.out.print(a + ",");
                c = a+b;
                a = b;
                b = c;
            }else{
                System.out.print(a);
            }
        } 
        System.out.println(" ");
        i = 0;
        b = 1;
        a = 0;
        c = 0;
         System.out.println("serie con while: ");
         while(i<10){
              if(i < 9) {
                System.out.print(a + ",");
                c = a+b;
                a = b;
                b = c;
            }else{
                System.out.print(a);
            }
              i++;
         }
          System.out.println(" ");
        i = 0;
        b = 1;
        a = 0;
        c = 0;
        System.out.println("serie con do-while: ");
        do{
             if(i < 9) {
                System.out.print(a + ",");
                c = a+b;
                a = b;
                b = c;
            }else{
                System.out.print(a);
            }
              i++;
        }while(i<10);
    }
}
