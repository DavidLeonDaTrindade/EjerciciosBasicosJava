/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.bublefor;

/**
 *
 * @author David
 */
public class BubleFor {

    public static void main(String[] args) {
        for (int i = 5; i <= 100; i += 5) {
            System.out.print(i);
            System.out.print(" ");

        }
        System.out.println("");
        for(int i = 5; i<=100; i++){
            if(i%5 == 0){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
