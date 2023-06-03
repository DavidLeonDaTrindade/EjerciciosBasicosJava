/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prog02_ejer08;
import java.util.Scanner;//IMPORTAMOS LA LIBRERIA QUE NOS PERMITE ESCANEAR EL TECLADO

/**
 *
 * @author David
 */
public class PROG02_Ejer08 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);//ASIGNAMOS A TECLADO UN NUEVO ESCANER DE LO QUE ESCRIBIREMOS EN UN FUTURO
        double alum_pro = 0;//ASIGNAMOS A LA VARIABLE DOUBLE UN NOMBRE Y UN VALOR
        double alum_edd = 0;//ASIGNAMOS A LA VARIABLE DOUBLE UN NOMBRE Y UN VALOR
        double alum_bd = 0;//ASIGNAMOS A LA VARIABLE DOUBLE UN NOMBRE Y UN VALOR
        double alum_total = 0;//ASIGNAMOS A LA VARIABLE DOUBLE UN NOMBRE Y UN VALOR
        float porcentaje_pro = 0;//ASIGNAMOS A LA VARIABLE FLOAT UN NOMBRE Y UN VALOR
        float porcentaje_edd = 0;//ASIGNAMOS A LA VARIABLE FLOAT UN NOMBRE Y UN VALOR
        float porcentaje_bd = 0;//ASIGNAMOS A LA VARIABLE FLOAT UN NOMBRE Y UN VALOR
        System.out.println("¿cuantos alumnos hay matriculados en programacion?");// PREGUNTAMOS CUANTOS ALUMNOS HAY MATRICULADOS EN PROGRAMACION
        alum_pro = teclado.nextInt();// LA VARIABLE ALUM_PRO ADQUIERE UN VALOR EL QUE NOSOTROS ELEGIMOS EN EL TECLADO
        System.out.println("¿cuantos alumnos hay matriculados en entornos de desarrollo?");//PREGUNTAMOS CUANTOS ALUMNOS HAY MATRICULADOS EN ENTORNOS DE DESARROLLO
        alum_edd = teclado.nextInt();// LA VARIABLE ALUM_EDD ADQUIERE EL VALOR QUE NOSOTROS TECLEAMOS
        System.out.println("¿cuantos alumnos hay matriculados en base de datos?");//PREGUNTAMOS CUANTO ALUMNOS HAY MATRICULADOS EN BASE DE DATOS
        alum_bd = teclado.nextInt();//LA VARIABLE ALUM_BD ADQUIERE EL VALOR QUE NOSOTROS INTRODUCIMOS
        alum_total = alum_pro+alum_edd+alum_bd;//LA VARIABLE ALUM_TOTAL ADQUIERE EL VALOR SUMANDO EL TOTAL DE LOS ALUMNOS MATRICULADOS
        System.out.println("el total de alumnos es "+alum_total);  //IMPRIME EN CONSOLA EL TOTAL DE ALUMNOS MATRICULADOS
        porcentaje_pro = (float) ((alum_pro*100)/alum_total);//PARA MOSTRAR EL PORCENTAJE DE MULTIUPLICA POR 100 Y SE DIVIDE POR EL TOTRAL DE ALUMNOS MATRICULADOS Y TENDRIAMOS EL PORCENTAJE DE PROGRAMACION
        System.out.println("el porcentaje de alumnos matriculados en programacion es: "+porcentaje_pro);//IMPRIMIMOS EL PORCENTAJE DE ALUMNOS MATRICULADOS EN PROGRAMACION
        porcentaje_edd = (float) ((alum_edd*100)/alum_total);//LO MISMO QUE ARRIBA ALUMNOS DE ENTORNO DE DESARROLLO *100 Y / TOTAL ALUMNOS 
        System.out.println("el porcentaje de alumnos matriculados en entornos de desarrollo es: "+porcentaje_edd);
        porcentaje_bd = (float) ((alum_bd*100)/alum_total);
        System.out.println("el porcentaje de alumnos matriculados en base de datos es: "+porcentaje_bd);
    }
}
