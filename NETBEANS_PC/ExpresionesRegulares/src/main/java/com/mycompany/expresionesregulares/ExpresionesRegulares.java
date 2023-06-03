/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.expresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author David
 */
public class ExpresionesRegulares {

    public static void main(String[] args) {
       Pattern p=Pattern.compile("[0-9]{8}[A-Z a-z]");
       Matcher m=p.matcher("78631018k");
       
       if (m.matches()){
        System.out.println("Si contiene el mismo patron ");
        }else {
           System.out.println("No contiene el mismo patron");
       }
       
       Pattern l = Pattern.compile("([XY-xy]?)([0-9]{1,9})([A-Za-z])");
       Matcher j=l.matcher("x123456789z y 00110011m 9999999t");
       
       while (j.find()){
           System.out.println("Letra inicial: " + j.group(1));
           System.out.println("Numero: " + j.group(2));
           System.out.println("Letra NIF: "+ j.group(3));
       }

       
    }
    
    
}
