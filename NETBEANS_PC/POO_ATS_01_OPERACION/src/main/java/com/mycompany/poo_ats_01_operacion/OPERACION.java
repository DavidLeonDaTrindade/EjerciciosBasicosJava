/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_ats_01_operacion;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class OPERACION {

    //ATRIBUTOS
    
    int suma;
    int resta;
    int multiplicacion;
    float division;

    //METODOS
    //METODO PARA PEDIRLE AL USUARIO DOS NUMEROS
    public void LeerNumeros() {
        //numero1 = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero: "));
       // numero2 = Integer.parseInt(JOptionPane.showInputDialog("Dime el numero 2: "));
    }
    //METODO PARA SUMAR LOS DOS NUMEROS

    public void sumar(int numero1, int numero2) {
        suma = numero1+numero2;
    }

    //METODO PARA LA RESTA DE LOS NUMEROS
    public void resta(int numero1, int numero2) {
        resta = numero1 - numero2;
    }
    //METODO PARA LA MULTIPLICACION DE LOS NUMEROS

    public void multiplicacion(int numero1, int numero2) {
        multiplicacion = numero1 * numero2;
    }
    //METODO PARA LA DIVISION DE LOS NUMEROS

    public void division(int numero1, int numero2) {
        division = numero1 / numero2;
    }
    //METODO PARA MOSTRAR EN PANTALLA
    public void mostrarResultado() {
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La multiplicacion es " + multiplicacion);
        System.out.println("La division es " + division);
    }
}
