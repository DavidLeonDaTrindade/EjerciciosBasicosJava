/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cadenasavanzadas;

/**
 *
 * @author David
 */
public class CadenasAvanzadas {

    public static void main(String[] args) {
        String cadena = "Bienvenido";
        //EL METODO .LENGTH RETORNA UN NUMERO ENTERO CON LA CANTIDAD DE CARACTERES DE LA CADENA INTRODUCIDA
        int longitud = cadena.length();
        System.out.println("La longitud de la palabra son " + longitud + " caracteres");
        //EL METODO CHARAT() RETORNA EL CARACTER UBICADO EN LA POSICION PASADA POR PARAMETROEN EL EJEMPLO DE ABAJO LE HEMOS PASADO EL 0 POR LO TANTO SE CORRESPONDE A LA B
        char x = cadena.charAt(0);
        System.out.println(x);
        //EL METODO SUBSTRING() PERMITE EXTRAER DE LA CADENA LA POSICION QUE NOSOTROS LE PASEMOS POR PARAMETROS
        String subcadena = cadena.substring(0, 5);
        String subcadena1 = cadena.substring(5, 10);
        System.out.print(subcadena);
        System.out.println(subcadena1);
        // AQUI SE ESTA EJECUTANDO EL METODO STRING AUTOMATICAMENTE ESTAMOS PASANDO UNA CADENA A NUMERO
        String cadena2 ="numero cinco " + 5;
        System.out.println(cadena2);
        
        String c="1234.56789";
        double n;
        try{
            n=Double.valueOf(c).doubleValue();
        }catch(NumberFormatException e){
            System.out.println(c);
        }
        
        float precio = 3.3f;
        String salida= String.format("El precio es: %.2f €", precio);
        System.out.println(salida);
    }

}
