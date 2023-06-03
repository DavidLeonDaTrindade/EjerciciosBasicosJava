/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_geki_equals_1;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class EJERCICIO_GEKI_EQUALS_1 {

    public static void main(String[] args) {
        String nombreUsuario = "" , nombrePass = "";//DECLARAMOS LAS VARIABLES DE TIPO STRING
        Scanner teclado = new Scanner(System.in);// INDICAMOS AL SISTEMA QUE VAMOS A HACER USO DEL SCANNER TECLADO
        
        System.out.print("Por favor ingresa el nombre de usuario: ");//SOLICITAMOS AL USUARIO EL NOMBRE DE USUARIO
        nombreUsuario = teclado.nextLine();//ALMACENAMOS EN NOMBREUSUARIO EL VALOR QUE INTRODUCE EL USUARIO
        
        System.out.print("Por favor ingresa tu contraseña: ");//PEDIMOS AL USUARIO EL VALOR DE CONTRASEÑA
        nombrePass = teclado.nextLine();// ALMACENAMOS EN NOMBREPASS EL VALOR QUE EL USUARIO INTRODUCE CON EL TECLADO
        
        if(nombreUsuario.equals("david") && nombrePass.equals("1234") ){//DECIMOS AL PROGRAMA QUE SI EL NOMBRE DE USUARIO ES david Y LA CONTRASEÑA ES 1234 NOS MANDE UN MENSAJE DE INICIO CORRECTO
            System.out.println("inicio de sesion correcto");//IMPRIME POR PANTALLA INICIO DE SESION CORRECTO
        }else//SI ALGUNO DE LOS VALORES ANTERIORES NO SE CUMPLE SE IMPRIME QUE EL INICIO DE LA SESION ES INCORRECTO
            System.out.println("tu nombre de usuario o contraseña son incorreectos");//IMPRIME EN PANTALLA QUE LOS VALORES INTRODUCIDOS POR EL USUARIO SON INCORRECTOS
    }
}
