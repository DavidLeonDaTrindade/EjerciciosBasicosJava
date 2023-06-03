/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prog02_ejerc06;

/**
 *
 * @author David
 */
public class PROG02_Ejerc06 {
    enum var1{Mastin,Terrier,Bulldog };
    enum var2{Pekines,Caniche,galgo};

    public static void main(String[] args) {
       // var1 raza1 = var1.Bulldog;
       // var2 raza2 = var2.Pekines;
       // System.out.println(raza1);
        //System.out.println(raza2);
        //System.out.println(var1.Bulldog.ordinal());
        //System.out.println(var2.Pekines.ordinal());
        var1[ ] razas = var1.values();
        for (int i = 0; i<razas.length; i++ ) {
            System.out.println((i+1) + "." + razas[i] );
        }
        var2[ ] razas2 = var2.values();
        for (int i = 0; i<razas2.length; i++ ) {
            System.out.println((i+1) + "." + razas2[i] );
        }      
    }
}
