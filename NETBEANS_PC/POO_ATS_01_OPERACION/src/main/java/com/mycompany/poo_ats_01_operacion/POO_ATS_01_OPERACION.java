/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.poo_ats_01_operacion;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class POO_ATS_01_OPERACION {

    public static void main(String[] args) {
        //CREACION DEL OBJETO
        //OPERACION op = new OPERACION();
        //LLAMAR A LOS METODOS
        // op.LeerNumeros();
        //op.sumar();
        //op.resta();
        //op.multiplicacion();
        //op.division();
        //op.mostrarResultado();
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Dime otro numero: "));

        OPERACION op = new OPERACION();

        op.sumar(n1, n2);
        op.resta(n1, n2);
        op.multiplicacion(n1, n2);
        op.division(n1, n2);

        op.mostrarResultado();

    }
}
