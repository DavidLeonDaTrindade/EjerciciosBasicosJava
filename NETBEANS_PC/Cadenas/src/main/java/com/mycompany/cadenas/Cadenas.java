/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.cadenas;

/**
 *
 * @author David
 */
public class Cadenas {

    public static void main(String[] args) {
        String cadena2 = "hola";
        //EJEMPLO DE CONCATENACION DE CADENA CON EL SIMBOLO +
        String cadena = " Bien" + "venido ";
        System.out.println(cadena);
        //EJEMPLO DE CONCATENACION CON EL METODO CONCAT
        String cadena1 = " Bien".concat("venido ");
        System.out.println(cadena1);
        //EJEMPLO DE TOSTRING DONDE CONVERTIMOS INTEGER A CADENA
        Integer il = new Integer(1234);
        System.out.println("Numero " + il);
        //METODO COMPARETO DONDE PODREMOS COMPROBAR SI LAS CADENAS SON IGUALES MENOS O MAYORES ALFABETICAMENTE COLOCADAS
        System.out.println("La cadena " + cadena + " es " +cadena.compareTo(cadena1) + " por lo tango es igual a la cadena 1");
        //METODO EQUALS DONDE RETORNARA UN TRUE SI LAS CADENAS SON IGUALES Y UN FALSE SI LAS CADENAS SON DIFERENTES
        System.out.println("La cadena " + cadena + " es " +  cadena.equals(cadena1) + " retornara un true si las cadenas son iguales y un false si las cadenas son diferentes" );
       //METODO IGUAL QUE EL COMPARETO PERO NO TENDRA EN CUENTA LAS MAYUSCULAS NI LAS MINUSCULAS
        System.out.println("La cadena " + cadena + " es " + cadena.compareToIgnoreCase(cadena1) + " por lo tanto es igual a la cadena 1  ");
        //METODO PARA ELIMINAR LOS ESPACIOS ANTERIORES Y POSTERIORES DE LA CADENA
        System.out.println(cadena.trim());
        //GENERA UNA COPIA DE LA CADENA PERO CON TODAS LAS LETRAS EN MINUSCULA
        System.out.println(cadena.toLowerCase());
        //GENERA UNA COPIA DE LA CADENA PERO CON TODOS LOS ELEMENTOS EN M,AYUSCULAS
        System.out.println(cadena.toUpperCase());
        //RETORNARA TRUE SI LA CADENA PASADA POR ARGUMENTO ESTA DENTRO ES MUY SIMILIAR AL EQUALS
        System.out.println(cadena.contains(cadena2));
        //RETORNARA TRUE SI LA CADENA PASADA POR ARGUMENTOS EMPIEZA POR LA MISMA CADENA DE CARACTERES QUE LA CADENA A LA QUE APLICAMOS EL METODO
        System.out.println(cadena.startsWith(cadena1));
        //IGUAL QUE EL METODO ANTERIOR PERO CON EL FINAL Y NO CON EL PRINCIPIO
        System.out.println(cadena.endsWith(cadena1));
        //METODO PARA REEMPLAZAR UNA CADENA POR OTRA
        System.out.println(cadena.replace(cadena2, cadena1));
        String cadena3 = new String("Esto es una cadena");
        System.out.println(cadena3);
       //RECORRER CADENA CARACTER A CARACTER
       for(int i = 0; i<cadena3.length(); i++){
           System.out.print(cadena3.charAt(i));
       }
       
    }
}
