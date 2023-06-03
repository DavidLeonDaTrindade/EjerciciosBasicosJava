/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.buclediassemana;

/**
 *
 * @author David
 */
public class BucleDiasSemana {

    public static void main(String[] args) {
        String[ ] semana = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};//ARRAY CON LOS DIAS DE LA SEMANA
        for (String dia : semana) {//INICIAMOS EL BUCLE Y LE DECIMOS A DIA QUE INICIE EL ARRAY SEMANA
            System.out.println(dia);//IMPRIMIMOS DIA QUE A SU VEZ LE HEMOS DICHO ARRIBA QUE TIENE QUE ALMACENAR EL ARRAY SEMANA
        }
    }
}
