/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea3_objetos;

/**
 *
 * @author David
 */
public class TAREA3_OBJETOS {

    public static void main(String[] args) {
        Movil ModeloCD = new Movil();
        ModeloCD.proveedor = "Samsung";
        ModeloCD.SO = "Android";
        ModeloCD.t_pantalla = "15x20";
        ModeloCD.teclado = false;
        ModeloCD.ColgarLlamada();
        ModeloCD.EnviarSms();
        System.out.println(ModeloCD.proveedor + " " + ModeloCD.SO);
        System.out.println(ModeloCD.t_pantalla);
    
    }
}
