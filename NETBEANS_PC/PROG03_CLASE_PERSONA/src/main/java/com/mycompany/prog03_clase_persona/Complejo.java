/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog03_clase_persona;

/**
 *
 * @author David
 */
public class Complejo { //Clase Complejo

    //Declaro las variables que serán tipo double tal y como podemos ver en los métodos constructores
    double real;
    double imag;

    //Constructor que inicializa sus atributos a 0
    public Complejo() {
        real = 0;
        imag = 0;
    }

    //Constructor que inicializa los atributos a los valores indicados por los parámetros.
    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    //Devuelve la parte real del objeto.
    public double consulta_Real() {
        return real;
    }

    //Devuelve la parte imaginaria del objeto.
    public double consulta_Imag() {
        return imag;
    }

    //Asigna a la parte real del objeto el valor indicado en el parámetro real
    public void cambia_Real(double real) {
        this.real = real;
    }

    //Asigna a la parte imaginaria del objeto el valor indicado en el parámetro imag.
    public void cambia_Imag(double imag) {
        this.imag = imag;
    }

    /*Convierte a String el número complejo, mediante la concatenación de sus atributos y devuelve 
     como resultado la cadena de texto 3 + 4i, si 3 es la parte real y 4 la parte imaginaria.*/
    @Override
    public String toString() { //Método predefinido por Java
        return String.format("%.0f + %.0fi", real, imag);
    }

    /*Suma la parte real con la parte real del número complejo b y la parte 
     imaginaria con la parte imaginaria del número complejo b, es decir se suman
    los sumaImag complejos con los que estamos trabajando*/
    public void sumar(Complejo b) {
        double sumaReal;
        double sumaImag;
        sumaReal = b.real + this.real; //Uno es igual al valor de real del objeto pasado como parámetro + el valor de real en la clase(el introducido por teclado)
        sumaImag = b.imag + this.imag; //Dos es igual al valor de imaginario pasado como parámetro + el valor de real en la clase (el introducido por teclado)
        System.out.printf("La parte real (%.2f y %.2f) es igual a %.2f\n", this.real, b.real, sumaReal);
        System.out.printf("La parte imaginaria (%.2f y %.2f) es igual a %.2f\n", this.imag, b.imag, sumaImag);
    }
}
